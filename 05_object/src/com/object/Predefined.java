package com.object;

import java.time.LocalDate;

/**
 * Ԥ������
 */
public class Predefined {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); // ��ǰʱ��
		int year = date.getYear(); // ��ǰ��
		int month = date.getMonthValue(); //��ǰ��
		int day = date.getDayOfMonth(); // ��ǰ��
		System.out.println(date);
	}

}
