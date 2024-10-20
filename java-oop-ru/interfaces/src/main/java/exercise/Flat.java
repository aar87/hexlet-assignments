package exercise;

// BEGIN
public class Flat implements Home {
    private final double area;
    private final double balcony;
    private final int floor;

    public Flat(double area, double balcony, int floor) {
        this.area = area;
        this.balcony = balcony;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.balcony;
    }

    @Override
    public boolean compareTo(Home anotherHome) {
        return this.getArea() > anotherHome.getArea();
    }

    public int getFloor() {
        return this.floor;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.getFloor() + " этаже";
    }
}
// END
