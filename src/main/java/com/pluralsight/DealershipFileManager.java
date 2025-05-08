package com.pluralsight;
import java.io.*;

public class DealershipFileManager {

    public Dealership getDealership(){

        Dealership dealership = new Dealership();

        try {

            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) != null){

                // Splits input by pipe
                String[] vehicleElements = line.split("\\|");

                // Converts each element into its proper type
                int vin = Integer.parseInt(vehicleElements[0]);
                int year = Integer.parseInt(vehicleElements[1]);
                String make = vehicleElements[2];
                String model = vehicleElements[3];
                String vehicleType = vehicleElements[4];
                String color = vehicleElements[5];
                int odometer = Integer.parseInt(vehicleElements[6]);
                double price = Double.parseDouble(vehicleElements[7]);

                // Constructs a vehicle object
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                // Adds the newly made vehicle to the dealership object
                dealership.addVehicle(vehicle);
            }

            return dealership;
        }

        catch (IOException e){
            System.out.println("Error! File failed to read...");
            return null;
        }

    }

    public void saveDealership(Dealership dealership){};

}
