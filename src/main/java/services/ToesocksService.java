package services;

import models.Fluffyslippers;
import models.Toesocks;

import java.util.ArrayList;

public class ToesocksService {
    //create ID numbers for new objects
    private static int nextId = 1;

    //collection that will hold all the objects
    private ArrayList<Toesocks> inventory = new ArrayList<>();

    public Toesocks create(String name, String brand, String sport, int size, int quantity, float price){
        Toesocks createdToesocks = new Toesocks(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdToesocks);
        return createdToesocks;
    }

    //read
    public Toesocks findToesocks(int id) {
        return inventory.get(id);
    }

    //read all
    public Toesocks[] findAll() {
        Toesocks[] socksInventory = (Toesocks[]) inventory.toArray();
        return socksInventory;
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
}
