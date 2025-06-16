package adopet;

import javax.swing.JOptionPane;

public class AppAdoPET {
    public static void main(String[] args) {
        SistemaAdoPET adoPETSystem = new SistemaAdoPET();

        while (true) {
            String escolha = JOptionPane.showInputDialog(
                    "===== Menu de Cadastro =====\n" +
                            "1. Cadastrar Animal\n" +
                            "2. Cadastrar Pessoa Interessada\n" +
                            "3. Cadastrar Reserva\n" +
                            "4. Cadastrar Evento\n" +
                            "5. Cadastrar Registro de Adoção\n" +
                            "6. Mostrar Relatórios\n" +
                            "0. Sair\n" +
                            "Escolha uma opção:");

        if (escolha == null) {
            JOptionPane.showMessageDialog(null, "Encerrando o programa.");
            System.exit(0);
            }

        try {
                int opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1:
                    cadastrarAnimal(adoPETSystem);
                    break;
                case 2:
                    cadastrarPessoaInteressada(adoPETSystem);
                    break;
                case 3:
                    cadastrarReserva(adoPETSystem);
                    break;
                case 4:
                    cadastrarEvento(adoPETSystem);
                    break;
                case 5:
                    cadastrarRegistroAdocao(adoPETSystem);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "===== Relatórios =====\n" + adoPETSystem.listarItens());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    System.exit(0);
                     break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                     break;
            }
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para a opção.");
        }
    }
}

private static int obterIdade() {
    while (true) {
        try {
            String idadeStr = JOptionPane.showInputDialog("Idade do animal:");
            int idade = Integer.parseInt(idadeStr);
            if (idade >= 0) {
                return idade;
            } else {
                JOptionPane.showMessageDialog(null, "Idade deve ser um número não negativo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para a idade.");
        }
    }
}

private static float obterPeso() {
    while (true) {
        try {
            String pesoStr = JOptionPane.showInputDialog("Peso do animal:");
            float peso = Float.parseFloat(pesoStr);
            if (peso >= 0) {
                return peso;
            } else {
                JOptionPane.showMessageDialog(null, "Peso deve ser um número não negativo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para o peso.");
        }
    }
}

private static String obterCPF() {
    while (true) {
        try {
            String cpf = JOptionPane.showInputDialog("CPF:");
            if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                return cpf;
            } else {
                JOptionPane.showMessageDialog(null, "Formato de CPF inválido. Use o formato xxx.xxx.xxx-xx.");
            }
        } catch (NullPointerException e) {
            return null;  // Usuário cancelou a entrada
        }
    }
}

private static void cadastrarAnimal(SistemaAdoPET adoPETSystem) {
    Animal animal = new Animal();

    animal.setIdade(obterIdade());

    animal.setRaca(JOptionPane.showInputDialog("Raça do animal:"));

    animal.setEspecie(JOptionPane.showInputDialog("Especie do animal:"));

    animal.setPeso(obterPeso());

    animal.setCodigo(JOptionPane.showInputDialog("Código do animal:"));

    animal.setDescricao(JOptionPane.showInputDialog("Descrição do animal:"));

    adoPETSystem.adicionarItem(animal);
    JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
}

private static void cadastrarPessoaInteressada(SistemaAdoPET adoPETSystem) {
    PessoaInteressada pessoa = new PessoaInteressada();

    pessoa.setNomeCompleto(JOptionPane.showInputDialog("Nome completo:"));

    pessoa.setCpf(obterCPF());

    pessoa.setTelefone(JOptionPane.showInputDialog("Telefone:"));

    pessoa.setEndereco(JOptionPane.showInputDialog("Endereço:"));

    adoPETSystem.adicionarItem(pessoa);
    JOptionPane.showMessageDialog(null, "Pessoa interessada cadastrada com sucesso!");
}

private static void cadastrarReserva(SistemaAdoPET adoPETSystem) {
    Reserva reserva = new Reserva();

    reserva.setCpf(obterCPF());

    reserva.setData(JOptionPane.showInputDialog("Data da reserva (yyyy-MM-dd):"));

    reserva.setHorario(JOptionPane.showInputDialog("Horário da reserva:"));

    adoPETSystem.adicionarItem(reserva);
    JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso!");
}

private static void cadastrarEvento(SistemaAdoPET adoPETSystem) {
    Evento evento = new Evento();

    evento.setNome(JOptionPane.showInputDialog("Nome do evento:"));

    evento.setData(JOptionPane.showInputDialog("Data do evento (yyyy-MM-dd):"));

    evento.setHorario(JOptionPane.showInputDialog("Horário do evento (hh:mm):"));

    evento.setLocal(JOptionPane.showInputDialog("Local do evento:"));

    adoPETSystem.adicionarItem(evento);
    JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
}

private static void cadastrarRegistroAdocao(SistemaAdoPET adoPETSystem) {
    RegistroAdocao registro = new RegistroAdocao();

    registro.setCodigoAnimal(JOptionPane.showInputDialog("Código do animal adotado:"));

    registro.setCpfAdotante(obterCPF());

    adoPETSystem.adicionarItem(registro);
    JOptionPane.showMessageDialog(null, "Registro de adoção cadastrado com sucesso!");
    }
}