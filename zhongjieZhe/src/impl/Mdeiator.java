package impl;

import abst.AbstractColleague;
import abst.AbstractMediator;

public class Mdeiator extends AbstractMediator{

	public Mdeiator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AaffectB() {
		// TODO Auto-generated method stub
		int number = A.getNumber();
		B.setNumber(number*100);
	}

	@Override
	public void BaffectA() {
		int number  = B.getNumber();
		A.setNumber(number/100);
		
	}
	
}
