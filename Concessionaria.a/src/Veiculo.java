import java.util.ArrayList;

public abstract class Veiculo {

    public Veiculo(String fabricante, String modelo, String cor, boolean novo, double preco, double precoTabela, double kmRodado, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.novo = novo;
        this.preco = preco;
        this.precoTabela = precoTabela;
        this.kmRodado = kmRodado;
        this.ano = ano;
    }

    private static final ArrayList<Veiculo> veiculos = new ArrayList<>();

    private String fabricante;
    private String modelo;
    private String cor;
    private boolean novo;
    private double preco;
    private double precoTabela;
    private double kmRodado;
    private int ano;

    public static void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public static ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getModelo() {
        return null;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoTabela() {
        return precoTabela;
    }

    public void setPrecoTabela(double precoTabela) {
        this.precoTabela = precoTabela;
    }

    public double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "" +
                "Fabricante:'" + fabricante + '\'' +
                " Modelo:'" + modelo + '\'' +
                " Cor:" + cor +'\'' +
                " Novo:" + novo +'\'' +
                " Preço:" + preco +'\'' +
                " Tabela FIP:" + precoTabela +'\'' +
                " Km rodados:" + kmRodado +'\'' +
                " Ano:" + ano + '\n';
    }
}
