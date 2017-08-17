package com.exercise.stock.explorestocks.Controllers;

import com.exercise.stock.explorestocks.Domain.Company;
import com.exercise.stock.explorestocks.Domain.Stock;
import com.exercise.stock.explorestocks.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CompanyController {

    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(value = "/save" ,method = RequestMethod.GET)
    public void save(){
        Company company = new Company("APP","Apple","Bill Jobs");
        Stock stock = new Stock("0123", "A", "vsd","$50.56",300, new Date(),company);
        company.addstockData().add(stock);
        companyService.createCompany(company);
        System.out.println(1);
        Stock stock1 = new Stock("0124", "A", "lsd","$45.56",400, new Date(),company);
        company.addstockData().add(stock1);
        companyService.createCompany(company);
        System.out.println(2);

    }

    @RequestMapping(value = "/find" ,method = RequestMethod.GET)
    public @ResponseBody Iterable<Company> getCompanies(){
        return companyService.findCompanies();
    }
}
