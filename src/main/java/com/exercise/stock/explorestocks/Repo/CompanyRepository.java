package com.exercise.stock.explorestocks.Repo;

import com.exercise.stock.explorestocks.Domain.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,String> {
}
