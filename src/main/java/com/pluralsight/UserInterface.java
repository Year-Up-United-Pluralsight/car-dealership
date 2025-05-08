package com.pluralsight;

public class UserInterface {

    private Dealership dealership;

    public UserInterface(Dealership dealership){
        this.dealership = dealership;
    }

    public void display() {};

    public void processGetByPriceRequest(){};
    public void processGetByMakeModelRequest(){};
    public void processGetByYearRequest(){};
    public void processGetByMileageRequest(){};
    public void processGetByVehicleTypeRequest(){};
    public void processGetAllVehiclesRequest(){};
    public void processAddVehicleRequest(){};
    public void processRemoveVehicleRequest(){};

}
