package com.jettjia.dao;

/**
 *  ����������ݿ�Ľӿ�
 */
public interface ArticleDao {
	
	/**
	 * ��ѯ��������
	 */
	void findAll();
	
	/**
	 * �޸����±���
	 * @param id
	 * @param title
	 */
	void updateTitle(int id, String title);
}
