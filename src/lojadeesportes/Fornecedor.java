/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadeesportes;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
/**
 *
 * @author 6444865
 */
public class Fornecedor {
   @Id
   private int Id;
   private String CNPJ;
   private String nome;
   private int ie;

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
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the ie
     */
    public int getIe() {
        return ie;
    }

    /**
     * @param ie the ie to set
     */
    public void setIe(int ie) {
        this.ie = ie;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    
}
