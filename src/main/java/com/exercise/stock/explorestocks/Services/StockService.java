package com.exercise.stock.explorestocks.Services;


import com.exercise.stock.explorestocks.Entity.Stock;
import com.exercise.stock.explorestocks.Repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface StockService {


    public Iterable<Stock> findStocksByCompanyId(String companyId);


}
