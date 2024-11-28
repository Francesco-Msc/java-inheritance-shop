package org.lessons.java.cart;

import java.util.Scanner;

import org.lessons.java.products.Smartphone;

public class Cart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci i dati del prodotto richiesti e premi invio...");
        System.out.println("Che prodotto vuoi aggiungere? 1 - Smartphone, 2 - Televisore, 3 - Cuffie");
        int typeOfProduct = input.nextInt();
        input.nextLine();

        System.out.println("Nome prodotto: ");
        String name = input.nextLine();
        System.out.println("Marchio prodotto: ");
        String brand = input.nextLine();
        System.out.println("Prezzo prodotto: ");
        double price = input.nextDouble();
        System.out.println("IVA prodotto: ");
        int vat = input.nextInt();

        if (typeOfProduct == 1) {
            System.out.println("Imei prodotto: ");
            int imei = input.nextInt();
            System.out.println("Memoria prodotto (GB): ");
            int memory = input.nextInt();

            Smartphone phone = new Smartphone(typeOfProduct, name, brand, price, vat, imei, memory);
        }
    }
}
