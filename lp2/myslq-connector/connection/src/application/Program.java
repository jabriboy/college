package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();  // cria a conexão com o banco
			st = conn.createStatement(); // instancia um objeto de Statement
			rs = st.executeQuery("select * from departamento");  //permite entrar com a string que representa o comando SQL 
			while (rs.next() != false) {    // enquanto tiver linhas na tabela o laço será executado
				System.out.println (rs.getInt("id") + " - "+rs.getString("nome"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			// fecha os recursos abertos
			DB.closeResultSet(rs);
			DB.closeStatement(st);

			DB.closeConnection();
		}
	}
}
