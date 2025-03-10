package secao20.deletando_dados.application;

import secao20.deletando_dados.db.DB;
import secao20.deletando_dados.db.DbIntegrityException;
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
                  DELETE FROM department
                  WHERE (Id = ?)
                  """);

          st.setInt(1, 2);

          int rowsAffected = st.executeUpdate();
          System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
