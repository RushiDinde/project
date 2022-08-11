package com.example.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public boolean saveEmployee(Employee employee) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		boolean isAdded = false;
		try {
			Employee emp = session.get(Employee.class, employee.getEid());
			if (emp == null) {
				System.out.println(employee);
				session.save(employee);
				transaction.commit();
				isAdded = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isAdded;
	}

	@Override
	public Employee getEmployee(int eid) {
		Session session = sf.openSession();
		Employee employee = null;
		try {
			employee = session.get(Employee.class, eid);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return employee;
	}

}
