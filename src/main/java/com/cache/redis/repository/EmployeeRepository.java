package com.cache.redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cache.redis.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}