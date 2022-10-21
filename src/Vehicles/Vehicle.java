package Vehicles;

public class Vehicle {
    private String VehicleName;

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public void makeNoise(){
        System.out.println("vroom");
    }
}
