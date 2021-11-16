package DmytroZaitsev.HW4.Vehicles;

import DmytroZaitsev.HW4.details.Engine;
import DmytroZaitsev.HW4.professions.Driver;

public class SportCar extends Car{

    private int speed;

    public SportCar(String brand, String type, int weight, Driver driver, Engine engine, int speed) {
        super(brand, type, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                getBrand()  + " "+ '\'' +
                getType() + '\'' +
                " weight= " + getWeight() +
                " " + getDriver() +
                ", " + getEngine() +
                ", speed=" + speed +
                '}';
    }
}





