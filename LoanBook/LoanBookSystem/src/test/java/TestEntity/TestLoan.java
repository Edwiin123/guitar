package TestEntity;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Entity.Book;
import Entity.Member;
import VO.Loan;

public class TestLoan {
	private Member memberA;
	private Book book1;
	private Book book2;
	private Book book3;
	private Book book4;
	private Book book5;
	@Before
	public void init(){
		memberA =new Member();
		memberA.setId("1");
		memberA.setName("张三");
		memberA.setLoans(new ArrayList<Loan>());
		book1=new Book();
		book1.setbId("1");
		book1.setiSBN("ISBN-001");
		book1.setTitle("系统分析");
		book2=new Book();
		book2.setbId("2");
		book2.setiSBN("ISBN-002");
		book2.setTitle("数学");
		book3=new Book();
		book3.setbId("3");
		book3.setiSBN("ISBN-003");
		book3.setTitle("英语");
		book4=new Book();
		book4.setbId("4");
		book4.setiSBN("ISBN-004");
		book4.setTitle("网络营销");
		book5=new Book();
		book5.setbId("5");
		book5.setiSBN("ISBN-001");
		book5.setTitle("系统分析");
	}
	@Test
	public void testLoadReturn(){		
		memberA.loan(book1);
		memberA.returnBook(book1);
	}
	@Test
	public void testLoanHasReachMax(){				
		memberA.loan(book1);
		memberA.loan(book2);
		memberA.loan(book3);
		memberA.loan(book4);
	}
	@Test
	public void testLoanOnlyOne(){		
		memberA.loan(book1);
		memberA.loan(book5);
	}
}
