package com.example.demo.cmm.utl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnTest {
	
	static class DBConst{
		public static final String ORACLE_DRIVER = "";
		public static final String MYSQL_DRIVER = "";
		public static final String MARIA_DRIVER = "";
		public static final String MSSQL_DRIVER = "";
		public static final String URL = "";
		public static final String USERNAME = "";
		public static final String PASSWORD = "";
		
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
			} catch (Exception e) {
				System.out.println("DB 접속 실패");
				e.printStackTrace();
			}
		}
		List<?> getValue(){
			var list = new ArrayList<>();
			String sql = String.format("select * from managers");
			try {
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					list.add(rs.getString("email"));
				}
			} catch (SQLException e) {
				System.out.println("테이블 접속 실패");
				e.printStackTrace();
			}
			
			return list;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("DB 테스트");
	}
}
