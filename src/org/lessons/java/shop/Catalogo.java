package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {

		int nProdotti = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("Inserire numero di prodotti da inserire nel catalogo: ");

		nProdotti = s.nextInt();
		s.nextLine();

		Prodotto[] catalogue = new Prodotto[nProdotti];

		menu(s, catalogue);

		s.close();

	}

	public static void menu(Scanner s, Prodotto[] catalogue) {

		int choice = 0;

		for (int i = 0; i < catalogue.length; i++) {

			System.out.println("Scegliere il tipo di prodotto da aggiungere: ");
			System.out.println("1. Smartphone");
			System.out.println("2. Televisore");
			System.out.println("3. Cuffie");
			System.out.println("4. Finire l'inserimento");

			choice = s.nextInt();
			s.nextLine();

			switch (choice) {

			case 1:
				smartphone(s);
				break;

			case 2:
				System.out.println("Televisore");
				break;

			case 3:
				System.out.println("Cuffie");
				break;

			default:
				System.out.println("Inserire un numero compreso tra 1 e 3.");
				break;
			}

		}

		System.out.println("Fine inserimento dati");

	}

	public static void smartphone(Scanner s) {

		System.out.println("------------------------------------------------");
		System.out.println("Registrazione Smartphone");
		System.out.println();

		System.out.println("Inserire nome prodotto: ");
		String productName = s.nextLine();

		System.out.println("Inserire marchio: ");
		String productBrand = s.nextLine();

		System.out.println("Inserire prezzo: ");
		float productPrice = Float.parseFloat(s.nextLine());

		System.out.println("Inserire percentuale IVA: ");
		int productVat = Integer.parseInt(s.nextLine());

		System.out.println("Inserire codice IMEI: ");
		int productImei = Integer.parseInt(s.nextLine());

		System.out.println("Inserire capacità di memoria: ");
		double productMemoryCapacity = Double.parseDouble(s.nextLine());

		Smartphone smartphone = new Smartphone(productName, productBrand, productPrice, productVat, productImei,
				productMemoryCapacity);

		System.out.println("------------------------------------------------");

		System.out.println("Riepilogo dati inseriti: ");

		System.out.println("Nome: " + smartphone.getName());
		System.out.println("Marchio: " + smartphone.getBrand());
		System.out.println("Prezzo: " + smartphone.getPriceFormatted() + "€");
		System.out.println("IVA: " + smartphone.getVat() + "%");
		System.out.println("Codice IMEI: " + smartphone.getImei());
		System.out.println("Capacità di memoria: " + smartphone.getMemoryCapacity() + "GB");

		System.out.println("------------------------------------------------");

	}

}
