package secao20.primeira_conexao_com_o_jdbc.application;

import secao20.primeira_conexao_com_o_jdbc.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
