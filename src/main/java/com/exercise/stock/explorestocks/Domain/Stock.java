package com.exercise.stock.explorestocks.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Stock implements Serializable {

    @Id
    private String stockID;
    @Column
    private String ticker;
    @Column
    private String quoteType;
    @Column
    private String price;
    @Column
    private int size;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date timeStamp;

    @ManyToOne
    @JoinColumn(name = "companyCode", nullable = false)
    @JsonBackReference
    private Company company;

    protected Stock(){}

    public Stock(String stockID,String ticker,String quoteType, String price, int size, Date timeStamp, Company company){

        this.stockID = stockID;
        this.ticker = ticker;
        this.quoteType = quoteType;
        this.price = price;
        this.size = size;
        this.timeStamp = timeStamp;
        this.company = company;
    }
}
