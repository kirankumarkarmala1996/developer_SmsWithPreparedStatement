package com.Innovative.Queries;

public interface SqlQueries {
	static String INSERT_SQL = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
	static String SELECT_ALL = "SELECT * FROM student";
	static String UPDATE_SQL = "UPDATE STUDENT SET NAME=?, Address=? WHERE SID=?";
	static String DELETE_SQL = "DELETE FROM STUDENT WHERE SID=?";
	static String FINDBY_ID_SQL="select name=?,Address=?,PhNumber=?,fee=?,email=? from student where sid=?;";

}
