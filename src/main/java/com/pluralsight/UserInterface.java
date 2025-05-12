package com.pluralsight;

import java.util.List;
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

        int userChoice;

        // Displays menu, takes user input, & calls corresponding process() method; exits if user chooses exit or enters nothing
        do {

            // Displays the menu
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

            // Read's user choice
            userChoice = scanner.nextInt();

            // Switch statement that calls the correct process() method that matches the user request
            switch(userChoice) {
                case 1:

                    // Gets user input
                    System.out.print("Please enter a minimum price: ");
                    double minPrice = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("\nPlease enter a maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine();

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByPrice(minPrice, maxPrice));

                case 2:

                    // Gets user input
                    System.out.print("Please enter a make: ");
                    String makeInput = scanner.nextLine();

                    System.out.print("\nPlease enter a model: ");
                    String modelInput = scanner.nextLine();

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByMakeModel(makeInput, modelInput));

                case 3:

                    // Gets user input
                    System.out.print("Please enter a minimum year: ");
                    int minYear = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("\nPlease enter a maximum year: ");
                    int maxYear = scanner.nextInt();
                    scanner.nextLine();

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByYear(minYear, maxYear));

                case 4:

                    // Gets user input
                    System.out.print("Please enter a color: ");
                    String colorInput = scanner.nextLine();

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByColor(colorInput));

                case 5:

                    // Gets user input
                    System.out.print("Please enter a minimum mileage: ");
                    int minMileage = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("\nPlease enter a maximum mileage: ");
                    int maxMileage = scanner.nextInt();
                    scanner.nextLine();

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByMileage(minMileage, maxMileage));

                case 6:

                    // Gets user input
                    System.out.print("Please enter a vehicle type: ");
                    String typeInput = scanner.nextLine();

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByType(typeInput));

                case 7:
                    System.out.println("~ Have a good day!");
            }

        } while (userChoice != 7 && userChoice != 0);
    }

    public void processGetByPriceRequest(){};
    public void processGetByMakeModelRequest(){};
    public void processGetByYearRequest(){};
    public void processGetByMileageRequest(){};
    public void processGetByVehicleTypeRequest(){};
    public void processGetAllVehiclesRequest(){ displayVehicles(dealership.getAllVehicles()); };
    public void processAddVehicleRequest(){};
    public void processRemoveVehicleRequest(){};

    private void displayVehicles(List<Vehicle> vehicles){

        // Prints every vehicle in the inputted list of vehicles
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }

}