package net.javaguides.EmployeeManagementSystem.repository;

import net.javaguides.EmployeeManagementSystem.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
