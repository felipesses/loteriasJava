//package com.company.leitor;
//
//import com.company.model.LotoFacil;
//
//import java.io.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class LeitorLotofacil {
//
//    private List<LotoFacil> jogosLoto = new ArrayList<>();
//
//    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//    private Map<String, Integer> numeroOcorrencia = new HashMap<String, Integer>();
//
//
//    public void lerCincoMaiores() throws NumberFormatException, ParseException {
//
//        try (BufferedReader br = new BufferedReader(
//                new FileReader(System.getProperty("user.dir") + "\\lotofacil.csv"))) {
//
//            String linha = br.readLine();
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
//            // >>>>>> Falta ordenar por numero de computacoes dos numeros <<<<<<
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
//
//}
//
