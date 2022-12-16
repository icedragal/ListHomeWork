package transport;

public class Sponsor {
    private final String name;
    private int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор %s проспонсировал гонку на %c%n", name, amount);
    }

    @Override
    public String toString() {
        return name +
                ", пожертвовал " + amount;
    }
}
