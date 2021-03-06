package com.stpl.springJspExample.model;
// Generated Jul 18, 2017 2:50:32 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employee", schema = "dbo", catalog = "Porchelvi")
public class EmployeeBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeid;
	private int employeeno;
	private String employeename;
	private Integer employeesalary;

	public EmployeeBean() {
	}

	public EmployeeBean(int employeeid) {
		this.employeeid = employeeid;
	}

	public EmployeeBean(int employeeid, String employeename, Integer employeesalary, int employeeno) {
		this.employeeid = employeeid;
		this.employeeno = employeeno;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}

	@Id

	@Column(name = "employeeid", unique = true, nullable = false)
	public int getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	@Column(name = "employeename", length = 12)
	public String getEmployeename() {
		return this.employeename;
	}

	@Column(name = "employeeno")
	public int getEmployeeno() {
		return employeeno;
	}

	public void setEmployeeno(int employeeno) {
		this.employeeno = employeeno;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	@Column(name = "employeesalary")
	public Integer getEmployeesalary() {
		return this.employeesalary;
	}

	public void setEmployeesalary(Integer employeesalary) {
		this.employeesalary = employeesalary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeid=" + employeeid + ", employeeno=" + employeeno + ", employeename="
				+ employeename + ", employeesalary=" + employeesalary + "]";
	}
	
	

}
