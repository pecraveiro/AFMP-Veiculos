import Controlador.ManutencaoC;
import Modelo.VeiculoM;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instanciar o controlador de manutenção
        ManutencaoC controladorManutencao = new ManutencaoC();


        // Criar um veículo de teste
        VeiculoM veiculo1 = new VeiculoM("", "Ford", "Fiesta", 2019, "Sedan", "Prata",
                55000.0f, new Date(), false, 122000, 2020);

        veiculo1.imprimeVeiculo();

        // Adicionar uma manutenção
        System.out.println("\n--- Adicionando uma nova manutenção ---");
        controladorManutencao.adicionarManutencao(veiculo1, 1, new Date());

        // Listar as manutenções
        System.out.println("\n--- Listando todas as manutenções ---");
        controladorManutencao.listarManutencoes();

        // Atualizar o status da manutenção
        System.out.println("\n--- Atualizando a manutenção com ID 1 para concluída ---");
        controladorManutencao.atualizarManutencao(1, new Date(), true); // Define como concluída

        // Remover a manutenção
        System.out.println("\n--- Removendo a manutenção com ID 1 ---");
        controladorManutencao.removerManutencao(1);

        // Listar as manutenções após a remoção
        System.out.println("\n--- Listando todas as manutenções após remoção ---");
        controladorManutencao.listarManutencoes();
    }
}