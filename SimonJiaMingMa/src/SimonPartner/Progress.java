package SimonPartner;

import SimonJiaMing.ProgressInterfaceJiaMing;

public class Progress implements ProgressInterfaceJiaMing {

	private int round;
	private int seq;
	
	public Progress() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseRoundNum(int i) {
		round += i;
	}

	@Override
	public int getRoundNum() {
		return round;
	}

	@Override
	public void setRoundNum(int i) {
		round = i;
	}

	@Override
	public int getSequenceLength() {
		return seq;
	}

	@Override
	public void setSequenceLength(int size) {
		seq = size;
	}

}
