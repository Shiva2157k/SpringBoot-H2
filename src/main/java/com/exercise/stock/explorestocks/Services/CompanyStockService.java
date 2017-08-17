package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.CompanyStock;

public interface CompanyStockService {
    public Iterable<CompanyStock>  addCompanyStock(Iterable<CompanyStock> companyStock);
    public Iterable<CompanyStock> findCompanies();
    public long findTotalCompanies();
    public Iterable<CompanyStock> findStocksByCompanyId(String companyId);
}
