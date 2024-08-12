import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompras(Compra compra) {
        if(this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
