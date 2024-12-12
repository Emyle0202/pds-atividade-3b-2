public class Pessoa {
    private String nome;
    private int idade;
 
    public int getIdade() {
        return idade;
    }
    
    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }


    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}