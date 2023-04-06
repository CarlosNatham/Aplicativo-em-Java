/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadeesportes;

/**
 *
 * @author 6444865
 *///Formas de pagamento
public class Pagamento {
    private String formaPag;//nome da forma de pagamento ex=Cartao..
    
    //SE FOR CARTAO
    private String titular;//nome da pessoa no cartao
    private int num;//numero do cartao
    private String bandeira;
    private int codSeg;//codigo de segurança do cartao
    private int qtdParcela;//quantidade de parcelas para parcelar a comrpa
    
    //SE FOR DINHIERO
    private float precoDinheiro;
    private float troco;
    
    //SE FOR CHEQUE
    private String precoCheque;//é string pq em cheque se escreve o valor por extenso da quantia
    private String nome;//NOME DA PESSOA NO CHEQUE
    private String cidade;
    private String data;
    
            
    ///PODEMOS COLOCAR TODAS AS VARIAVEIS AQUI E DEPOIS FAZER UM IF 
    /// EXEMPLO
    /// IF(PAGAMENTO==CREDTIO)
    /// pega a data de naascimento, numero do cartao e etc...

    /**
     * @return the formaPag
     */
    public String getFormaPag() {
        return formaPag;
    }

    /**
     * @param formaPag the formaPag to set
     */
    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the bandeira
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * @param bandeira the bandeira to set
     */
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * @return the codSeg
     */
    public int getCodSeg() {
        return codSeg;
    }

    /**
     * @param codSeg the codSeg to set
     */
    public void setCodSeg(int codSeg) {
        this.codSeg = codSeg;
    }

    /**
     * @return the qtdParcela
     */
    public int getQtdParcela() {
        return qtdParcela;
    }

    /**
     * @param qtdParcela the qtdParcela to set
     */
    public void setQtdParcela(int qtdParcela) {
        this.qtdParcela = qtdParcela;
    }

    /**
     * @return the precoDinheiro
     */
    public float getPrecoDinheiro() {
        return precoDinheiro;
    }

    /**
     * @param precoDinheiro the precoDinheiro to set
     */
    public void setPrecoDinheiro(float precoDinheiro) {
        this.precoDinheiro = precoDinheiro;
    }

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(float troco) {
        this.troco = troco;
    }

    /**
     * @return the precoCheque
     */
    public String getPrecoCheque() {
        return precoCheque;
    }

    /**
     * @param precoCheque the precoCheque to set
     */
    public void setPrecoCheque(String precoCheque) {
        this.precoCheque = precoCheque;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
                    
    
    
}
