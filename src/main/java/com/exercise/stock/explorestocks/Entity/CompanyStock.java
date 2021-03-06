package com.exercise.stock.explorestocks.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class CompanyStock implements Serializable {

    @Id
    private String id;
    @Column
    private String companyCode;
    @Column
    private String companyName;
    @Column
    private String ceoName;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Stock> stockData=null;

    public List<Stock> addstockData(){
        if(stockData==null){
            stockData= new ArrayList<>();
            return stockData;
        }else{
            return stockData;
        }

    }

    public CompanyStock(){}

    public CompanyStock(String companyCode, String companyName, String ceoName){
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.ceoName = ceoName;
    }


}
