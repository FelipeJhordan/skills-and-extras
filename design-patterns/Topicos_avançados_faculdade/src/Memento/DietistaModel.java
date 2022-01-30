package Memento;

public class DietistaModel {
    private String nomeDietista;
    private long numeroDiaDieta;
    private double peso;

    public DietistaModel(String nome,long numero,double peso) {
        this.nomeDietista = nome;
        this.numeroDiaDieta= numero;
        this.peso = peso;
    }

    public String getNomeDietista() {
        return nomeDietista;
    }

    public void setNomeDietista(String nomeDietista) {
        this.nomeDietista = nomeDietista;
    }

    public long getNumeroDiaDieta() {
        return numeroDiaDieta;
    }

    public void setNumeroDiaDieta(long numeroDiaDieta) {
        this.numeroDiaDieta = numeroDiaDieta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return
                "Nome dietista atual='" + nomeDietista + '\'' +
                ", numero do dia=" + numeroDiaDieta +
                ", peso =" + peso + " kilos";
    }
}
