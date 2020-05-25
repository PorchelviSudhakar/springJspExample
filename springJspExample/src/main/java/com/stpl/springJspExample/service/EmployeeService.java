package com.stpl.springJspExample.service;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.stpl.springJspExample.model.EmployeeBean;

public class EmployeeService {

	@Autowired
	SessionFactory factory;

	public void insert(EmployeeBean employeebean) throws ClassNotFoundException, SQLException, NamingException {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(employeebean);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void delete(EmployeeBean studentbean) throws NamingException, SQLException {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		try {

			session.delete(studentbean);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void update(EmployeeBean studentbean) throws NamingException, SQLException {

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		try {

			session.update(studentbean);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<EmployeeBean> display() {
		List<EmployeeBean> employeeList;
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		employeeList = session.createCriteria(EmployeeBean.class).list();
		t.commit();
		return employeeList;
	}

	public List<EmployeeBean> search(int employeeid) throws NamingException, SQLException {

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Criteria criteria = session.createCriteria(EmployeeBean.class);
		criteria.add(Restrictions.eq("employeeid", employeeid));
		@SuppressWarnings("unchecked")
		List<EmployeeBean> list = criteria.list();
		t.commit();
		return list;

	}
}
