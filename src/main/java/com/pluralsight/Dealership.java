package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Dealership {

// PRIVATE VARS
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

// CONSTRUCTOR
    public void Dealership(String name, String address, String phone){
        this.name = name;
        this.address =  address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

// <editor-fold desc="GETTERS/SETTERS">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
// </editor-fold>

// <editor-fold desc="DERIVED GETTERS">

//    public List<Vehicle> getVehiclesByPrice(double min, double max){};
//    public List<Vehicle> getVehiclesByMakeModel(String make, String model){};
//    public List<Vehicle> getVehiclesByYear(int min, int max){};
//    public List<Vehicle> getVehiclesByColor(String color){};
//    public List<Vehicle> getVehiclesByMileage(int min, int max){};
//    public List<Vehicle> getVehiclesByType(String vehicleType){};

    public List<Vehicle> getAllVehicles(){
        return inventory;
    };

// </editor-fold>

// MORE METHODS
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    };
    public void removeVehicle(Vehicle vehicle){};

}