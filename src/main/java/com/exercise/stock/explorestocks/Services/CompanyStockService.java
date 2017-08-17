package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.CompanyStock;
import com.exercise.stock.explorestocks.Entity.Stock;

public interface CompanyStockService {
    Iterable<CompanyStock> addCompanyStock(Iterable<CompanyStock> companyStock);

    Iterable<CompanyStock> findCompanies();

    long findTotalCompanies();

    Iterable<String> findCompanyCodes();
}
