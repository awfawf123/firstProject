package com.yedam.database;

public interface EmpService {
	public Employee[] showList(); // 전체리스트
	public void addEmp(Employee emp);
	public void modEmp(Employee emp);
	public void delEmp(int empId);

}
