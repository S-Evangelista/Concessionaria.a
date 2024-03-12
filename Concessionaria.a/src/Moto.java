

public class Moto extends Veiculo{

    private boolean sidecar;

    public Moto(String fabricante, String modelo, String cor, boolean novo, double preco, double precoTabela, double kmRodado, int ano) {
        super(fabricante, modelo, cor, novo, preco, precoTabela, kmRodado, ano);
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}
