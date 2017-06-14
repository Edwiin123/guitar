package Factory;

import java.time.LocalDateTime;

import Entity.Book;
import Entity.Member;
import VO.Loan;

public class LoanFactory {
	public static Loan createLoan(Book book,Member member){
		Loan loan=new Loan();
		loan.setBook(book);
		loan.setMember(member);
		loan.setDateForReturn(LocalDateTime.now().plusDays(10));
		return loan;
	} 
}
