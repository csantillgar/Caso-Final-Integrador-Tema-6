package GestionDatosDinamicos;

public class Pareja {
    private int entero;
    private double real;

    public Pareja(int entero, double real) {
        this.entero = entero;
        this.real = real;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "(" + entero + ", " + real + ")";
    }
}
