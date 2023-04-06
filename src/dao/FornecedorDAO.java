/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import lojadeesportes.Cliente;
import lojadeesportes.Fornecedor;

/**
 *
 * @author gabriel
 */
public class FornecedorDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaDeEsportesPU");
        return factory.createEntityManager();
    }
    
    public Fornecedor salvar(Fornecedor fornecedor){
        EntityManager em = getEM();
        try{
            em.getTransaction().begin();
            em.persist(fornecedor);
            em.getTransaction().commit();
        } catch(Exception e){
            em.getTransaction().rollback();
        } finally{
            em.close();
        }
        return fornecedor;
    }
    
    public void excluir(Fornecedor mod){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE Id = ?");
            stmt.setInt(1,mod.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir.\n" + ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}