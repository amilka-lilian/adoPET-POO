package adopet;

public class Reserva implements Listavel {

    private String cpf;
    private String data;
    private String horario;

    // GET and SET para as variáveis

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String listar() {
        // Implemente logica para listar dados para Reserva
        return "Reserva: CPF" + cpf + ",Data: " + data + ", Horário:" + horario;
    }
}

