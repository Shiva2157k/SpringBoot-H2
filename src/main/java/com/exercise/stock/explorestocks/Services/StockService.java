/*
package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Domain.Stock;
import com.exercise.stock.explorestocks.Repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock createStocks(Stock stock){
        if(!stockRepository.exists(stock.getStockID())){

            stockRepository.save(stock);
        }
        return null;
    }

    public Iterable<Stock> getStock(){
        return stockRepository.findAll();
    }
}
*/
