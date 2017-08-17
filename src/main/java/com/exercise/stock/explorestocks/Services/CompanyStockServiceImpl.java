package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Entity.CompanyStock;
import com.exercise.stock.explorestocks.Repo.CompanyRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

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
        fileWriterService.fileWriter();

        return  companyStocks;
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
