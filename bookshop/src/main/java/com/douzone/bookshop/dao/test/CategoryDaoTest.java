package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.CategoryDao;
import com.douzone.bookshop.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
//				insertTest("소설");
//				insertTest("수필");
//				insertTest("IT");
				
		//		insertTest("예술");

		//		deleteTest(4L);

		selectTest();

	}

	public static void insertTest(String name) {
		CategoryVo vo = new CategoryVo();
		vo.setName(name);

		new CategoryDao().insert(vo);
	}
	
	public static void deleteTest(Long no) {
		new CategoryDao().delete(no);
	}


	public static void selectTest() {
		List<CategoryVo> list = new CategoryDao().findAll();

		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
	} 

}
