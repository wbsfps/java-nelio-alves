package secao20.transacoes.application;

import secao20.recupera_dados.db.DbException;
import secao20.transacoes.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement st = null;

        try {
          conn = DB.getConnection();

          st = conn.prepareStatement("""
                  UPDATE seller
                  SET BaseSalary = BaseSalary + ?
                  WHERE (DepartmentId = ?)
                  """);
          st.setDouble(1, 200.0);
          st.setInt(2, 2);

          int rowsAffected = st.executeUpdate();
          System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
