package AbstractFactory;

public class NokiaFactory implements fabricaCelular{

    public void criarNokia() {
        System.out.print("Celular Nokia Criado \n"+criarBateria()+criarCamera()+criarGPS()+criarVisor() );
    }

    @Override
    public String criarBateria() {
        return "\n\tBateria Nokia";
    }

    @Override
    public String criarCamera() {
        return "\n\tCamera Nokia";
    }

    @Override
    public String criarGPS() {
        return "\n\tGPS Nokia";
    }

    @Override
    public String criarVisor() {
        return "\n\tVisor Nokia";
    }
}
