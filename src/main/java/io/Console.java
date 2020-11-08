package io;

import models.Fluffyslippers;
import services.FluffyslippersService;

import java.util.Scanner;

public class Console {
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");
    }

    static Scanner scan = new Scanner(System.in);

    public static String printMenu(){
        String selection;
        System.out.println("Type letter of preferred action:");
        System.out.println("a: create different products");
        System.out.println("b: read from existing products");
        System.out.println("c: update products");
        System.out.println("d: delete products");
        System.out.println("e: get reports");
        System.out.println("f: exit program");
        selection = scan.nextLine();
        return selection;
    }

    public static void matchMenuToMethod(String selection){
        FluffyslippersService fluffyslippersService = new FluffyslippersService();

        switch (selection) {
            case "a":
                System.out.println("Enter Fluffyslippers name");
                String name = scan.nextLine();
                System.out.println("Enter Fluffyslippers brand");
                String brand = scan.nextLine();
                System.out.println("Enter Fluffyslippers sport");
                String sport = scan.nextLine();
                System.out.println("Enter Fluffyslippers size");
                int size = scan.nextInt();
                System.out.println("Enter Fluffyslippers quantity");
                int quantity = scan.nextInt();
                System.out.println("Enter Fluffyslippers price");
                float price = scan.nextFloat();
                fluffyslippersService.create(name, brand, sport, size, quantity, price);
                break;

            case "b":
                Fluffyslippers[] allFluffyslippers = fluffyslippersService.findAll();
                for (int i = 0; i < allFluffyslippers.length; i++){
                    Fluffyslippers fluff = allFluffyslippers[i];
                    System.out.println("ID number " + fluff.getId());
                    System.out.println("ID number " + fluff.getName());
                    System.out.println("ID number " + fluff.getBrand());
                    System.out.println("ID number " + fluff.getSport());
                    System.out.println("ID number " + fluff.getQty());
                    System.out.println("ID number " + fluff.getPrice());
                    break;
                }

            default:
                System.out.println("Entered invalid selection.");
        }
    }
}
