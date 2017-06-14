package Specification;

import Entity.Book;
import Entity.Member;
import VO.Loan;

public class LoanOnlyOneSpecification implements ISpecification<Member>{
	private Book wantBook;
	
	public LoanOnlyOneSpecification(Book book) {
		wantBook=book;
	}
	@Override
	public boolean isSatisfiedBy(Member member) {		
		for(Loan loan:member.getLoans()){
			if(loan.getBook().getiSBN().equals(wantBook.getiSBN())){
				System.out.println("不能同一本");
				return false;
			}
		}
		return true;
	}
	
}
