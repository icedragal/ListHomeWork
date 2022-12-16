import com.sun.security.jgss.GSSUtil;
import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7F, Car.TypeOfBody.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F, Car.TypeOfBody.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0F, Car.TypeOfBody.SEDAN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F, Car.TypeOfBody.SEDAN);
        kia.printType();
        Truck truck1 = new Truck("Урал-М", "55571-3121-80", 6.65F, Truck.LoadCapacity.N2);
        Truck truck2 = new Truck("Урал-М", "4320-3171-80", 6.65F, Truck.LoadCapacity.N2);
        Truck truck3 = new Truck("Урал", "6370 63704К-0111", 11.12F, Truck.LoadCapacity.N3);
        Truck truck4 = new Truck("Урал", "Next", 6.65F, Truck.LoadCapacity.N2);
        truck4.printType();
        Bus bus1 = new Bus("ПАЗ", "3205", 10F, Bus.Сapacity.SMALL);
        Bus bus2 = new Bus("ЛиАЗ", "677", 10F, Bus.Сapacity.EXTRA_SMALL);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 10F, Bus.Сapacity.LARGE);
        Bus bus4 = new Bus("ПАЗ", "3292", 10F, Bus.Сapacity.MEDIUM);
        bus1.printType();
        DriverB kolya = new DriverB("Николай", true, 3);
        DriverC syoma = new DriverC("Семён", true, 7);
        DriverD evgen = new DriverD("Евгений", true, 5);

        Mechanic<Car> kolyaM = new Mechanic<Car>("Николай", "Николаев", "ООО Гонки");
        Mechanic<Truck> syomaM = new Mechanic<Truck>("Семён", "Семёнов", "ООО Заезды");
        Mechanic<Bus> evgenM = new Mechanic<Bus>("Евгений", "Евгеньев", "ООО Быстрый пит-стоп");

        Sponsor tinkoff = new Sponsor("Тинькофф", 1_000_000);
        Sponsor avia = new Sponsor("Авиасеилс", 1_500_000);

        List<Transport> transports = List.of(granta, truck1, bus1);
        granta.addDriver(kolya);
        granta.addMechanic(kolyaM);
        granta.addSponsor(avia);

        truck1.addDriver(syoma);
        truck1.addMechanic(syomaM);
        truck1.addSponsor(avia);

        bus1.addDriver(evgen);
        bus1.addMechanic(evgenM);
        bus1.addSponsor(tinkoff);

        printInfo(granta);
    }

    private static void printInfo(Transport transport) {
        System.out.println("Водители" + transport.getDrivers());
        System.out.println("Механики" + transport.getMechanics());
        System.out.println("Спонсоры" + transport.getSponsors());
    }
}