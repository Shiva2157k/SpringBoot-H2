package com.exercise.stock.explorestocks.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Company implements Serializable {

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

    public Company(){}

    public Company(String companyCode, String companyName, String ceoName){
        this.id= UUID.randomUUID().toString();
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.ceoName = ceoName;
    }


}
