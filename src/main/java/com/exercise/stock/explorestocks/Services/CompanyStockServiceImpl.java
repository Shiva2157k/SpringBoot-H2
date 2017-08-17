package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.CompanyStock;
import com.exercise.stock.explorestocks.Repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyStockServiceImpl implements CompanyStockService{

    private CompanyRepository companyRepository;

  
    private FileWriterService fileWriterService;

    @Autowired
    public CompanyStockServiceImpl(CompanyRepository companyRepository, FileWriterService fileWriterService) {
        this.companyRepository = companyRepository;
        this.fileWriterService = fileWriterService;
    }

    public Iterable<CompanyStock> addCompanyStock(Iterable<CompanyStock>  companyStock){

        Iterable<CompanyStock> companyStocks = companyRepository.save(companyStock);
        System.out.println("before");
        fileWriterService.fileWriter();
        System.out.println("after");

        return  companyStocks;
    }

    public Iterable<CompanyStock> findCompanies(){
        return companyRepository.findAll();
    }

    public long findTotalCompanies(){
        return companyRepository.count();
    }



    @Override
    public Iterable<String> findCompanyCodes() {
        return companyRepository.findDistinctCompanyCode();
 
    }


}
