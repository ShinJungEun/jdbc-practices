package com.douzone.bookshop.vo;

public class OrderVo {
	private String orderNo;
	private String address;
	private Long memberNo;
	private Long payment;

	private String memberName;
	private String memberEmail;

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	public Long getPayment() {
		return payment;
	}
	public void setPayment(Long payment) {
		this.payment = payment;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	@Override
	public String toString() {
		return "주문 [주문번호=" + orderNo + ", 주문자 이름=" + memberName + 
				", 주문자 이메일=" + memberEmail + ", 결제금액=" + payment + ", 배송지=" + address + "]";
	}

}
