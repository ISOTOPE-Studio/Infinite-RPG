
package character;

import operation.statusPoint;

public class Player extends Character {
	int ability;// fashuqiangdu

	public Player(int h, int at, int au, int r, int ab) {
		lv = 1;
		health = h;
		attack = at;
		aumor = au;
		resistance = r;
		ability = ab;
	}

	public String returnStatus() {
		return "level: " + lv + ", health: " + health + ", attack:" + attack + ", aumor: " + aumor + ", resistance: "
				+ resistance + ", ability: " + ability;
	}

}
