
package ujikendaraan;

public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";
    
    
    public MotorVehicle(){
    }
    public MotorVehicle(int sizeofEngine, String licensePlate) {
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public int getSizeofEngine (){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
    
}