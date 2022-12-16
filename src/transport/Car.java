package transport;

public class Car extends Transport implements Competing{
    public enum TypeOfBody{
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private String name;

        TypeOfBody(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + name;
        }
    }
    private TypeOfBody typeOfBody;
    public Car(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody ttypeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel()+ " закончил движение");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
    }

    @Override
    public void repair() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel() + " отремонтирован");
    }

    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);
    }


}

