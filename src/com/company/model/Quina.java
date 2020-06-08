package com.company.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quina {

    private Integer id;
    private Date data;

    private List<String> numeros = new ArrayList<>();

    public Quina(Integer id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<String> getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "Quina [id=" + id + ", data=" + data + ", numeros=" + numeros + "]";
    }

}