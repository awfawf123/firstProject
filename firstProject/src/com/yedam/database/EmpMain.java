package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;



public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int selectNo = 0;
			try {
				selectNo = scn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자를 선택하세요");
				scn.nextLine();
			}
			
			
			scn.nextLine();
			if(selectNo == 1) {
//				EmpDAO dao = new EmpDAO();
				Employee[] emps = service.showList();//dao.getEmpList();
				for(Employee emp : emps) {
					if(emp != null)
					System.out.println(emp.toString());
				}
				
			}else if(selectNo == 2) {
//			EmpDAO dao = new EmpDAO();
				System.out.println("사원번호 입력> ");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("이름 입력> ");
				String empName = scn.nextLine();
				System.out.println("이메일입력> ");
				String empEmail = scn.nextLine();
				System.out.println("입사일 입력");
				String empHiredate = scn.nextLine();
				
				
				Employee emp = new Employee(empId,empName,empEmail,empHiredate,"IT_PROG");
				service.addEmp(emp);//dao.addEmployee(emp);
				
			}else if(selectNo == 3) {
				System.out.println("사원번호 수정: ");
				int eId = scn.nextInt();
				System.out.println("급여 입력: ");
				int salary = scn.nextInt();scn.nextLine();
				Employee emp = new Employee();
				emp.setSalary(salary);
				emp.setEmployeeId(eId);
//				EmpDAO dao = new EmpDAO();
				service.modEmp(emp);//dao.changeEmp(eId, salary);
				
			}else if(selectNo == 4) {
				System.out.println("사원번호 삭제: ");
				int delId = scn.nextInt();scn.nextLine();
				Employee emp = new Employee();
//				EmpDAO dao = new EmpDAO();
				service.delEmp(delId);//dao.removeEmp(delId);
				
			}else if(selectNo == 9) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
