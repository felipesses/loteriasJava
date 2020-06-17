package com.company.leitor;

import com.company.model.Jogo;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class LeitorLoteria {

//    private List<LotoFacil> jogosLoto = new ArrayList<>();
//    private List<MegaSena> jogosMega = new ArrayList<>();
//    private List<Quina> jogosQuina = new ArrayList<>();
    private List<Jogo> jogosList = new ArrayList<>();

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Map<String, Integer> numeroOcorrencia = new HashMap<String, Integer>();

    String caminho[] = {"lotofacil.csv", "megasena.csv", "quina.csv"};



    public void lerCincoMaiores() throws NumberFormatException, ParseException {



        for (int i = 0; i < 3; i++) {

            try (BufferedReader br = new BufferedReader(
                    new FileReader(System.getProperty("user.dir") + "\\" + caminho[i]))) {


                String linha = br.readLine();

                while (linha != null) {
                    String[] dadosLinha = linha.split(",");

                    Jogo jogo = new Jogo(Integer.parseInt(dadosLinha[0]), sdf.parse(dadosLinha[1]));

                    for (int j = 2; j < dadosLinha.length; j++) {
                        jogo.getNumeros().add(dadosLinha[j]);
                    }


                    jogosList.add(jogo);

                    linha = br.readLine();

                    for (Jogo jogos : jogosList) {
                        for (String jogosNumeros : jogos.getNumeros()) {
                            if (numeroOcorrencia.containsKey(jogosNumeros)) {
                                numeroOcorrencia.put(jogosNumeros, numeroOcorrencia.get(jogosNumeros) + 1);
                            } else {
                                numeroOcorrencia.put(jogosNumeros, 1);
                            }
                        }
                    }

                    // PEGANDO OS 5 MAIOIRES NUMEROS

                    List<Map.Entry<String, Integer>> topCinco = numeroOcorrencia.entrySet().stream().limit(5)
                            .collect(Collectors.toList());

                    System.out.println("5 números que mais saíram: " + topCinco);


                }



            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}



//    public void lerCincoMenores() throws NumberFormatException, ParseException {
//
//
//        try (BufferedReader br = new BufferedReader(
//                new FileReader(System.getProperty("user.dir") + "\\lotofacil.csv"))) {
//
//
//            String linha = br.readLine();
//
//
//            while (linha != null) {
//
//                String[] dadosLinha = linha.split(",");
//
//                LotoFacil lf = new LotoFacil(Integer.parseInt(dadosLinha[0]), sdf.parse(dadosLinha[1]));
//
//                for (int i = 2; i < dadosLinha.length; i++) {
//                    lf.getNumeros().add(dadosLinha[i]);
//                }
//
//                jogosLoto.add(lf);
//
//                linha = br.readLine();
//            }
//
//
//            for (LotoFacil lotoFacil : jogosLoto) {
//                for (String lotoFacilNumeros : lotoFacil.getNumeros()) {
//                    if (numeroOcorrencia.containsKey(lotoFacilNumeros)) {
//                        numeroOcorrencia.put(lotoFacilNumeros, numeroOcorrencia.get(lotoFacilNumeros) + 1);
//
//                    } else {
//                        numeroOcorrencia.put(lotoFacilNumeros, 1);
//                    }
//                }
//            }
//
//            List<Map.Entry<String, Integer>> ultimosCinco = numeroOcorrencia.entrySet().stream()
//                    .collect(Collectors.toList()).subList(numeroOcorrencia.size() - 5, numeroOcorrencia.size());
//
//            System.out.println("5 números que menos saíram: " + ultimosCinco);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



