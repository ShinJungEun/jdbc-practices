package com.douzone.bookshop.main;

import com.douzone.bookshop.dao.test.BookDaoTest;
import com.douzone.bookshop.dao.test.CartDaoTest;
import com.douzone.bookshop.dao.test.CategoryDaoTest;
import com.douzone.bookshop.dao.test.MemberDaoTest;
import com.douzone.bookshop.dao.test.OrderDaoTest;

public class BookShop {

	public static void main(String[] args) {
		
		// 카테고리 삽입
		CategoryDaoTest.insertTest("소설");
		CategoryDaoTest.insertTest("수필");
		CategoryDaoTest.insertTest("IT");

		// 서적 삽입
		BookDaoTest.insertTest("데미안", 9000L, 1L);
		BookDaoTest.insertTest("배움의 발견", 18000L, 2L);
		BookDaoTest.insertTest("이것이 자바다", 30000L, 3L);
		
		// 고객 삽입
		MemberDaoTest.insertTest("신정은", "010-1234-5678", "abc123@gmail.com", "password1");
		MemberDaoTest.insertTest("이예은", "010-8765-4321", "xyz999@naver.com", "password2");

		// 카트 삽입
		CartDaoTest.insertTest(1L, 1L, 3L);
		CartDaoTest.insertTest(2L, 3L, 1L);

		// 주문 삽입
		OrderDaoTest.insertOrderTest("20200129-00001", "경기도 남양주시 별내동", 1L, 50000L);

		// 주문도서 삽입
		OrderDaoTest.insertOrderBookTest("20200129-00001", 1L, 3L);
		OrderDaoTest.insertOrderBookTest("20200129-00001", 2L, 2L);

		MemberDaoTest.selectTest();
		CategoryDaoTest.selectTest();
		BookDaoTest.selectTest();
		CartDaoTest.selectTest();
		OrderDaoTest.selectOrderTest();
		OrderDaoTest.selectOrderBookTest();

	}
}
