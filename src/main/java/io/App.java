package io;

import services.FluffyslippersService;

public class App {
    FluffyslippersService newService = new FluffyslippersService();

    public static void main(String... args){
        App application = new App(); // (2)
        application.init();  // (3)
    }

    public void init(){
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