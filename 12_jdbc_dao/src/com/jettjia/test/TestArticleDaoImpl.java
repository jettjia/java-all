package com.jettjia.test;

import org.junit.Test;

import com.jettjia.dao.ArticleDao;
import com.jettjia.dao.impl.ArticleDaoImpl;

public class TestArticleDaoImpl {

	@Test
	public void testFindAll() {
		// �������� �ӿڱ��
		ArticleDao dao = new ArticleDaoImpl(); // ���ֶ�̬������
		dao.findAll();
	}
	
	@Test
	public void testUpdateTitle() {
		ArticleDao dao = new ArticleDaoImpl();
		dao.updateTitle(1, "1111");
	}

}
