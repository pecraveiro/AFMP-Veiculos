package Models;

import java.util.Date;

public class ManutencaoM extends VeiculoM {
    private int idManutencao;
    private Date dataservico;
    private int tempoServico;
    private float custo;
    private boolean status;
    public ManutencaoM(String chassi, String marca, String versao, int ano, String modelo, String cor, float preco, Date dataVenda, boolean codicao, float kmAtual, int idManutencao, Date dataservico, int tempoServico, float custo, boolean status) {
        super(chassi, marca, versao, ano, modelo, cor, preco, dataVenda, codicao, kmAtual);
        this.idManutencao = idManutencao;
        this.dataservico = dataservico;
        this.tempoServico = tempoServico;
        this.custo = custo;
        this.status = status;
    }
    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public Date getDataservico() {
        return dataservico;
    }

    public void setDataservico(Date dataservico) {
        this.dataservico = dataservico;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}