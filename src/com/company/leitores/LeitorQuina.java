package com.company.leitores;

import com.company.model.LotoFacil;
import com.company.model.MegaSena;
import com.company.model.Quina;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class LeitorQuina {

    private List<Quina> jogosQuina = new ArrayList<>();

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Map<String, Integer> numeroOcorrencia = new HashMap<String, Integer>();


    public void lerCincoMaiores() throws NumberFormatException, ParseException {

        try (BufferedReader br = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "\\quina.csv"))) {

            String linha = br.readLine();

            while (linha != null) {

                String[] dadosLinha = linha.split(",");

                Quina qn = new Quina(Integer.parseInt(dadosLinha[0]), sdf.parse(dadosLinha[1]));

                for (int i = 2; i < dadosLinha.length; i++) {
                    qn.getNumeros().add(dadosLinha[i]);
                }

                jogosQuina.add(qn);

                linha = br.readLine();
            }


            for (Quina quina : jogosQuina) {
                for (String quinaNumeros : quina.getNumeros()) {
                    if (numeroOcorrencia.containsKey(quinaNumeros)) {
                        numeroOcorrencia.put(quinaNumeros, numeroOcorrencia.get(quinaNumeros) + 1);

                    } else {
                        numeroOcorrencia.put(quinaNumeros, 1);
                    }
                }
            }


            List<Map.Entry<String, Integer>> topCinco = numeroOcorrencia.entrySet().stream().limit(5)
                    .collect(Collectors.toList());


            System.out.println("5 números que mais saíram: " + topCinco);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void lerCincoMenores() throws NumberFormatException, ParseException {


        try (BufferedReader br = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "\\quina.csv"))) {


            String linha = br.readLine();


            while (linha != null) {

                String[] dadosLinha = linha.split(",");

                Quina qn = new Quina(Integer.parseInt(dadosLinha[0]), sdf.parse(dadosLinha[1]));

                for (int i = 2; i < dadosLinha.length; i++) {
                    qn.getNumeros().add(dadosLinha[i]);
                }

                jogosQuina.add(qn);

                linha = br.readLine();
            }


            for (Quina quina : jogosQuina) {
                for (String quinaNumeros : quina.getNumeros()) {
                    if (numeroOcorrencia.containsKey(quinaNumeros)) {
                        numeroOcorrencia.put(quinaNumeros, numeroOcorrencia.get(quinaNumeros) + 1);

                    } else {
                        numeroOcorrencia.put(quinaNumeros, 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> ultimosCinco = numeroOcorrencia.entrySet().stream()
                    .collect(Collectors.toList()).subList(numeroOcorrencia.size() - 5, numeroOcorrencia.size());

            System.out.println("5 números que menos saíram: " + ultimosCinco);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

