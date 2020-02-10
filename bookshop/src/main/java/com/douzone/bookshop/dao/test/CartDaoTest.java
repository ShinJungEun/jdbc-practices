package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.CartDao;
import com.douzone.bookshop.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
//		insertTest(1L, 4L, 3L);
//		insertTest(2L, 6L, 1L);

		selectTest();

	}

	public static void insertTest(Long memberNo, Long bookNo, Long amount) {
		CartVo vo = new CartVo();

		vo.setMemberNo(memberNo);
		vo.setBookNo(bookNo);
		vo.setAmount(amount);

		new CartDao().insert(vo);
	}

	public static void deleteTest(Long no) {
		// no : member_no
		new CartDao().delete(no);
	}

	public static void selectTest() {
		List<CartVo> list = new CartDao().findAll();

		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}

}
