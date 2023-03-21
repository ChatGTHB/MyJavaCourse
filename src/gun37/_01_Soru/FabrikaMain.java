package gun37._01_Soru;

import java.util.ArrayList;
import java.util.List;

public class FabrikaMain {
    public static void main(String[] args) {

        TeslaCar teslaCar=new TeslaCar("Model 5",2500);

        ToyotaPirus toyotaPirus=new ToyotaPirus("Sedan",3000);

        Bus cityBus=new Bus("City Bus",3500);

        List<Vehicle>vehicles=new ArrayList<>();

        vehicles.add(teslaCar);
        vehicles.add(toyotaPirus);
        vehicles.add(cityBus);

        for(Vehicle vehicle:vehicles){
            System.out.println("---------------------------------");
            System.out.println(vehicle.getClass().getSimpleName());// class adını verir
            System.out.println("---------------------------------");
            System.out.println(vehicle.getModel());
            System.out.println(vehicle.getEngine());

            if(vehicle instanceof TeslaCar){
                System.out.println(((TeslaCar) vehicle).drive());
                System.out.println(((TeslaCar) vehicle).changeBattery());
            }else if (vehicle instanceof ToyotaPirus){
                System.out.println(((ToyotaPirus) vehicle).drive());
                System.out.println(((ToyotaPirus) vehicle).changeBattery());
                System.out.println(((ToyotaPirus) vehicle).changeOil());
            } else if (vehicle instanceof Bus) {
                System.out.println(((Bus) vehicle).drive());
                System.out.println(((Bus) vehicle).changeDiesel());
            }
        }










    }
}
