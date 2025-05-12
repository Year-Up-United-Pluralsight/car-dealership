package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    public UserInterface(){
    }

    // Loads in the dealership
    private void init(){

        // Create an instance of your DealershipFileManager class
        DealershipFileManager fileManager = new DealershipFileManager();

        // Assigns dealership object to the UserInterface's this.dealership attribute
        this.dealership = fileManager.getDealership();

    }

    public void display() {

        // Initializes scanner
        Scanner scanner = new Scanner(System.in);

        // Loads in the dealership
        init();

        String userChoice = "";

        // Displays menu, takes user input, & calls corresponding process() method; exits if user chooses exit or enters nothing
        do {

            // 1) Display the menu
            System.out.println("""
            ~ Welcome to Din's Car Dealership! Select an option:
               Would you like to search for vehicles by...
                (1) Price
                (2) Make & Model
                (3) Year
                (4) Color
                (5) Mileage
                (6) Type
                (7) Exit
            """);

            // Records user choice
            userChoice = scanner.nextLine();

            // Switch statement that calls the correct process() method that matches the user request
            switch(userChoice) {
                case 1:
                    dealership.getVehiclesByPrice();
                case 2:
                    dealership.getVehiclesByMakeModel();
                case 3:
                    dealership.getVehiclesByYear();
                case 4:
                    dealership.getVehiclesByColor();
                case 5:
                    dealership.getVehiclesByMileage();
                case 6:
                    dealership.getVehiclesByType();
                case 7:
                    System.out.println("~ Have a good day!");
            }

        } while (userChoice != "7" && !userChoice.isBlank());

        // 2) read the user's command
        // 3) code a switch statement that calls the correct process() method that matches the user request








    }

    public void processGetByPriceRequest(){};
    public void processGetByMakeModelRequest(){};
    public void processGetByYearRequest(){};
    public void processGetByMileageRequest(){};
    public void processGetByVehicleTypeRequest(){};
    public void processGetAllVehiclesRequest(){};
    public void processAddVehicleRequest(){};
    public void processRemoveVehicleRequest(){};

}
