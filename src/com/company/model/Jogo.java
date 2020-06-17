package com.company.model;
import com.company.Enum.JogoEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogo {

    private Integer id;
    private Date data;
    private JogoEnum jogoEnum;

    private List<String> numeros = new ArrayList<>();

    public Jogo(Integer id, Date data) {
        this.id = id;
        this.data = data;
        if(numeros.size() == 5) this.jogoEnum = jogoEnum.QUINA;
        else if(numeros.size() == 6) this.jogoEnum = jogoEnum.MEGA;
        else if(numeros.size() == 15) this.jogoEnum = jogoEnum.LOTO;

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
        return "Jogo[id=" + id + ", data=" + data + ", numeros=" + numeros + ", Jogo=" + jogoEnum + "]";
    }

}