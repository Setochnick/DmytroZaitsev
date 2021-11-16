package DmytroZaitsev.HW4;


import DmytroZaitsev.HW4.Vehicles.SportCar;
import DmytroZaitsev.HW4.Vehicles.Truck;
import DmytroZaitsev.HW4.details.Engine;
import DmytroZaitsev.HW4.professions.Driver;

public class MainClass  {



    public static void main(String[] args) {

        Driver wasia = new Driver("Wasia", 21,"Pupkin Wasilii", 39);
        Driver zhora = new Driver("Zhora", 40, "Petrov Georgii", 59);
        Engine engine1 = new Engine(300,"Vmodel");
        Engine engine2 = new Engine(450, "Volvo");

        SportCar sportCar = new SportCar("Ferari","SuperCar", 4, wasia, engine1, 200);
        Truck truck = new Truck("Volvo", "Heavy",12, zhora, engine2, 30);


        System.out.println(sportCar);
        System.out.println(truck);

    }
}


