package com.exercise.stock.explorestocks.Repo;


import com.exercise.stock.explorestocks.Entity.CompanyStock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyStock,String> {

    @Query("SELECT DISTINCT c.companyCode  FROM CompanyStock c")
    Iterable<String> findDistinctCompanyCode();
}
