package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public boolean compareTo(Home anotherHome) {
        return this.getArea() > anotherHome.getArea();
    }

    public int getFloorCount() {
        return this.floorCount;
    }

    @Override
    public String toString() {
        return this.getFloorCount() + " этажный коттедж площадью " + this.getArea() + " метров";
    }
}
// END
