package Observer.Exercicio1;

public class Screen implements Observer{


    public void display(Subject subject) {
        subject.toString();
    }

    @Override
    public void update(Subject subject) {

    }
}
