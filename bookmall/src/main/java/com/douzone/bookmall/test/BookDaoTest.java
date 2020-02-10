package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		insertTest("트와일라잇", "대여가능", 1L);
//		insertTest("뉴문", "대여가능", 1L);
//		insertTest("이클립스", "대여가능", 1L);
//		insertTest("브레이킹던", "대여가능", 1L);
//		insertTest("아리랑", "대여가능", 4L);
//		insertTest("젊은그들", "대여중", 6L);
//		insertTest("아프니까 청춘이다", "대여가능", 2L);
//		insertTest("귀천", "대여가능", 3L);
//		insertTest("태백산맥", "대여가능", 4L);
//		insertTest("풀하우스", "대여가능", 5L);
	
		selectTest();
	}
	
	public static void insertTest(String title, String state, Long authorNo) {
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setState(state);
		vo.setAuthorNo(authorNo);
		
		new BookDao().insert(vo);
	}
	
	public static void selectTest() {
		List<BookVo> list = new BookDao().findAll();

		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}

}
