package code11_16;

import code11_11.Creature;

public interface Human extends Creature {

	void talk();
	void watch();
	void hear();
	//さらに、親インターフェースからrun()を継承する

}
