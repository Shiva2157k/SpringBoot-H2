package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.Stock;
import com.exercise.stock.explorestocks.Repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    private StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Iterable<Stock> findStocksByCompanyId(String companyId) {
        return stockRepository.findAllByCompany_CompanyCode(companyId);
    }
}
