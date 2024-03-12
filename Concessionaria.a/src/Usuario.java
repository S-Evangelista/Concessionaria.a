import java.util.ArrayList;
import java.util.List;

    public abstract class Usuario{

        private String nome;
        private String user;
        private String senha;

        public Usuario(String nome, String user, String senha) {
            this.nome = nome;
            this.user = user;
            this.senha = senha;
        }

        private final static List<Usuario> usuarios = new ArrayList<>();

        public static Usuario login(String user, String senha){
            for (Usuario userPesquisado: usuarios) {
                if(userPesquisado.user.equals(user) &&
                        userPesquisado.senha.equals(senha)){
                    return userPesquisado;
                }
            }
            return null;
        }
        public static void addUsuario(Usuario usuario) {
            usuarios.add(usuario);
        }

        public void cadastrarUsuario(Usuario usuario) {
                Usuario.addUsuario((usuario));
            }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public static List<Usuario> getUsuarios() {
            return usuarios;
        }

        @Override
        public String toString() {
            return "" +
                    "Funcionario:'" + nome + '\'' +
                    " Usuario:'" + user + '\n';
        }
    }


