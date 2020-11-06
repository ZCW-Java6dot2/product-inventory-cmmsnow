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
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Toesocks[] findAll() {
        // should return a basic array copy of the ArrayList
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
    }
}
