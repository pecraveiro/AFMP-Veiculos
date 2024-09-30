package Modelo;

import java.util.Date;

public class VendasM {
    private int id_vendas;
    private Date data_venda;
    private String cpf;
    private float valor_final;
    private VeiculoM veiculo; // Objeto VeiculoM como parâmetro

    // Construtor que recebe o VeiculoM como um dos parâmetros
    public VendasM(VeiculoM veiculo, int id_vendas, Date data_venda, String cpf, float valor_final) {
        this.veiculo = veiculo; // Inicializando o objeto VeiculoM
        this.id_vendas = id_vendas;
        this.data_venda = data_venda;
        this.cpf = cpf;
        this.valor_final = valor_final;
    }

    // Getters e Setters
    public int getId_vendas() {
        return id_vendas;
    }

    public void setId_vendas(int id_vendas) {
        this.id_vendas = id_vendas;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getValor_final() {
        return valor_final;
    }

    public void setValor_final(float valor_final) {
        this.valor_final = valor_final;
    }
    public VeiculoM getVeiculo() {
        return veiculo;
    }
    // Método para realizar a venda
    public void realizarVenda(String cpf, Date dataVenda, float valorFinal) {
        this.cpf = cpf;
        this.data_venda = dataVenda;
        this.valor_final = valorFinal;

        System.out.println("Venda realizada com sucesso!");
        veiculo.imprimeVeiculo(); // Exibir as informações do veículo vendido
        System.out.println("CPF do comprador: " + cpf);
        System.out.println("Valor final da venda: R$ " + valorFinal);
        System.out.println("Data da venda: " + dataVenda);
    }


}
