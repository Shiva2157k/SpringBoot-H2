package com.exercise.stock.explorestocks.Services;

import com.exercise.stock.explorestocks.Domain.Company;
import com.exercise.stock.explorestocks.Repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company){

            companyRepository.save(company);

        return null;
    }

    public Iterable<Company> findCompanies(){
        return companyRepository.findAll();
    }

    public long findTotalCompanies(){
        return companyRepository.count();
    }
}
