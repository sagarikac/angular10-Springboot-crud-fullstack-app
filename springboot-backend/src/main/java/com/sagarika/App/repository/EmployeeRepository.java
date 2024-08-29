package com.sagarika.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagarika.App.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
