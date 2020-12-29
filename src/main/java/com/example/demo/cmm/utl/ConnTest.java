package com.example.demo.cmm.utl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*
jdbc.driverClassName=org.mariadb.jdbc.Driver
jdbc.url=jdbc:mariadb://localhost:3306/mariadb
jdbc.username=root
jdbc.password=root
 * */
public class ConnTest {
	
	static class DBConst{
		public static final String ORACLE_DRIVER = "";
		public static final String MYSQL_DRIVER = "";
		public static final String MARIA_DRIVER = "org.mariadb.jdbc.Driver";
		public static final String MSSQL_DRIVER = "";
		public static final String URL = "jdbc:mariadb://localhost:3306/mariadb";
		public static final String USERNAME = "root";
		public static final String PASSWORD = "root";
	}
	static class TestDAO{
		Connection conn;
		Statement stmt;
		TestDAO() {
			try {
				Class.forName(DBConst.MARIA_DRIVER);
				conn = DriverManager.getConnection(
						DBConst.URL, 
						DBConst.USERNAME,
						DBConst.PASSWORD);
				stmt = conn.createStatement();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		List<?> getValue(String tabName, String colName){
			var list = new ArrayList<>();
			String sql = String.format("select * from %s", tabName);
			try {
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					list.add(rs.getString(colName));
				}
			} catch (SQLException e) {
				System.out.println("테이블 접속 실패");
				e.printStackTrace();
			}
			if(list.size() == 0) {
				System.out.println("해당 테이블에 등록된 값이 없습니다");
			}
			return list;
		}
		
	}
	
	public static void main(String... args) {
		System.out.println("DB 테스트");
		TestDAO instance = new TestDAO();
		System.out.println("리스트에 있는 값: "+instance.getValue("managers","email"));
	}
}
