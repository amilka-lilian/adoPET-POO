package adopet;

public class Animal implements Listavel{

    private String nomeAnimal;
    private int idade;
    private String raca;
    private String especie;
    private double peso;
    private String codigo;
    private String descricao;

    // GET and SET para as variáveis

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String listar() {
        // Implemente lógica para listar os dados para Animal
        return "Animal: " + nomeAnimal + ", Idade: " + idade + " anos, Raça: " + raca + ", Espécie: " + especie + ", Peso: " + peso + " kg";
    }
}
