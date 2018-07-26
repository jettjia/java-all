package com.jettjia.jdbc.util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

public class JDBCUtil {
	static String driverClass = null;
	static String url = null;
	static String user = null;
	static String password = null;
	
	// �����ʱ��ֱ�ӵ��ã�����jdbc.properties�У�MySQL������Ϣ
	static {
		try {
			Properties properties = new Properties();
			// ʹ�����������ȥ��ȡsrc���µ���Դ�ļ��� ������servlet
			InputStream inStream = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			properties.load(inStream);
			
			// ��ȡ����
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ���Ӷ���
	 * @return
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			// 1 ��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2 ������ݿ�����
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ͷ���Դ
	 * @param rs
	 * @param st
	 * @param conn
	 */
	public static void release(ResultSet rs, Statement st, Connection conn) {
		closeResultSet(rs);
		closeStatement(st);
		closeConnection(conn);
	}
	
	/**
	 * �ر� ResultSet
	 * @param rs
	 */
	private static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			rs = null;
		}
	}
	
	/**
	 * �ر� Statement
	 * @param st
	 */
	private static void closeStatement(Statement st) {
		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			st = null;
		}
	}
	
	/**
	 * �ر� Connection
	 * @param st
	 */
	private static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn = null;
		}
	}
}
