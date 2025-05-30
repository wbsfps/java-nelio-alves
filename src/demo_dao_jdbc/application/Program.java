package demo_dao_jdbc.application;

import demo_dao_jdbc.db.DB;
import demo_dao_jdbc.model.entities.Department;
import secao20.transacoes.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
}
