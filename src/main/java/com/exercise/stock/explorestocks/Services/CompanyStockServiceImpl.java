package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.CompanyStock;
import com.exercise.stock.explorestocks.Repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyStockServiceImpl implements CompanyStockService{

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyStockServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Iterable<CompanyStock> addCompanyStock(Iterable<CompanyStock>  companyStock){
          return  companyRepository.save(companyStock);
    }

    public Iterable<CompanyStock> findCompanies(){
        return companyRepository.findAll();
    }

    public long findTotalCompanies(){
        return companyRepository.count();
    }

    @Override
    public Iterable<CompanyStock> findStocksByCompanyId(String companyId) {

        return companyRepository.findAllByCompanyCode(companyId);
    }
}
