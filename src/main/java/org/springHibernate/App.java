package org.springHibernate;

import org.springHibernate.config.HibernateConfig;
import org.springHibernate.model.Employee;
import org.springHibernate.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HibernateConfig.class);

        EmployeeService service = context.getBean(EmployeeService.class);





        Employee employee = new Employee();

        employee.setFirstName("gagandeep");
        employee.setLastName("kaur");
        employee.setSalary(30000);

        /*
         * save an employee
         */

        service.saveEmployee(employee);

        /*
         * delete an employee
         */
        //service.deleteEmployeeById(1);

        /*
         * fetch an employee
         */

        //String emp = service.findById(2);
        //System.out.println(emp);


        /*
         * update an employee
         */

        //service.updateEmployeeById(3);

        context.close();
    }
    }


