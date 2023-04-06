/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadeesportes;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen - PC
 */
public class ControlFuncionario {

    Funcionario func = new Funcionario();

    public void salvar(Funcionario func) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_login_register", "root", "");
            PreparedStatement pst = con.prepareStatement("insert into users( nome, username, password, salario) values(?, ?, ?, ?)");
            pst.setString(1, func.getNome());
            pst.setString(2, func.getUsername());
            pst.setString(3, func.getPassword());
            pst.setFloat(4, func.getSalario());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nErro:" + e);
        }
    }
}
