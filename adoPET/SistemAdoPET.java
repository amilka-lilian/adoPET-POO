public class SistemaAdoPET {

    private ArrayList<Listavel> listaItens = new ArrayList<>();

    // Método para adicionar elementos à lista
    public void adicionarItem(Listavel item) {
        listaItens.add(item);
    }

    // Método para listar os dados
    public String listarItens() {
        StringBuilder result = new StringBuilder();
        for (Listavel item : listaItens) {
            result.append(item.listar()).append("\n");
        }
        return result.toString();
    }
}