

public class Caminhao extends Veiculo{

    private String comprimento;
    private String altura;
    private float pesoSuportado;

    public Caminhao(String fabricante, String modelo, String cor, boolean novo, double preco, double precoTabela, double kmRodado, int ano) {
        super(fabricante, modelo, cor, novo, preco, precoTabela, kmRodado, ano);
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public float getPesoSuportado() {
        return pesoSuportado;
    }

    public void setPesoSuportado(float pesoSuportado) {
        this.pesoSuportado = pesoSuportado;
    }
}
