package com.exercise.stock.explorestocks.Controllers;

import com.exercise.stock.explorestocks.Entity.Company;
import com.exercise.stock.explorestocks.Services.CompanyStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stock")
        public class CompanyStockController {

    private CompanyStockService companyStockService;

    @Autowired
    public CompanyStockController(CompanyStockService companyStockService) {
        this.companyStockService = companyStockService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Iterable<Company> save(@RequestBody Iterable<Company> companyStocks){
       return companyStockService.addCompanyStock(companyStocks);
      /*  Company company = new Company("APP","Apple","Bill Jobs");
        company.setId(UUID.randomUUID().toString());
        Stock stock = new Stock(UUID.randomUUID().toString(), "A", "vsd","$50.56",300, new Date(), company);
        company.addstockData().add(stock);
        companyStockService.createCompany(company);
        System.out.println(1);
        Stock stock1 = new Stock(UUID.randomUUID().toString(), "A", "lsd","$45.56",400, new Date(), company);
        company.addstockData().add(stock1);
        companyStockService.createCompany(company);
        System.out.println(2);*/

    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<Company> getCompanies(){
        return companyStockService.findCompanies();
    }

    @RequestMapping(value="/{companyId}",method = RequestMethod.GET)
    public @ResponseBody Iterable<Company> getStocksByCompanyId(@PathVariable("companyId") String companyId){
        return companyStockService.findStocksByCompanyId(companyId);
    }


}
