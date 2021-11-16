package DmytroZaitsev.HW4.Vehicles;

import DmytroZaitsev.HW4.details.Engine;
import DmytroZaitsev.HW4.professions.Driver;

public class Truck extends Car {

int carrying;

    public Truck(String brand, String type, int weight, Driver driver, Engine engine, int carrying) {
        super(brand, type, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Truck{" +
                getBrand()  + " "+ '\'' +
                getType() + '\'' +
                " weight= " + getWeight() +
                " " + getDriver() +
                ", " + getEngine() +
                ", carrying=" + carrying +
                '}';
    }
}
