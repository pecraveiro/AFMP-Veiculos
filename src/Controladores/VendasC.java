import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendaController {
    private List<VendasM> listaDeVendas = new ArrayList<>();

    // Cadastrar uma nova venda
    public void cadastrarVenda(VendasM venda) {
        listaDeVendas.add(venda);
        System.out.println("Venda cadastrada com sucesso!");
    }

    // Atualizar uma venda existente
    public void atualizarVenda(int idVendas, String cpf, Date dataVenda, float valorFinal) {
        for (VendasM venda : listaDeVendas) {
            if (venda.getIdVendas() == idVendas) {
                venda.realizarVenda(cpf, dataVenda, valorFinal);
                System.out.println("Venda atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Venda não encontrada.");
    }

    // Excluir uma venda
    public void excluirVenda(int idVendas) {
        VendasM vendaARemover = null;
        for (VendasM venda : listaDeVendas) {
            if (venda.getIdVendas() == idVendas) {
                vendaARemover = venda;
                break;
            }
        }

        if (vendaARemover != null) {
            listaDeVendas.remove(vendaARemover);
            System.out.println("Venda excluída com sucesso!");
        } else {
            System.out.println("Venda não encontrada.");
        }
    }

    // Buscar uma venda pelo CPF
    public VendasM buscarVendaPorCpf(String cpf) {
        for (VendasM venda : listaDeVendas) {
            if (venda.getCpf().equals(cpf)) {
                return venda;
            }
        }
        System.out.println("Nenhuma venda encontrada para o CPF informado.");
        return null;
    }

    // Listar todas as vendas
    public void listarVendas() {
        if (listaDeVendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada.");
        } else {
            for (VendasM venda : listaDeVendas) {
                venda.imprimeVeiculo();
                System.out.println("CPF do comprador: " + venda.getCpf());
                System.out.println("Valor final da venda: R$ " + venda.getValorFinal());
                System.out.println("Data da venda: " + venda.getDataVenda());
            }
        }
    }
}
