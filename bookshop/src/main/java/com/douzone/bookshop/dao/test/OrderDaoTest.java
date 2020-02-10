package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.OrderDao;
import com.douzone.bookshop.vo.OrderBookVo;
import com.douzone.bookshop.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
//		insertOrderTest("20200129-00001", "경기도 남양주시 별내동", 1L, 50000L);
		
		selectOrderTest();
		
		insertOrderBookTest("20200129-00002", 4L, 3L);
		
//		insertOrderBookTest(4L, 3L);
		
		selectOrderBookTest();
	}
	
	public static void insertOrderTest(String orderNo, String address, Long memberNo, Long payment) {
		OrderVo vo = new OrderVo();
		
		vo.setOrderNo(orderNo);
		vo.setAddress(address);
		vo.setMemberNo(memberNo);
		vo.setPayment(payment);
		
		new OrderDao().insertOrder(vo);
	}
	
	public static void insertOrderBookTest(String orderNo, Long bookNo, Long amount) {
		OrderBookVo vo = new OrderBookVo();
		
		vo.setOrderNo(orderNo);
		vo.setBookNo(bookNo);
		vo.setAmount(amount);
		
		new OrderDao().insertOrderBook(vo);
	}
	
	public static void insertOrderBookTest(Long bookNo, Long amount) {
		OrderBookVo vo = new OrderBookVo();
		
		vo.setBookNo(bookNo);
		vo.setAmount(amount);
		
		new OrderDao().insertOrderBook(vo);
	}
	
	public static void selectOrderTest() {
		List<OrderVo> list = new OrderDao().findOrder();
		
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void selectOrderBookTest() {
		List<OrderBookVo> list = new OrderDao().findOrderBook();
		
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}

}
