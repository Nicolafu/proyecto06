package es.santander.ascender;

public class Perro {

    private double peso;

    public Perro(double peso) {
        //que pasa en peso negativo
        this.peso = peso;
    }

    public void comer(double pesoComida) {

        peso += pesoComida; //Tambien se puede escribir peso = peso + pesoComida
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
