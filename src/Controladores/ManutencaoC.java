package Controlador;

import Modelo.ManutencaoM;
import Modelo.VeiculoM;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManutencaoC {
    private List<ManutencaoM> manutencoes;

    public ManutencaoC() {
        manutencoes = new ArrayList<>();
    }
    // ---------------------------------------------------ADICIONAR---------------------------------------------------
    // Método para adicionar uma nova manutenção passando o objeto VeiculoM
    public void adicionarManutencao(VeiculoM veiculo, int idManutencao, Date dataservico) {
        ManutencaoM novaManutencao = new ManutencaoM(veiculo.getChassi(), veiculo.getMarca(), veiculo.getVersao(),
                veiculo.getAno(), veiculo.getModelo(), veiculo.getCor(),
                veiculo.getPreco(), veiculo.getDataVenda(), veiculo.isCondicao(),
                veiculo.getKmAtual(), veiculo.getAnoCompra(), idManutencao,
                dataservico);
        manutencoes.add(novaManutencao);
        System.out.println("Manutenção adicionada com sucesso!");
    }

    // ---------------------------------------------------LISTAR---------------------------------------------------
    // Método para listar todas as manutenções
    public void listarManutencoes() {
        if (manutencoes.isEmpty()) {
            System.out.println("Nenhuma manutenção registrada.");
        } else {
            for (ManutencaoM manutencao : manutencoes) {
                manutencao.imprimeManutencao();
            }
        }
    }

    //---------------------------------------------------BUSCAR---------------------------------------------------
    // Método para buscar uma manutenção por ID
    public ManutencaoM buscarManutencaoPorId(int id) {
        for (ManutencaoM manutencao : manutencoes) {
            if (manutencao.getIdManutencao() == id) {
                return manutencao; // Retorna a manutenção
            }
        }
        System.out.println("Manutenção com ID " + id + " não encontrada.");
        return null;
    }
    //---------------------------------------------------ATUALIZAR---------------------------------------------------
    // Método para atualizar uma manutenção
    public void atualizarManutencao(int idManutencao, Date dataservico, boolean status) {
        ManutencaoM manutencao = buscarManutencaoPorId(idManutencao);
        if (manutencao != null) {
            manutencao.setDataservico(dataservico);
            manutencao.setStatus(status); // Atualiza o status
            System.out.println("Manutenção atualizada com sucesso!");
            manutencao.imprimeManutencao();
        }
    }



    // ---------------------------------------------------REMOVER---------------------------------------------------
    // Método para remover uma manutenção
    public void removerManutencao(int idManutencao) {
        ManutencaoM manutencao = buscarManutencaoPorId(idManutencao);
        if (manutencao != null) {
            manutencoes.remove(manutencao);
            System.out.println("Manutenção removida com sucesso!");
        }
    }
}