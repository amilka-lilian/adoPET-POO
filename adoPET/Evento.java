package introducao.avaliacao1;

public class Evento implements Listavel {
    //Variáveis
    private String nome;
    private String local;
    private int hora;
    private int minuto;
   
    //GET and SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }


    @Override
    public String listar() {
        //"Implemente lógica para listar dados para Evento";
        return "Nome do Evento: " + nome + ", Local: " + local + ", Hora:" + horario + " : " + minuto;
    }    
}
