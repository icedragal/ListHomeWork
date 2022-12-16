package transport.driver;

import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMoving(Truck transport) {
        transport.start();
    }

    @Override
    public void finishMoving(Truck transport) {
transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand() + " " + transport.getModel());
    }
}
