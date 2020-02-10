package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.MemberDao;
import com.douzone.bookshop.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
		insertTest("신정은", "010-1234-5678", "abc123@gmail.com", "password1");
		insertTest("이예은", "010-8765-4321", "xyz999@naver.com", "password2");
		//		insertTest("kkk", "010-0000-0000", "aa@naver.com", "pa");

		//		deleteTest(4L);

		selectTest();

	}

	public static void insertTest(String name, String phoneNumber, String email, String password) {
		MemberVo vo = new MemberVo();
		vo.setName(name);
		vo.setPhoneNumber(phoneNumber);
		vo.setEmail(email);
		vo.setPassword(password);

		new MemberDao().insert(vo);
	}

	public static void deleteTest(Long no) {
		new MemberDao().delete(no);
	}

	public static void selectTest() {
		List<MemberVo> list = new MemberDao().findAll();

		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}

}
