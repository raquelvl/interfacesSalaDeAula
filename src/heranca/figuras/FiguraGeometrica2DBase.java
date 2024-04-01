package heranca.figuras;

public abstract class FiguraGeometrica2DBase implements Figura2D {
    private String descricao;

    public FiguraGeometrica2DBase(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int compareTo(Figura2D outraFigura) {
        if(this.calculaArea() == outraFigura.calculaArea()) return 0;
        if(this.calculaArea() < outraFigura.calculaArea())  return -1;
        return 1;
    }
}
