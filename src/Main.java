import Controladores.ManutencaoC;
import Modelo.VeiculoM;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------------------------- CRIANDO O TESTE DE MANUTENCAO C -------------------------------------------");
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

        System.out.println("------------------------------------------- CRIANDO O TESTE DE VENDAS C -------------------------------------------");
        VendasC controladorDeVendas = new VendasC();

        // Criando um objeto VeiculoM para usar nas vendas
        VeiculoM veiculo3 = new VeiculoM("", "Toyota", "Corolla", 2020, "Sedan", "Branco", 85000, new Date(), false, 0, 2024);
        VeiculoM veiculo4 = new VeiculoM("", "Pegout", "208", 2020, "Style", "Preto", 70000, new Date(), true, 110000, 2020);

        // Testando o método adicionarVenda
        controladorDeVendas.adicionarVenda(veiculo3, 1, new Date(), "123.456.789-00");
        controladorDeVendas.adicionarVenda(veiculo4, 2, new Date(), "987.654.321-00");

        // Listando as vendas adicionadas
        System.out.println("---- Lista de Vendas ----");
        controladorDeVendas.listarVendas();

        // Testando o método atualizarVenda
        System.out.println("\n---- Atualizando Venda ID 1 ----");
        controladorDeVendas.atualizarVenda(1, "123.456.789-00", new Date(), 92000);

        // Listando novamente as vendas para conferir a atualização
        System.out.println("\n---- Lista de Vendas Após Atualização ----");
        controladorDeVendas.listarVendas();

        // Testando o método removerVenda
        System.out.println("\n---- Removendo Venda ID 1 ----");
        controladorDeVendas.removerVenda(1);

        // Listando novamente as vendas para conferir a remoção
        System.out.println("\n---- Lista de Vendas Após Remoção ----");
        controladorDeVendas.listarVendas();
    }
}