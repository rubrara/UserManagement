package com.mysite.employee.repository;

import com.mysite.employee.entity.EmployeeEntity;
import com.mysite.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
