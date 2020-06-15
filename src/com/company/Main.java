package com.company;

import com.company.leitor.LeitorLotofacil;
import com.company.leitor.LeitorMegaSena;
import com.company.leitor.LeitorQuina;
import com.company.view.MenuLoteria;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static Scanner teclado;


	public static void lerMegaSena(int opcSubMenu) throws ParseException {

        LeitorMegaSena leitorMegaSena = new LeitorMegaSena();

		if (opcSubMenu == 1) {
			leitorMegaSena.lerCincoMaiores();
		}

		if (opcSubMenu == 2) {
			leitorMegaSena.lerCincoMenores();
		}

		if (opcSubMenu == 3) {
			System.out.println("Gerar números randômicos");
		}
	}

	public static void lerQuina(int opcSubMenu) throws ParseException {

        LeitorQuina leitorQuina = new LeitorQuina();
		if (opcSubMenu == 1) {
			leitorQuina.lerCincoMaiores();
		}

		if (opcSubMenu == 2) {
			leitorQuina.lerCincoMenores();
		}

		if (opcSubMenu == 3) {
			System.out.println("Gerar números randômicos");
		}
	}


	public static void lerLotofacil(int opcSubMenu) throws ParseException {

		LeitorLotofacil leitorLotofacil = new LeitorLotofacil();

		if (opcSubMenu == 1) {
			leitorLotofacil.lerCincoMaiores();
		}

		if (opcSubMenu == 2) {
			leitorLotofacil.lerCincoMenores();
		}

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
