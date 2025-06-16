package adopet;

public class RegistroAdocao implements Listavel {

    private String nomeCompleto;
    private String cpf;
    private String telefone;
    private String endereco;

    // GET and SET para as variáveis

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String listar() {
        //"Implemente lógica para listar dados do animal";
        return "Nome: "+ nomeCompleto + ", CPF:" + cpf + ", Telefone:" + telefone + ", Endereço:" + endereco; 
    }
}
