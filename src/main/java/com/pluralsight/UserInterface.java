package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    public UserInterface(){
    }

    // Loads in the dealership
    private void init(){

        // Creates an instance of DealershipFileManager class
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

        System.out.println("=========== WELCOME TO DIN'S CAR DEALERSHIP! ===========");

        // Displays menu, takes user input, & calls corresponding process() method; exits if user chooses exit or enters nothing
        do {

            // Displays the menu
            System.out.print("""
            ~ Please select an option...
                (1) Price
                (2) Make & Model
                (3) Year
                (4) Color
                (5) Mileage
                (6) Type
                (7) Exit
                
            ~ Enter your choice here ➤\s""");

            // Read's user choice
            userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println(); //Skip line

            // Switch statement that calls the correct process() method that matches the user request
            switch(userChoice) {
                case 1:

                    // Gets user input
                    System.out.print("Please enter a minimum price: ");
                    double minPrice = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Please enter a maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(); //Skip line

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByPrice(minPrice, maxPrice));
                    break;

                case 2:

                    // Gets user input
                    System.out.print("Please enter a make: ");
                    String makeInput = scanner.nextLine();

                    System.out.print("Please enter a model: ");
                    String modelInput = scanner.nextLine();
                    System.out.println(); //Skip line

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByMakeModel(makeInput, modelInput));
                    break;

                case 3:

                    // Gets user input
                    System.out.print("Please enter a minimum year: ");
                    int minYear = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Please enter a maximum year: ");
                    int maxYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(); //Skip line

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByYear(minYear, maxYear));
                    break;

                case 4:

                    // Gets user input
                    System.out.print("Please enter a color: ");
                    String colorInput = scanner.nextLine();
                    System.out.println(); //Skip line

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByColor(colorInput));
                    break;

                case 5:

                    // Gets user input
                    System.out.print("Please enter a minimum mileage: ");
                    int minMileage = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Please enter a maximum mileage: ");
                    int maxMileage = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(); //Skip line

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByMileage(minMileage, maxMileage));
                    break;

                case 6:

                    // Gets user input
                    System.out.print("Please enter a vehicle type: ");
                    String typeInput = scanner.nextLine();
                    System.out.println(); //Skip line

                    // Filters based on user input
                    displayVehicles(dealership.getVehiclesByType(typeInput));
                    break;

                case 7:
                    System.out.println("~ Have a good day!");
                    break;
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

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "VIN", "YEAR", "MAKE", "MODEL", "TYPE",
                "COLOR", "ODOMETER", "PRICE");

        // Prints every vehicle in the inputted list of vehicles
        for(Vehicle vehicle : vehicles){

            System.out.printf("%-10d %-10d %-10s %-10s %-10s %-10s %-10d %-10f%n",vehicle.getVin(), vehicle.getYear(), vehicle.getMake(),
                    vehicle.getModel(), vehicle.getVehicleType(), vehicle.getColor(),
                    vehicle.getOdometer(), vehicle.getPrice());
        }

        System.out.println(); // Skip a line
    }

}