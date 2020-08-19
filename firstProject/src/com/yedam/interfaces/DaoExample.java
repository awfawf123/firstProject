package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		MySqlDb dao = new MySqlDb(); //oracledb -> mysqldb
		
		dao.select();
		dao.insert();
		dao.update();
	}

}
