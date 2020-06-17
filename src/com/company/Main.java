package com.company;

import com.company.leitor.LeitorLoteria;
import com.company.view.MenuLoteria;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static Scanner teclado;



	public static void lerMegaSena(int opcSubMenu) throws ParseException {

		LeitorLoteria leitorLoteria = new LeitorLoteria();

		if (opcSubMenu == 1) {
			leitorLoteria.lerCincoMaiores();
		}

//		if (opcSubMenu == 2) {
//			leitorMegaSena.lerCincoMenores();
//		}

		if (opcSubMenu == 3) {
			System.out.println("Gerar números randômicos");
		}
	}

	public static void lerQuina(int opcSubMenu) throws ParseException {

		LeitorLoteria leitorLoteria = new LeitorLoteria();

		if (opcSubMenu == 1) {
			leitorLoteria.lerCincoMaiores();
		}

//		if (opcSubMenu == 2) {
//			leitorQuina.lerCincoMenores();
//		}

		if (opcSubMenu == 3) {
			System.out.println("Gerar números randômicos");
		}
	}


	public static void lerLotofacil(int opcSubMenu) throws ParseException {

		LeitorLoteria leitorLoteria = new LeitorLoteria();

		if (opcSubMenu == 1) {
			leitorLoteria.lerCincoMaiores();
		}

//		if (opcSubMenu == 2) {
//			leitorLotofacil.lerCincoMenores();
//		}

		if (opcSubMenu == 3) {
			System.out.println("Gerar números randômicos");
		}
	}


	public static void main(String[] args) throws ParseException {

		teclado = new Scanner(System.in);
		MenuLoteria menu = new MenuLoteria();

		int opcMenu;
		int opcSubMenu;

		do {

			menu.menuLoteria();
			opcMenu = teclado.nextInt();
			teclado.nextLine();

			switch (opcMenu) {
				case 1:
					menu.subMenuLoteria();
					opcSubMenu = teclado.nextInt();

					lerMegaSena(opcSubMenu);

					break;
				case 2:

					menu.subMenuLoteria();

					opcSubMenu = teclado.nextInt();

					lerQuina(opcSubMenu);

					break;
				case 3:

					menu.subMenuLoteria();

					opcSubMenu = teclado.nextInt();

					lerLotofacil(opcSubMenu);

					break;

                case 9:
                    System.out.println("Obrigado!");

                    break;

			}


		} while (opcMenu != 9);


	}


}
