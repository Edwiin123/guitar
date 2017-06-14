package Specification;

import Entity.Member;
import VO.Loan;

public class HasReachMaxSpecification implements ISpecification<Member>{

	@Override
	public boolean isSatisfiedBy(Member member) {
		int count=0;
		for(Loan loan:member.getLoans()){
			++count;
		}
		if(!(count<3))
			System.out.println("最多三本");
		return count<3;
	}
	
}
