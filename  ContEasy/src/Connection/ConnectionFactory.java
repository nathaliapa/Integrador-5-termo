package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
        
        private static final String URL = "jdbc:mysql://localhost:3306/dados";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	//private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	public static Connection conectar() throws SQLException {
		
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
		
	}
	
          public static void closeConnection(Connection con) {
            
            if(con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
            public static void closeConnection(Connection con,PreparedStatement stmt){
            
                closeConnection(con);
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
            
       public static void closeConnection(Connection con,PreparedStatement stmt,ResultSet rs ){
            
                closeConnection(con);
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
            
         
        //test da conexao
        
	public static void main(String[] args) {
		
		try {
			Connection conexao = ConnectionFactory.conectar();
			System.out.println("Conexao realizada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("nao foi possivel conectar");
		}
	}
}
