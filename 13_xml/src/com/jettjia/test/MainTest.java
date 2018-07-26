package com.jettjia.test;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainTest {

	public static void main(String[] args) {
		try {
			// 1.����SaxReader����
			SAXReader saxReader = new SAXReader();
			// 2.ָ��������xml
			Document read = saxReader.read(new File("src/xml/stus.xml"));
			// 3. ��ȡ��Ԫ��
			Element rootElement = read.getRootElement();
			// 4.��ȡ��Ԫ�������е���Ԫ��
			List<Element> elements = rootElement.elements();
			for (Element element : elements) {
				String name = element.element("name").getText();
				String age = element.element("age").getText();
				String address = element.element("address").getText();
				System.out.println(name + " " + age + " " + address);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
