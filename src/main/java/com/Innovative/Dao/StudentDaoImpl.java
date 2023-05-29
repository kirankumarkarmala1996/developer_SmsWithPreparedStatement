package com.Innovative.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Innovative.Queries.SqlQueries;
import com.Innovative.Utils.ConnectionUtils;
import com.Innovative.model.InnovativeStudent;

public class StudentDaoImpl implements StudentDao {

	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	@Override
	public void save(InnovativeStudent invStudent) {
		try {
			connection = ConnectionUtils.openConnection();
			ps = connection.prepareStatement(SqlQueries.INSERT_SQL);
			ps.setInt(1, invStudent.getId());
			ps.setString(2, invStudent.getName());
			ps.setString(3, invStudent.getAddress());
			ps.setLong(4, invStudent.getPhNumber());
			ps.setDouble(5, invStudent.getFee());
			ps.setString(6, invStudent.getEmail());
			int result = ps.executeUpdate();
			System.out.println(result + "saved details succesfully....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConnection(connection, ps);
		}
	}

	@Override
	public void update(InnovativeStudent invStudent) {

		try {
			connection = ConnectionUtils.openConnection();
			ps = connection.prepareStatement(SqlQueries.UPDATE_SQL);
			ps.setString(1, invStudent.getName());
			ps.setString(2, invStudent.getAddress());
			ps.setInt(3, invStudent.getId());
			int result = ps.executeUpdate();
			System.out.println(result + "updated succesfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConnection(connection, ps);
		}

	}

	@Override
	public void findById(InnovativeStudent invID) {

		try {
			connection = ConnectionUtils.openConnection();
			ps = connection.prepareStatement(SqlQueries.FINDBY_ID_SQL);
			ps.setInt(1, invID.getId());
			ps.setString(2, invID.getName());
			ps.setString(3, invID.getAddress());
			ps.setLong(4, invID.getPhNumber());
			ps.setDouble(5, invID.getFee());
			ps.setString(6, invID.getEmail());
			rs = ps.executeQuery();
			System.out.println(rs + "Find ById succesfully......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConnection(connection, ps, rs);
		}

	}

	@Override
	public void delete(InnovativeStudent invID) {

		try {
			connection = ConnectionUtils.openConnection();
			ps = connection.prepareCall(SqlQueries.DELETE_SQL);
			ps.setInt(1, invID.getId());
			int result = ps.executeUpdate();
			System.out.println(result + "delete succesfully.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConnection(connection, ps);
		}
	}

	@Override
	public List<InnovativeStudent> findAll() {
		List<InnovativeStudent> list = new ArrayList<InnovativeStudent>();
		try {
			connection = ConnectionUtils.openConnection();
			ps = connection.prepareStatement(SqlQueries.SELECT_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				InnovativeStudent student = new InnovativeStudent();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAddress(rs.getString(3));
				student.setPhNumber(rs.getLong(4));
				student.setFee(rs.getDouble(5));
				student.setEmail(rs.getString(6));
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConnection(connection, ps, rs);
		}
		return list;
	}

//	save
//java.sql.SQLException: Column count doesn't match value count at row 1

}
