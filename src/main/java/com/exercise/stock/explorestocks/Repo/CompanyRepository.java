package com.exercise.stock.explorestocks.Repo;

import com.exercise.stock.explorestocks.Entity.CompanyStock;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyStock,String> {
     Iterable<CompanyStock> findAllByCompanyCode(String companyId);
}
