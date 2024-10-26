package exercise;

// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            double square = Math.round(circle.getSquare());
            System.out.println((int) square);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Вычисление окончено");
    }
}
// END
