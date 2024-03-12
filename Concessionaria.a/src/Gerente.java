
public class Gerente extends Funcionario{

    public Gerente(String nome, String user, String senha) {
        super(nome, user, senha);
    }

    public void cadastrarVeiculo(Veiculo veiculo){
        Veiculo.addVeiculo(veiculo);
    }


}
