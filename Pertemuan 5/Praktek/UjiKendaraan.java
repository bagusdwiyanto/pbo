package ujikendaraan;

public class UjiKendaraan {


    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle mtr = new MotorVehicle();
        
        System.out.println("---------------");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnRight();
        sepeda.ringBell();
        
        System.out.println("---------------");
        
        System.out.println(mtr.speed);
        System.out.println(mtr.color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.sizeofEngine);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeofEngine());
        
        System.out.println("---------------");
    }
}