package com.example.buscacep.model;

import com.orm.SugarRecord;

import java.io.Serializable;

public class Cep extends SugarRecord<Cep> implements Serializable {

    private static final long serialVersionUID = 2154707471809049432L;

    private Integer cep;

    public Cep(){}

    public Cep(Integer cep){
        this.cep = cep;
    }

    public Integer getCep() {
        return cep;
    }

}
