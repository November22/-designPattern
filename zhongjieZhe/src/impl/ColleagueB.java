package impl;

import abst.AbstractColleague;
import abst.AbstractMediator;

public class ColleagueB extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}
