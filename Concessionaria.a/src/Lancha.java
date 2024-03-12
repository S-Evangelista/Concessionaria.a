


public class Lancha extends Veiculo{

    private double capacidade;
    private double velocidade;
    private double altura;

    public Lancha(String fabricante, String modelo, String cor, boolean novo, double preco, double precoTabela, double kmRodado, int ano) {
        super(fabricante, modelo, cor, novo, preco, precoTabela, kmRodado, ano);
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
