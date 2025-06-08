package demo_dao_jdbc.application;

import demo_dao_jdbc.db.DB;
import demo_dao_jdbc.model.dao.DaoFactory;
import demo_dao_jdbc.model.dao.DepartmentDao;
import demo_dao_jdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Test 1: Department findById");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("Test 2: Department insert");
        Department newDepartment = new Department(null, "Cars");
        departmentDao.insert(newDepartment);
        System.out.println(newDepartment);

        System.out.println("Test 3: Department update");
        department = departmentDao.findById(8);
        department.setName("D6");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("Test 5: Department findAll");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("Test 6: Department deleteById");
        var id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed");
    }
}
