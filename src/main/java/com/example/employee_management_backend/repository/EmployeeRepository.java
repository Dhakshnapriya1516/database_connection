
package com.example.employee_management_backend.repository;

import com.example.employee_management_backend.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository
        extends MongoRepository<Employee, String> {

}
