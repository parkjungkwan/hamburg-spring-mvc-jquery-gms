package com.example.demo.cmm.enm;

public enum Sql {
	TRUNCATE_STUDENTS;
	@Override
	public String toString() {
		String query = "";
		switch(this) {
		case TRUNCATE_STUDENTS:
			query = "truncate table students";
		}
		return query;
	}
}
