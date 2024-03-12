import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    private static Usuario usuarioLogado;

   public static void main(String[] args) {

        Usuario fulano = new Gerente("fulano", "fulano", "1234");
        Usuario.addUsuario(fulano);

        Usuario ciclano = new Vendedor("ciclano", "ciclano", "1345");
        Usuario.addUsuario(ciclano);

        Usuario beltrano = new Cliente("beltrano", "beltrano", "1456");
        Usuario.addUsuario(beltrano);

        Veiculo carro = new Carro("Hyunday", "HB20", "preto", true,0000,
                0000, 0, 2023);
        Veiculo.addVeiculo(carro);

       Veiculo moto = new Carro("Honda", "CG 160", "Verde", false,0000,
               0000, 234, 2019);
       Veiculo.addVeiculo(moto);

       Veiculo lancha = new Lancha("FibraFort", "Focker 215", "Branco", true,0000,
               0000, 0, 2022);
       Veiculo.addVeiculo(lancha);

       Veiculo caminhao = new Caminhao("Volkswagen", "Constellation", "Vermelho",
               false,0000, 0000, 345, 2020);
       Veiculo.addVeiculo(caminhao);


        do {

            System.out.println("Concessionaria");
            System.out.println(" 1- Cadastro de Usuário \n 2- Login \n 3- Cadastrar veiculo \n 4- Ver veículos \n 5- Ver usuarios");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> cadastroUsuario();
                case 2 -> login();
                case 3 -> cadastrarVeiculo();
                case 4 -> removerVeiculo();
                case 5 -> verUsuarios();
                case 6 -> verVeiculos();
            }

        }while (true);
    }

        private static void cadastroUsuario() {
            System.out.print("Digite o nome:");
            String nome = sc.next();

            System.out.print("Digite o nome de usuario:");
            String user = sc.next();

            System.out.print("Defina uma senha:");
            String senha = sc.next();

            Usuario usuario = new Usuario (nome, user, senha) {
            };
            Usuario.addUsuario(usuario);
        }

        private static void login(){
            do {
                System.out.print("Usuario: ");
                String usuario = sc.next();
                System.out.print("Senha: ");
                String senha = sc.next();

                usuarioLogado = Usuario.login(usuario, senha);

            } while (usuarioLogado == null);
        }

    public static void cadastrarVeiculo(){

        if(usuarioLogado instanceof Gerente){
            System.out.print("Digite o modelo do veículo: ");
            String modelo = sc.next();

            System.out.print("Digite o fabricante do veículo: ");
            String fabricante = sc.next();

            System.out.print("Digite a condição do veículo: \n (True para novo, false para usado)");
            String condicao = sc.next();

            System.out.print("Digite o preço do veiculo: ");
            String preco = sc.next();

            System.out.print("Digite o preço da tabela FIP do veiculo: ");
            String fip = sc.next();

            System.out.print("Digite os km rodados do veiculo: ");
            String km = sc.next();

            System.out.print("Digite o ano do veiculo: ");
            String ano = sc.next();


            Veiculo nome0 = null;
            Veiculo fabricante0 = null;
            Veiculo condicao0 = null;
            Veiculo preco0 = null;
            Veiculo fip0 = null;
            Veiculo km0 = null;
            Veiculo ano0 = null;


            for (Veiculo veiculo: Veiculo.getVeiculos()){
                if(veiculo.getModelo() == modelo){
                    nome0 = veiculo;

                }
            }

            ((Gerente) usuarioLogado).cadastrarVeiculo(nome0);
        } else {
            System.out.println("Você não tem permissão para este acesso. ");
        }
    }

    public static void removerVeiculo(){

        if(usuarioLogado instanceof Gerente){
            System.out.print("Digite o modelo do veículo: ");
            String modelo = sc.next();

            System.out.print("Digite o fabricante do veículo: ");
            String fabricante = sc.next();

            System.out.print("Digite a condição do veículo: \n (True para novo, false para usado)");
            String condicao = sc.next();

            System.out.print("Digite o preço do veiculo: ");
            String preco = sc.next();

            System.out.print("Digite o preço da tabela FIP do veiculo: ");
            String fip = sc.next();

            System.out.print("Digite os km rodados do veiculo: ");
            String km = sc.next();

            System.out.print("Digite o ano do veiculo: ");
            String ano = sc.next();


            Veiculo nome0 = null;
            Veiculo fabricante0 = null;
            Veiculo condicao0 = null;
            Veiculo preco0 = null;
            Veiculo fip0 = null;
            Veiculo km0 = null;
            Veiculo ano0 = null;


            for (Veiculo veiculo: Veiculo.getVeiculos()){
                if(veiculo.getFabricante() == fabricante){
                    fabricante0 = veiculo;

                }
            }

            ((Gerente) usuarioLogado).cadastrarVeiculo(fabricante0);
        } else {
            System.out.println("Você não tem permissão para este acesso. ");
        }
    }

    public static void verVeiculos(){
        System.out.println(Veiculo.getVeiculos().toString());
    }

    public static void verUsuarios() {
        if (usuarioLogado instanceof Gerente) {
            System.out.println(Usuario.getUsuarios().toString());
        } else {
            System.out.println("Você não tem permissão para este acesso. ");
        }


    }
}
