package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	
	//입력
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
	//	insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
	//	value(301, 'test', 'test', '2020-05-05', 'IT_PROG');
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)"
				+ " values(" + emp.getEmployeeId()
				+",\'"+emp.getLastName()
				+"\',\' "+ emp.getEmail()
				+"\',\' "+ emp.getHireDate()
				+"\',\' "+ emp.getJobId()
				+"\')";
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r +"건 입력되었습니다.");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//삭제
	public void removeEmp(int eId) {
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id = " + eId;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r +"건 삭제되었습니다.");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//수정
	public void changeEmp(int eId, int salary) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp set salary = "+" salary + employee_id";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r +"건 수정되었습니다.");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		
	
		
	
	
	//조회
	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				String firstName = rs.getNString("first_name");
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				
				employees[idx++] = emp;

			}
			System.out.println(" -- end of data --");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;

	}// end of main()

}// end of class
