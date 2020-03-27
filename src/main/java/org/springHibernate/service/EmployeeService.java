package org.springHibernate.service;

import org.springHibernate.dao.UserRepository;
import org.springHibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service

public class EmployeeService{

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveEmployee(Employee employee) {
        userRepository.saveEmployee(employee);
    }

    @Transactional
   public void deleteEmployeeById(int id) {
        userRepository.deleteEmployeeById(id);
    }

    @Transactional
   public String findById(int id) {
        return userRepository.findById(id);
    }

    @Transactional
    public void updateEmployeeById(int id){
        userRepository.updateEmployeeById(id);
    }
}