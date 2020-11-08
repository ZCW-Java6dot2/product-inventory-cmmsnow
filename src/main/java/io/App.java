package io;

import services.FluffyslippersService;

public class App {
    private FluffyslippersService fluffyslippersService = new FluffyslippersService(); // (1)

    public static void main(String... args){
        App application = new App(); // (2)
        application.init();  // (3)
    }

    public void init(){
        // (4) application logic here - call methods to take user input and interface with services
        FluffyslippersService newService = new FluffyslippersService();
        boolean isOn = true;
        Console.printWelcome();

        while (isOn){
            String selection = Console.printMenu();
            if (selection.equals("f")){
                isOn = false;
            } else {
                Console.matchMenuToMethod(selection);
            }
        }
    }
}