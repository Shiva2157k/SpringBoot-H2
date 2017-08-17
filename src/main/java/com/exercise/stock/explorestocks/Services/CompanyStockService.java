package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.CompanyStock;
import com.exercise.stock.explorestocks.Entity.Stock;

public interface CompanyStockService {
    public Iterable<CompanyStock>  addCompanyStock(Iterable<CompanyStock> companyStock);
    public Iterable<CompanyStock> findCompanies();
    public long findTotalCompanies();

    public Iterable<Stock> findStocksByCompanyId(String companyId);
}
