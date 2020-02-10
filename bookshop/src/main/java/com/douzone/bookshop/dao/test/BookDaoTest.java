package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.BookDao;
import com.douzone.bookshop.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		insertTest("데미안", 9000L, 1L);
//		insertTest("배움의 발견", 18000L, 2L);
//		insertTest("이것이 자바다", 30000L, 3L);
		
		selectTest();

	}
	
	public static void insertTest(String title, Long price, Long categoryNo) {
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setPrice(price);
		vo.setCategoryNo(categoryNo);
		
		new BookDao().insert(vo);
	}
	
	public static void deleteTest(Long no) {
		new BookDao().delete(no);
	}
	
	public static void selectTest() {
		List<BookVo> list = new BookDao().findAll();
		
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
	

}
