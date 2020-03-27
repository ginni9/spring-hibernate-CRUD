package org.springHibernate.dao;


import org.hibernate.SessionFactory;

import org.springHibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {

    @Autowired
    private SessionFactory sessionFactory;



    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);

    }


   public void deleteEmployeeById(int id) {
       Employee employee=sessionFactory.getCurrentSession().get(Employee.class, id);
        sessionFactory.getCurrentSession().delete(employee);
    }


    public String findById(int id){
        Employee employee=sessionFactory.getCurrentSession().get(Employee.class, id);
        return employee.toString();
    }


    public void updateEmployeeById(int id){
        Employee employee=sessionFactory.getCurrentSession().get(Employee.class, id);
        employee.setFirstName("shriya");
        sessionFactory.getCurrentSession().update(employee);
    }

}