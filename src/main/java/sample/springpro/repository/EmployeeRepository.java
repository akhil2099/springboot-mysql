package sample.springpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.springpro.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
