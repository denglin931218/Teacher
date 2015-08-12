package com.sql.itcast;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IStudentImpl implements IStudentDAO{
	private static SqlMapClient sqlMapClient= null;
	static{
		try {
			Reader reader = com.ibatis.common.resources.Resources
			.getResourceAsReader("com/sql/itcast/SqlMapConfig.xml");
			sqlMapClient = com.ibatis.sqlmap.client.SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public void addStudent(Student student) {
		try {
			sqlMapClient.insert("insertStudent", student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addStudentBySequence(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentById(int id) {
		try {
			sqlMapClient.delete("deleteStudent", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(Student student) {
		try {
			sqlMapClient.update("updateStudent",student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Student> queryAllStudent() {
		List<Student> listStudent = null;
		try {
			listStudent = sqlMapClient.queryForList("queryAllStudent");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listStudent;
	}

	@Override
	public List<Student> queryStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student queryStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
