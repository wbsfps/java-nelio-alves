package demo_dao_jdbc.model.dao.impl;

import demo_dao_jdbc.db.DB;
import demo_dao_jdbc.db.DbException;
import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;
import secao13.exercicios.primeiro.entities.Departament;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection connection;

    public SellerDaoJDBC(Connection conn) {
        this.connection = conn;
    }

    @Override
    public void insert(Seller seller) {

    }

    @Override
    public void update(Seller seller) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = connection.prepareStatement("""
                    select seller.*, department.Name as DepName
                    from seller
                    inner join department on seller.DepartmentId = department.Id
                    where seller.id = ?;
                    """);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                Department departament = instantiateDepartment(rs);
                Seller seller = instantiateSeller(rs, departament);

                return seller;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException{
        var departament = new Department();
        departament.setId(rs.getInt("DepartmentId"));
        departament.setName(rs.getString("DepName"));
        return departament;
    }

    private Seller instantiateSeller(ResultSet rs,  Department department) throws SQLException {
        var seller =new Seller();

        seller.setId(rs.getInt("Id"));
        seller.setName(rs.getString("Name"));
        seller.setEmail(rs.getString("Email"));
        seller.setBaseSalary(rs.getDouble("BaseSalary"));
        seller.setBirthDate(rs.getDate("BirthDate"));
        seller.setDepartment(department);

        return seller;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = connection.prepareStatement("""
                    select seller.*, department.Name as DepName
                    from seller
                    inner join department on seller.departmentId = department.Id
                    where seller.departmentId = ?
                    order by Name;
                    """);
            st.setInt(1, department.getId());
            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();
            while (rs.next()) {
                Department departament = map.get(rs.getInt("DepartmentId"));

                if (departament == null) {
                    departament = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), departament);
                }

                Seller seller = instantiateSeller(rs, departament);
                list.add(seller);
            }
            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
