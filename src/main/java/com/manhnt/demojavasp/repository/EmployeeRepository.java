package com.manhnt.demojavasp.repository;

import com.manhnt.demojavasp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
