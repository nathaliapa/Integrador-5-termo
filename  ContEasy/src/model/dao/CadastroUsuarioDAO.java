
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import  model.bean.CadastroUsuario;


public class CadastroUsuarioDAO {
    
    public void create(CadastroUsuario cu) throws SQLException {
        
        Connection con = ConnectionFactory.conectar();
        PreparedStatement stmt = null;
        
        try {
            // comando de inserir dados no banco 
            // tmar cuidado na hora de colocar ? nos values pois tem que ter a mesma quantidade de colunas.
            stmt = con.prepareStatement("INSERT INTO cadastrousuario(NOMECOMPLETO,USUARIO,SENHA,CONFSENHA,EMAIL) VALUES (?,?,?,?,?) ");
           
            stmt.setString(1, cu.getNomecompleto());
            stmt.setString(2, cu.getUsuario());
            stmt.setString(3, cu.getSenha());
            stmt.setString(4, cu.getConfsenha());
            stmt.setString(5, cu.getEmail());
            
            
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
           
        }
    }
    
    
}
