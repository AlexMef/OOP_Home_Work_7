public class Point {
    private double x;  // double
    private double y;  // double  (не критично, но может вызвать ошибку при вводе дробных значений)
    private String namePoint;

    Point(double x, double y, String namePoint) {
        this.x = x;
        this.y = y;
        this.namePoint = namePoint;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setNamePoint(String namePoint) {
        this.namePoint = namePoint;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    String getNamePoint() {
        return namePoint;
    }
}
