package heranca.figuras;

import java.util.Objects;

public class Circulo extends FiguraGeometrica2DBase {
    private double raio;

    public Circulo() {
        super("CIRCULO");
    }

    public Circulo(double raio) {
        super("CIRCULO");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return Double.compare(getRaio(), circulo.getRaio()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRaio());
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }


}
