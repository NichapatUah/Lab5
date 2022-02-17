package lab5;

public class RegularPolygonMain {

    public static void main(String[] args){
        RegularPolygon regularPolygon = new RegularPolygon(6, 4);
        regularPolygon = new RegularPolygon(10,4,5.6,7.8);
        regularPolygon = new RegularPolygon();

        System.out.println(regularPolygon.getN());
        System.out.println(regularPolygon.getSide());
        System.out.println(regularPolygon.getX());
        System.out.println(regularPolygon.getY());
        System.out.println(regularPolygon.getPerimeter());
        System.out.println(regularPolygon.getArea());
    }
}
