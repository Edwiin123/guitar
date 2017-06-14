package Entity;

import java.util.LinkedList;
import java.util.List;

import Factory.LoanFactory;
import Specification.HasReachMaxSpecification;
import Specification.ISpecification;
import Specification.LoanOnlyOneSpecification;
import VO.Loan;

public class Member {
	private String id;
	private String name;
	private List<Loan> loans;
	public boolean canLoan(Book book){		
		return (book.getLoanTo()==null)&&validate(this,book);		
	}
	public Loan loan(Book book){
		Loan loan=null;
		if(canLoan(book)){			
			loan=LoanFactory.createLoan(book, this);
			loans.add(loan);
			book.setLoanTo(this);
			System.out.println("借书成功");
		}
		return loan;	
	}
	public void returnBook(Book book){
		Loan loan=findCurrentLoanFor(book);
		if(loan!=null){
			loan.MarkedAsReturned();
			book.setLoanTo(null);
			System.out.println("还书成功");
		}
	}
	public Loan findCurrentLoanFor(Book book){
		for (Loan loan : book.getLoanTo().getLoans()) {
			if(loan.getBook().equals(book)){
				return loan;
			}			
		}
		return null;
	}
	public boolean validate(Member member,Book book){
		ISpecification<Member> hRM=new HasReachMaxSpecification();
		ISpecification<Member> lOO=new LoanOnlyOneSpecification(book);
		return hRM.isSatisfiedBy(member)&&lOO.isSatisfiedBy(member);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	
}
