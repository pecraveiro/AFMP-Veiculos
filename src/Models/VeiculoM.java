package Models;

import java.util.Date;

public class VeiculoM {
    private String chassi;
    private String marca;
    private String versao;
    private int ano;
    private String modelo;
    private String cor;
    private float preco;
    private Date dataVenda;
    private boolean codicao;
    private float kmAtual;
    public VeiculoM(String chassi, String marca, String versao, int ano, String modelo, String cor, float preco, Date dataVenda, boolean codicao, float kmAtual) {
        this.chassi = chassi;
        this.marca = marca;
        this.versao = versao;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.dataVenda = dataVenda;
        this.codicao = codicao;
        this.kmAtual = kmAtual;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public boolean isCodicao() {
        return codicao;
    }

    public void setCodicao(boolean codicao) {
        this.codicao = codicao;
    }
    public float getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(float kmAtual) {
        this.kmAtual = kmAtual;
    }
}
