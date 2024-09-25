package Modelo;

import java.util.Date;

public class VendasM extends VeiculoM {
    private int id_vendas;
    private Date data_venda;
    private String cpf;
    private String chassi;
    private float valor_final;

    public VendasM(String chassi, String marca, String versao, int ano, String modelo, String cor, float preco, Date dataVenda, boolean codicao, float kmAtual, int anoCompra, int id_vendas, Date data_venda, String cpf, String chassi1, float valor_final) {
        super(chassi, marca, versao, ano, modelo, cor, preco, dataVenda, codicao, kmAtual, anoCompra);
        this.id_vendas = id_vendas;
        this.data_venda = data_venda;
        this.cpf = cpf;
        this.chassi = chassi1;
        this.valor_final = valor_final;
    }

    /* Construtor antigo precisa gerar novamente em cada máquina
        public VendasM(String chassi, String marca, String versao, int ano, String modelo, String cor, float preco, Date dataVenda, boolean codicao, int id_vendas, Date data_venda, String cpf, String chassi1, float valor_final) {
            super(chassi, marca, versao, ano, modelo, cor, preco, dataVenda, codicao);
            this.id_vendas = id_vendas;
            this.data_venda = data_venda;
            this.cpf = cpf;
            this.chassi = chassi1;
            this.valor_final = valor_final;
        }
    */
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

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public float getValor_final() {
        return valor_final;
    }

    public void setValor_final(float valor_final) {
        this.valor_final = valor_final;
    }
}
