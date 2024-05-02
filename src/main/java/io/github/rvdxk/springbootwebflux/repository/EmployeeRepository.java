package io.github.rvdxk.springbootwebflux.repository;

import io.github.rvdxk.springbootwebflux.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
