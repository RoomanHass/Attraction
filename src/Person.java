public class Person {
    private final String name;
    private final String family;
    private int howManyTickets;

    public Person(String name, String family, int howManyTickets) {
        this.name = name;
        this.family = family;
        this.howManyTickets = howManyTickets;
    }

    public int getHowManyTickets() {
        return howManyTickets;
    }

    public void setHowManyTickets(int howManyTickets) {
        this.howManyTickets = howManyTickets;
    }

    @Override
    public String toString() {
        return name + " " + family;
    }
}
