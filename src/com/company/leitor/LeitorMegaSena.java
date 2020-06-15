//package com.company.leitor;
//
//import com.company.model.MegaSena;
//
//import java.io.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class LeitorMegaSena {
//
//    private List<MegaSena> jogosMega = new ArrayList<>();
//
//    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//    private Map<String, Integer> numeroOcorrencia = new HashMap<String, Integer>();
//
//
//    public void lerCincoMaiores() throws NumberFormatException, ParseException {
//
//        try (BufferedReader br = new BufferedReader(
//                new FileReader(System.getProperty("user.dir") + "\\mega.csv"))) {
//
//            String linha = br.readLine();
//
//            while (linha != null) {
//
//                String[] dadosLinha = linha.split(",");
//
//                MegaSena ms = new MegaSena(Integer.parseInt(dadosLinha[0]), sdf.parse(dadosLinha[1]));
//
//                for (int i = 2; i < dadosLinha.length; i++) {
//                    ms.getNumeros().add(dadosLinha[i]);
//                }
//
//                jogosMega.add(ms);
//
//                linha = br.readLine();
//            }
//
//
//            for (MegaSena megaSena : jogosMega) {
//                for (String megaSenaNumeros : megaSena.getNumeros()) {
//                    if (numeroOcorrencia.containsKey(megaSenaNumeros)) {
//                        numeroOcorrencia.put(megaSenaNumeros, numeroOcorrencia.get(megaSenaNumeros) + 1);
//
//                    } else {
//                        numeroOcorrencia.put(megaSenaNumeros, 1);
//                    }
//                }
//            }
//
//
//            List<Map.Entry<String, Integer>> topCinco = numeroOcorrencia.entrySet().stream().limit(5)
//                    .collect(Collectors.toList());
//
//
//            System.out.println("5 números que mais saíram: " + topCinco);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
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
//                MegaSena ms = new MegaSena(Integer.parseInt(dadosLinha[0]), sdf.parse(dadosLinha[1]));
//
//                for (int i = 2; i < dadosLinha.length; i++) {
//                    ms.getNumeros().add(dadosLinha[i]);
//                }
//
//                jogosMega.add(ms);
//
//                linha = br.readLine();
//            }
//
//
//            for (MegaSena megaSena : jogosMega) {
//                for (String megaSenaNumeros : megaSena.getNumeros()) {
//                    if (numeroOcorrencia.containsKey(megaSenaNumeros)) {
//                        numeroOcorrencia.put(megaSenaNumeros, numeroOcorrencia.get(megaSenaNumeros) + 1);
//
//                    } else {
//                        numeroOcorrencia.put(megaSenaNumeros, 1);
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
//
//}
//
