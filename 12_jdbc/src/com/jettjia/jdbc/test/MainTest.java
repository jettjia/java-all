package com.jettjia.jdbc.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jettjia.jdbc.util.JDBCUtil;

public class MainTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 1 ��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			// 2 �������Ӷ��󣬵õ�statement
			st = conn.createStatement();
			// 3 ִ��sql��䣬����ResultSet
			rs = st.executeQuery("select id, name from j_cate");
			// 4 �����ؽ����
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id + " " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ��������ζ���ִ�����´���
			JDBCUtil.release(rs, st, conn);
		}
	}
}
