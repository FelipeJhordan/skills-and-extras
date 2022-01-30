//package Observer;
//
//import Observer.Exercicio1.Line;
//import Observer.Exercicio1.Point;
//import Observer.Exercicio1.Screen;
//
//public class UseObserver {
//    public static void main(String[] args) {
//        Line line = new Line(new Point(3l, 4l, "red"), new Point(5l, 2l, "blue"), "red");
//        Point point = new Point(3l, 2l ,"blue");
//
//        Screen screen = new Screen();
//
//        point.addObserver(screen);
//        line.addObserver(screen);
//
//        line.setColor("Blue");
//        point.setColor("Red");
//    }
//
//    public static void main2() {
//
//    }
//}
