package org.lessons.java.cart;

import java.util.Scanner;

import org.lessons.java.products.Headphones;
import org.lessons.java.products.Smartphone;
import org.lessons.java.products.Televisions;
import org.lessons.java.compositions.Processor;
import org.lessons.java.compositions.Screen;

public class Cart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean add = true;
        double cartPrice = 0;

        while (add) {
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
            input.nextLine();
    
            if (typeOfProduct == 1) {
                System.out.println("Imei prodotto: ");
                int imei = input.nextInt();
                System.out.println("Memoria prodotto (GB): ");
                int memory = input.nextInt();

                Processor processor = new Processor("Snapdragon 888", 8);
                Screen screen = new Screen("Super AMOLED", 120);
    
                Smartphone phone = new Smartphone(typeOfProduct, name, brand, price, vat, imei, memory, processor,  screen);
                System.out.println(phone.showDetails());
                cartPrice += phone.formattedPrice();
            } else if (typeOfProduct == 2) {
                System.out.println("Dimensioni prodotto (pollici):");
                int size = input.nextInt();
                System.out.println("La tv è una Smart tv? true/false");
                boolean smartTv = input.nextBoolean();

                Screen screen = new Screen("OLED", 50);
    
                Televisions tv = new Televisions(typeOfProduct, name, brand, price, vat, size, smartTv, screen);
                System.out.println(tv.showDetails());
                cartPrice += tv.formattedPrice();
            } else {
                System.out.println("Colore del prodotto");
                String color = input.nextLine();
                System.out.println("Le cuffie sono wireless? true/false");
                boolean cabled = input.nextBoolean();
    
                Headphones headset = new Headphones(typeOfProduct, name, brand, price, vat, color, cabled);
                headset.headsetDetails();
                cartPrice += headset.formattedPrice();
            }

            System.out.println("Vuoi aggiungere un altro prodotto? (Y/N)");
            input.nextLine();
            String answer = input.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {
                add = false;
                System.out.println("Prezzo totale: €" + cartPrice);
            }   
        }
        input.close();
    }
}
