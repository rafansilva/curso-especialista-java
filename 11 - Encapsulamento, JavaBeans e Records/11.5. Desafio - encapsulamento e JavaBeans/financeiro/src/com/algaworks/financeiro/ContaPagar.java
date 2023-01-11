package com.algaworks.financeiro;

import java.io.Serializable;

public class ContaPagar implements Serializable {

    private String descricao;
    private double valor;
    private String DataVencimento;
    private boolean pago = false;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPendente() {
        return !isPago();
    }

    public void pagar() {
        if (isPago()) {
            throw new RuntimeException("Conta já está paga");
        }

        pago = true;
    }

    public void cancelarPagamento() {
        if (isPendente()) {
            throw new RuntimeException("Conta está pendente de pagamento");
        }

        pago = false;
    }

}
