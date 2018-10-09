public class Main {

    public static void main(String[] args) {

//        Figure figure = new Figure(new Point(0, 0, "A"),
//                new Point(4, 8, "B"),
//                new Point(3, 7, "C"));  // исходные данные

        Figure figure = new Figure(new Point(0, 0, "A"),
                new Point(0, 5, "B"),
                new Point(5, 5, "C"), new Point(5, 0, "D"));  // квадрат

//        Figure figure = new Figure(new Point(0, 0, "A"),
//                new Point(0, 5, "B"),
//                new Point(5, 0, "C"));  // треугольник



        System.out.print("\n  Периметр многоугольника : \n");
        figure.PerimeterCalculator(figure);
    }
}
