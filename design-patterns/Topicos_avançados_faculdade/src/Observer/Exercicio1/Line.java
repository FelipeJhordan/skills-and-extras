//package Observer.Exercicio1;
//
//import java.util.ArrayList;
//
//public class Line implements Subject{
//    private Point p1;
//    private Point p2;
//    private String color;
//    private ArrayList<Observer> observers;
//
//    public Line() {
//        this.observers = new ArrayList<Observer>();
//    }
//
//    public Line(Point p1, Point p2, String color) {
//        this.p1 = p1;
//        this.p2 = p2;
//        this.color = color;
//        this.observers = new ArrayList<Observer>();
//    }
//
//    @Override
//    public void addObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void removeObserver(Observer observer) {
//        observers.remove(observer);
//    }
//
//    @Override
//    public void notifyObserver() {
//        for (Observer ob: observers
//             ) {
//            ob.update(null, new Line(p1, p2, color));
//        }
//    }
//
//    public Point getP1() {
//        return p1;
//    }
//
//    public void setP1(Point p1) {
//        this.p1 = p1;
//        this.notifyObserver();
//    }
//
//    public Point getP2() {
//        return p2;
//    }
//
//    public void setP2(Point p2) {
//        this.p2 = p2;
//        this.notifyObserver();
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//        this.notifyObserver();
//    }
//}
