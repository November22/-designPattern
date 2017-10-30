package impl;

import abst.AbstractColleague;
import abst.AbstractMediator;

public class ColleagueA extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMediator am) {
		// TODO Auto-generated method stub
		this.number = number;
		am.AaffectB();
	}

}
