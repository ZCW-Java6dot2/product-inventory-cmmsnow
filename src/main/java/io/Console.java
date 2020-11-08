package io;

import models.Fluffyslippers;
import services.FluffyslippersService;

import java.util.Scanner;

public class Console {
    public static void printWelcome(){
        System.out.println("***** Welcome to Fluff Inventory *****");
    }

    static Scanner scan = new Scanner(System.in);

    public static String printMenu(){
        String selection;
        System.out.println("Type letter of preferred Fluffyslipper action:");
        System.out.println("a: create different slippers");
        System.out.println("b: read from existing slippers");
        System.out.println("c: update slippers");
        System.out.println("d: delete slippers");
        System.out.println("e: get information report");
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
                double price = scan.nextDouble();
                float fprice = (float) price;
                fluffyslippersService.create(name, brand, sport, size, quantity, fprice);
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

            case "c":
                System.out.println("Enter ID of item to update its quantity:");
                int updateMe = Console.scan.nextInt();
                Fluffyslippers slippersToUpdate = fluffyslippersService.findFluffyslippers(updateMe);
                System.out.println("Enter new quantity of item:");
                int newQty = Console.scan.nextInt();
                slippersToUpdate.setQty(newQty);
                System.out.println("Quantity of " + updateMe + " set to " + newQty + ".");
                break;

            case "d":
                System.out.println("Enter ID of item you wish to delete:");
                int deleteMe = Console.scan.nextInt();
                boolean deleted = fluffyslippersService.delete(deleteMe);
                if (deleted){
                    System.out.println("Successfully deleted.");
                } else {
                    System.out.println("Not a valid ID. Item not deleted.");
                }
                break;

            case "e":
                System.out.println("Enter ID of item to see information:");
                int retrieveIdPrice = Console.scan.nextInt();
                float cost = fluffyslippersService.findFluffyslippers(retrieveIdPrice).getPrice();
                System.out.println("The price is " + cost + " dollars.");

            //default:
                //System.out.println("Entered invalid selection.");
        }
    }
}
