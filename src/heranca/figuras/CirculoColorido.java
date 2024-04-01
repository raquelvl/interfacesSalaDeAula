package heranca.figuras;

public class CirculoColorido extends Circulo {
    private String cor;

    public CirculoColorido(double raio, String cor) {
        super(raio);
        this.cor = cor;
    }
}
