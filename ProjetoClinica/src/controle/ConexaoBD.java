/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Desenv6-PC
 */
public class ConexaoBD {
 
   public   Statement stm;
   public   ResultSet rs;
   public   Connection con;
   private  String driver   = "org.postgresql.Driver";
   private  String caminho  = "jdbc:postgresql://localhost:5432/projetoclinica";
   private  String usuario  = "postgres";
   private  String senha    = "terra";
   
   public void conexao(){
       try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho,usuario,senha);
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Não foi Possivel Conectar! \n" + ex.getMessage());
           //Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public void desconecta(){
       try {
           con.close();
           JOptionPane.showMessageDialog(null,"BD Desconectado com Sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Não foi possivel Desconectar!\n" + ex.getMessage());
           //Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
