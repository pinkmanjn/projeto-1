
public class testepessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 35);
        Aluno aluno = new Aluno("João", 20, "2026001");

        pessoa.exibirDados();

        System.out.println("----------");

        aluno.exibirDados();
    }
}
