package VO;

import java.time.LocalDateTime;



import Entity.Book;
import Entity.Member;

public class Loan {
	private String lId;
	private LocalDateTime LoanDate;
	private LocalDateTime dateForReturn;
	private LocalDateTime returnDate;
	private Book book;
	private Member member;
	public boolean hasNotBeenRetruned(){
		return returnDate==null;
	}
	public void MarkedAsReturned(){
		returnDate=LocalDateTime.now();
	}
	public String getlId() {
		return lId;
	}
	public void setlId(String lId) {
		this.lId = lId;
	}
	public LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public LocalDateTime getDateForReturn() {
		return dateForReturn;
	}
	public void setDateForReturn(LocalDateTime dateForReturn) {
		this.dateForReturn = dateForReturn;
	}
	
}
