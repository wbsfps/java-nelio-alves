package demo_dao_jdbc.model.dao.impl;

import demo_dao_jdbc.db.DB;
import demo_dao_jdbc.db.DbException;
import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;
import secao13.exercicios.primeiro.entities.Departament;

import java.sql.*;
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
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("""
                   insert into seller
                   (name, email, birthdate, baseSalary, departmentId)
                   values(?, ?, ?, ?, ?);
                   """, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, seller.getName());
            statement.setString(2, seller.getEmail());
            statement.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
            statement.setDouble(4, seller.getBaseSalary());
            statement.setInt(5, seller.getDepartment().getId());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    seller.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error! No rows affected");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
        }
    }

    @Override
    public void update(Seller seller) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement(
                    """
                        update seller
                        set name = ?, email = ?, birthDate = ?, baseSalary = ?, departmentId = ?
                        where id = ?;
                        """
            );

            statement.setString(1, seller.getName());
            statement.setString(2, seller.getEmail());
            statement.setDate(3, new Date(seller.getBirthDate().getTime()));
            statement.setDouble(4, seller.getBaseSalary());
            statement.setInt(5, seller.getDepartment().getId());
            statement.setInt(6, seller.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
        }
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
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement("""
                    select seller.*, department.name as depName
                    from seller
                    left join department on seller.departmentId = department.id
                    order by name;
                    """);

            resultSet = statement.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();
            while (resultSet.next()) {
                Department department = map.get(resultSet.getInt("DepartmentId"));

                if (department == null) {
                    department = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("DepartmentId"), department);
                }

                Seller seller = instantiateSeller(resultSet, department);
                list.add(seller);
            }

            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }
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
