package adopet;

public class RegistroAdocao implements Listavel {

    private String codigoAnimal;
    private String cpfAdotante;

    // GET and SET para as variáveis

    public String getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(String codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public String getCpfAdotante() {
        return cpfAdotante;
    }

    public void setCpfAdotante(String cpfAdotante) {
        this.cpfAdotante = cpfAdotante;
    }

    @Override
    public String listar() {
    // Implementar logica para listar dados para RegistroAdocao
    return "Registro de Adoção: " + codigoAnimal + ", " + cpfAdotante;
    }
}
