package com.company.view;

public class MenuLoteria {

    public void menuLoteria() {
        System.out.println("*************************************************************************************************");
        System.out.println("* 1- Mega-Sena                                                                                  *");
        System.out.println("* 2- Quina                                                                                      *");
        System.out.println("* 3- Lotofácil                                                                                  *");
        System.out.println("* 9- Sair                                                                                       *");
        System.out.println("*************************************************************************************************");

        System.out.print("Digite uma opção acima: ");
    }

    public void subMenuLoteria() {
        System.out.println(" 1- 5 números que mais saíram");
        System.out.println(" 2- 5 números que menos saíram");
        System.out.println(" 3- Gerar números randômicos");
        System.out.println(" 4- Verificar meu jogo");
    }
}
