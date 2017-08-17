package com.exercise.stock.explorestocks;

import com.exercise.stock.explorestocks.Domain.Company;
import com.exercise.stock.explorestocks.Services.CompanyService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ExplorestocksApplication implements CommandLineRunner {

	@Autowired
	private CompanyService companyService;

	public static void main(String[] args) {
		SpringApplication.run(ExplorestocksApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Company>> mapType = new TypeReference<List<Company>>() {};
		InputStream is = TypeReference.class.getResourceAsStream("/exploreStocks.json");

			List<Company> companyList = mapper.readValue(is,mapType);
			for(Company c: companyList) {
				companyService.createCompany(c);
				System.out.println("Successful");
			}
		}
	}



