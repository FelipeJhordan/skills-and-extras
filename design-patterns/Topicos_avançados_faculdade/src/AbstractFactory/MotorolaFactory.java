package AbstractFactory;

public class MotorolaFactory implements fabricaCelular{
    public void criarMotorola() {
        System.out.print("Celular Motorola Criado \n"+criarBateria()+criarCamera()+criarGPS()+criarVisor() );
    }

    @Override
    public String criarBateria() {
        return "\n\tBateria Motorola";
    }

    @Override
    public String criarCamera() {
        return "\n\tCamera Motorola";
    }

    @Override
    public String criarGPS() {
        return "\n\tGPS Motorola";
    }

    @Override
    public String criarVisor() {
        return "\n\tVisor Motorola";
    }
}
