/*package com.exercise.stock.explorestocks.Controllers;

import com.exercise.stock.explorestocks.Domain.Company;
import com.exercise.stock.explorestocks.Domain.Stock;
import com.exercise.stock.explorestocks.Services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StockController {

    private StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @RequestMapping(value = "/save/stock" ,method = RequestMethod.GET)
    public void saveStockData(){

        Company company = new Company("app","Apple","Bill Jobs");
         Stock stock = new Stock("2345", "TD", "last","$44.56",30, new Date() );
    }
    @RequestMapping(value = "/get/stock" ,method = RequestMethod.GET)
    public @ResponseBody Iterable<Stock> getStock(){
        return stockService.getStock();
    }
}*/
