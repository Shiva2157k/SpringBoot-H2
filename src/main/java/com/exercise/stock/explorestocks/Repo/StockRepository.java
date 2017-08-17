package com.exercise.stock.explorestocks.Repo;


import com.exercise.stock.explorestocks.Entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,String> {
    Iterable<Stock> findAllByCompany_CompanyCode(String companyCode);
}
