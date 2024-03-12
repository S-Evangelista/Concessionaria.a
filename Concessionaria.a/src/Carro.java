
public class Carro extends Veiculo{



    private int portas;
    private boolean tracao;

    public Carro(String fabricante, String modelo, String cor, boolean novo, double preco, double precoTabela, double kmRodado, int ano) {
        super(fabricante, modelo, cor, novo, preco, precoTabela, kmRodado, ano);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isTracao() {
        return tracao;
    }

    public void setTracao(boolean tracao) {
        this.tracao = tracao;
    }
}
