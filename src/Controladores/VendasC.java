package Controlador;

import Modelo.VendasM;
import Modelo.VeiculoM;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendasC {
    private List<VendasM> vendas;

    public VendasC() {
        vendas = new ArrayList<>();
    }

    // ---------------------------------------------------ADICIONAR---------------------------------------------------
    // Método para adicionar uma nova venda passando o objeto VeiculoM
    public void adicionarVenda(VeiculoM veiculo, int idVendas, Date dataVenda, String cpf) {
        float valorFinal = veiculo.veiculoUsado(veiculo.getPreco());
        VendasM novaVenda = new VendasM(veiculo, idVendas, dataVenda, cpf, valorFinal);
        vendas.add(novaVenda);
        System.out.println("Venda adicionada com sucesso!");
    }

    // ---------------------------------------------------LISTAR---------------------------------------------------
    // Método para listar todas as vendas
    public void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            for (VendasM venda : vendas) {
                venda.getVeiculo().imprimeVeiculo();  // Imprime detalhes do veículo
                System.out.println("CPF do comprador: " + venda.getCpf());
                System.out.println("Valor final da venda: R$ " + venda.getValor_final());
                System.out.println("Data da venda: " + venda.getData_venda());
            }
        }
    }

    //---------------------------------------------------BUSCAR---------------------------------------------------
    // Método para buscar uma venda por ID
    public VendasM buscarVendaPorId(int idVendas) {
        for (VendasM venda : vendas) {
            if (venda.getId_vendas() == idVendas) {
                return venda;  // Retorna a venda encontrada
            }
        }
        System.out.println("Venda com ID " + idVendas + " não encontrada.");
        return null;
    }

    //---------------------------------------------------ATUALIZAR---------------------------------------------------
    // Método para atualizar uma venda existente
    public void atualizarVenda(int idVendas, String cpf, Date dataVenda, float valorFinal) {
        VendasM venda = buscarVendaPorId(idVendas);
        if (venda != null) {
            venda.realizarVenda(cpf, dataVenda, valorFinal);
            System.out.println("Venda atualizada com sucesso!");
        }
    }

    // ---------------------------------------------------REMOVER---------------------------------------------------
    // Método para remover uma venda
    public void removerVenda(int idVendas) {
        VendasM venda = buscarVendaPorId(idVendas);
        if (venda != null) {
            vendas.remove(venda);
            System.out.println("Venda removida com sucesso!");
        } else {
            System.out.println("Venda com ID " + idVendas + " não encontrada.");
        }
    }
}
