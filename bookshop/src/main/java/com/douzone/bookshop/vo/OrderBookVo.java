package com.douzone.bookshop.vo;

public class OrderBookVo {
	private String orderNo;
	private Long bookNo;
	private Long amount;
	
	private String bookTitle;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getBookNo() {
		return bookNo;
	}

	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "주문 도서 [도서번호=" + bookNo + ", 도서제목=" + bookTitle + ", 수량=" + amount + "]";
	}

}
