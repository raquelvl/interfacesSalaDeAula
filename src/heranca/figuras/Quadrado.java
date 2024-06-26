package heranca.figuras;

import java.util.Objects;

public class Quadrado extends FiguraGeometrica2DBase {
    private double lado;

    public Quadrado(double lado) {
        super("QUADRADO");
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quadrado quadrado)) return false;
        return Double.compare(getLado(), quadrado.getLado()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLado());
    }
    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }


}
