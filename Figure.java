import java.util.ArrayList;

public class Figure {
    private ArrayList<Point> pointList = new ArrayList<>(); // желательно
    Figure(Point point_1, Point point_2, Point point_3) {
        pointList.add(point_1);
        pointList.add(point_2);
        pointList.add(point_3);
    }

    Figure(Point point_1, Point point_2, Point point_3, Point point_4) {
        pointList.add(point_1);
        pointList.add(point_2);
        pointList.add(point_3);
        pointList.add(point_4);

    }

    Figure(Point point_1, Point point_2, Point point_3, Point point_4, Point point_5) {
        pointList.add(point_1);
        pointList.add(point_2);
        pointList.add(point_3);
        pointList.add(point_4);
        pointList.add(point_5);
    }

    Point getPoint(int index){
        return pointList.get(index);
    }

    double LengthSide(Point A, Point B){

        double LengthX;
        double LengthY;
        double Side;


        LengthX = (B.getX() - A.getX()) * (B.getX() - A.getX());
        LengthY = (B.getY() - A.getY()) * (B.getY() - A.getY());

        Side = LengthY + LengthX;

        return Math.sqrt(Side);
    }


    void PerimeterCalculator(Figure figure){
//        double AB = LengthSide(figure.getPoint_1(), figure.getPoint_2());
//        double BC = LengthSide(figure.getPoint_2(), figure.getPoint_3());
//        double CA = LengthSide(figure.getPoint_3(), figure.getPoint_1());
        double result = 0;
        double temp = 0;
        for (int i = 1; i < pointList.size(); i++){
            temp = LengthSide(pointList.get(i-1), pointList.get(i));
            result += temp;
            System.out.println("Сторона " + pointList.get(i-1).getNamePoint() + pointList.get(i).getNamePoint() + "  " + temp);
        }
        result += LengthSide(pointList.get(pointList.size()-1), pointList.get(0));
        System.out.println("Сторона " + ((pointList.get(pointList.size()-1).getNamePoint()) + pointList.get(0).getNamePoint() + "  " + temp));
        System.out.println(result);

//        System.out.println(AB + BC + CA);
    }


}
