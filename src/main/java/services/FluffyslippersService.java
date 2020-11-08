package services;
import java.io.*;
import models.Fluffyslippers;
import Utils.CSVUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class FluffyslippersService {
    //create ID numbers for new objects
    private static int nextId = 0;

    //collection that will hold all the objects
    private ArrayList<Fluffyslippers> inventory = new ArrayList<>();

    //create method that will accept arguments and return a new Fluffyslipper instance
    public Fluffyslippers create(String name, String brand, String sport, int size, int quantity, float price){
        Fluffyslippers createdFluffyslippers = new Fluffyslippers(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdFluffyslippers);
        return createdFluffyslippers;
    }

    //read
    public Fluffyslippers findFluffyslippers(int id) {
        return inventory.get(id);
    }

    //read all
    public Fluffyslippers[] findAll() {
        Fluffyslippers[] slipperInventory = new Fluffyslippers[inventory.size()];
        int i = 0;
        while (i < slipperInventory.length) {
            slipperInventory[i] = inventory.get(i);
            i++;
        }
        return slipperInventory;
    }

    //delete
    public boolean delete(int id) {
        if (inventory.contains(id)){
            inventory.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public void printOnFile() throws IOException {
        String csvFile = "/Users/christine/Dev/product-inventory-cmmsnow/Fluffyslippers.csv.rtf";
        FileWriter writer = new FileWriter(csvFile); //(1)
        CSVUtils.writeLine(writer,new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)


        for(
                Fluffyslippers f :inventory)
        {
            ArrayList<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(f.getId()));
            list.add(f.getName());
            list.add(f.getBrand());
            list.add(f.getSport());
            list.add(String.valueOf(f.getQty()));
            list.add(String.valueOf(f.getPrice()));

            CSVUtils.writeLine(writer, list);  // (4)
        }

// (5)
        writer.flush();
        writer.close();
    }
    public void loadData(){
        // (1)
        String csvFile = "/Users/christine/Dev/product-inventory-cmmsnow/Fluffy.csv.rtf";
        String line = "";
        String csvSplitBy = ",";


        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = (int)Integer.parseInt(br.readLine());

            while ((line = br.readLine()) != null) {
                String[] floof = line.split(csvSplitBy);

                // (4)
                int id = Integer.parseInt(floof[0]);
                String name = floof[1];
                String brand = floof[2];
                String sport = floof[3];
                int size = Integer.parseInt(floof[4]);
                int qty = Integer.parseInt(floof[5]);
                float price = Float.parseFloat(floof[6]);

                // (5)
                inventory.add(new Fluffyslippers(id, name, brand, sport, size, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
