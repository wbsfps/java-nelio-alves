package secao20.inserir_dados.application;


import secao20.inserir_dados.db.DB;
import secao20.recupera_dados.db.DbException;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Connection;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();

            /* st = conn.prepareStatement("""
                    INSERT INTO seller(Name, Email, BirthDate, BaseSalary, DepartmentId)
                    VALUES(?,?,?,?,?);
                    """, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Kevin");
            st.setString(2, "kevin@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/08/2000").getTime()));
            st.setDouble(4, 3500.0);
            st.setInt(5, 4);
            */
            st = conn.prepareStatement("""
                    insert into department(Name) values("D1"),("D2");
                    """, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();

           int rowsAffected = st.executeUpdate();
           if (rowsAffected > 0) {
               ResultSet rs = st.getGeneratedKeys();
               while (rs.next()) {
                   int id = rs.getInt(1);
                   System.out.println("Done! Id = " + id);
               }
           } else {
               System.out.println("No rows affected!");
           }
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
