//package Observer.Exercicio1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Point implements Subject{
//    private long x;
//    private long y;
//    private String color;
//    private ArrayList<Observer> observers;
//
//    public Point() {
//        this.observers = new ArrayList<Observer>();
//    }
//
//    public Point(long x, long y, String color) {
//        this.x = x;
//        this.y = y;
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
//            ob.update(new Point(x,y,color), null);
//        }
//    }
//
//    public long getX() {
//        return x;
//    }
//
//    public void setX(long x) {
//        this.x = x;
//        this.notifyObserver();
//    }
//
//    public long getY() {
//        return y;
//    }
//
//    public void setY(long y) {
//        this.y = y;
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
//
//    }
//}
