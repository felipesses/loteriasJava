package com.company.view;

import java.util.ArrayList;
import java.util.List;

import com.company.Enum.KeyJogo;
import com.company.Main;
import com.company.view.MenuLoteria;

public class SubMenu {
    public static void submenu(KeyJogo jogoKey) {

        MenuLoteria dadosJogos = new MenuLoteria(jogoKey);

        boolean continuar = true;
        do {
            System.out.println("\n\n1 - 5 numeros que mais sairam" + "\n2 - 5 numeros que menos si�ram"
                    + "\n3 - Gerar numeros randomicos" + "\n4 - Verificar meu jogo" + "\n9 - sair"
                    + "\n\nDigite sua opcao:");
            switch (Main.sc.nextInt()) {
                case 1:
                    dadosJogos.topFive();
                    break;

                case 2:
                    dadosJogos.lastFive();
                    break;

                case 3:
                    dadosJogos.gerarRandomico();
                    break;
                case 4:
                    String n;
                    do {
                        System.out.println("Digite um numero com "
                                + Main.jogosMap.get(jogoKey).get(0).getNumeros().size() * 2 + " digitos:");
                        n = Main.sc.next();
                    } while (n.length() != (Main.jogosMap.get(jogoKey).get(0).getNumeros().size() * 2));

                    List<String> numeros = new ArrayList<String>();

                    for (int i = 2; i < n.length() + 1; i += 2) {
                        numeros.add(n.substring(i - 2, i));
                    }
                    System.out.println(numeros);
                    dadosJogos.realizarJogo(numeros);
                    break;
                case 9:
                    continuar = false;
                    break;

                default:
                    System.out.println("Nao encontrado");
            }
        } while (continuar);
    }
}
