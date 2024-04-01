package heranca.figuras;

public interface Figura2D extends Comparable<Figura2D> {
    public String getDescricao();
    public double calculaArea();
    public double calculaPerimetro();

}
