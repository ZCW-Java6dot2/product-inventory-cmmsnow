package services;

import models.Fluffyslippers;

import java.util.ArrayList;

public class FluffyslippersService {
    //create ID numbers for new objects
    private static int nextId = 1;

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
        // should take an int and return an object with that id, if exists
        return inventory.get(id);
    }

    //read all
    public Fluffyslippers[] findAll() {
        // should return a basic array copy of the ArrayList
        Fluffyslippers[] slipperInventory = (Fluffyslippers[]) inventory.toArray();
        return slipperInventory;
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        if (inventory.contains(id)){
            inventory.remove(id);
            return true;
        } else {
            return false;
        }
    }
}
