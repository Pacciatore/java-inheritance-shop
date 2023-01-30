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
				televisore(s);
				break;

			case 3:
				cuffie(s);
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

		System.out.println("Inserire aliquota IVA: ");
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

	public static void televisore(Scanner s) {

		System.out.println("------------------------------------------------");
		System.out.println("Registrazione Televisore");
		System.out.println();

		System.out.println("Inserire nome prodotto: ");
		String productName = s.nextLine();

		System.out.println("Inserire marchio: ");
		String productBrand = s.nextLine();

		System.out.println("Inserire prezzo: ");
		float productPrice = Float.parseFloat(s.nextLine());

		System.out.println("Inserire aliquota IVA: ");
		int productVat = Integer.parseInt(s.nextLine());

		System.out.println("Inserire grandezza in pollici: ");
		float productInches = Float.parseFloat(s.nextLine());

		System.out.println("Smart TV? (S/N): ");
		String smartTvChoice = s.nextLine();
		boolean productSmartTv = false;
		if (smartTvChoice.toLowerCase().equals("s"))
			productSmartTv = true;
		else
			productSmartTv = false;

		Televisore tv = new Televisore(productName, productBrand, productPrice, productVat, productInches,
				productSmartTv);

		System.out.println("------------------------------------------------");

		System.out.println("Riepilogo dati inseriti: ");

		System.out.println("Nome: " + tv.getName());
		System.out.println("Marchio: " + tv.getBrand());
		System.out.println("Prezzo: " + tv.getPriceFormatted() + "€");
		System.out.println("IVA: " + tv.getVat() + "%");
		System.out.println("Grandezza: " + tv.getInches() + "\"");
		if (tv.isSmartTv())
			System.out.println("Smart TV");
		else
			System.out.println("Non Smart TV");

		System.out.println("------------------------------------------------");

	}

	public static void cuffie(Scanner s) {

		System.out.println("------------------------------------------------");
		System.out.println("Registrazione Cuffie");
		System.out.println();

		System.out.println("Inserire nome prodotto: ");
		String productName = s.nextLine();

		System.out.println("Inserire marchio: ");
		String productBrand = s.nextLine();

		System.out.println("Inserire prezzo: ");
		float productPrice = Float.parseFloat(s.nextLine());

		System.out.println("Inserire aliquota IVA: ");
		int productVat = Integer.parseInt(s.nextLine());

		System.out.println("Inserire colore: ");
		String productColor = s.nextLine();

		System.out.println("Con cavo? (S/N): ");
		String smartTvChoice = s.nextLine();
		boolean productWired = false;
		if (smartTvChoice.toLowerCase().equals("s"))
			productWired = true;
		else
			productWired = false;

		Cuffie cuffie = new Cuffie(productName, productBrand, productPrice, productVat, productColor, productWired);

		System.out.println("------------------------------------------------");

		System.out.println("Riepilogo dati inseriti: ");

		System.out.println("Nome: " + cuffie.getName());
		System.out.println("Marchio: " + cuffie.getBrand());
		System.out.println("Prezzo: " + cuffie.getPriceFormatted() + "€");
		System.out.println("IVA: " + cuffie.getVat() + "%");
		System.out.println("Colore: " + cuffie.getColor());
		if (cuffie.isWired())
			System.out.println("Con cavo");
		else
			System.out.println("Wireless");

		System.out.println("------------------------------------------------");

	}

}
