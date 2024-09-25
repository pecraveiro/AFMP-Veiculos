import Modelo.ManutencaoM;
import Modelo.VeiculoM;
import Modelo.VendasM;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Teste da classe VeiculoM
        System.out.println("Testando VeiculoM:");
        VeiculoM veiculo = new VeiculoM("", "Toyota", "Corolla", 2020, "Sedan", "Prata", 80000.0f, new Date(), false, 15000.0f, 2020);
        veiculo.imprimeVeiculo();

        System.out.println("\nTestando veiculoUsado:");
        float precoUsado = veiculo.veiculoUsado(veiculo.getPreco());
        System.out.println("Preço após cálculo de uso: " + precoUsado);

        // Teste da classe ManutencaoM
        System.out.println("\nTestando ManutencaoM:");
        ManutencaoM manutencao = new ManutencaoM(veiculo.getChassi(), veiculo.getMarca(), veiculo.getVersao(), veiculo.getAno(), veiculo.getModelo(), veiculo.getCor(), veiculo.getPreco(), veiculo.getDataVenda(), veiculo.isCodicao(), 1, new Date(), 0, 0.0f, false);

        System.out.println("\nVerificando manutenção:");
        ManutencaoM.verificarManutencao(veiculo.getKmAtual());

        System.out.println("\nCalculando tempo de serviço:");
        int tempoServico = manutencao.tempoServico();
        System.out.println("Tempo de serviço estimado: " + tempoServico + " horas");

        System.out.println("\nCalculando custo da manutenção:");
        manutencao.tempoCusto(veiculo.getKmAtual());

        System.out.println("\nImprimindo detalhes da manutenção:");
        manutencao.imprimeManutencao();

        // Teste da classe VendasM
        System.out.println("\nTestando VendasM:");
        VendasM venda = new VendasM(veiculo.getChassi(), veiculo.getMarca(), veiculo.getVersao(), veiculo.getAno(), veiculo.getModelo(), veiculo.getCor(), veiculo.getPreco(), veiculo.getDataVenda(), veiculo.isCodicao(), veiculo.getKmAtual(), veiculo.getAno(), 1, new Date(), "123.456.789-00", veiculo.getChassi(), precoUsado);

        System.out.println("ID da venda: " + venda.getId_vendas());
        System.out.println("Data da venda: " + venda.getData_venda());
        System.out.println("CPF do comprador: " + venda.getCpf());
        System.out.println("Chassi do veículo: " + venda.getChassi());
        System.out.println("Valor final da venda: " + venda.getValor_final());
    }
}