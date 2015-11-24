
package character;

import operation.statusPoint;

public class Player extends Character {
	public String name;
	public int ability;// fashuqiangdu
	public int money;

	public Player(String n, int h, int at, int au, int r, int ab, int m) {
		name = n;
		lv = 1;
		health = h;
		attack = at;
		aumor = au;
		resistance = r;
		ability = ab;
		money = m;
	}

	public String toString() {
		return "name: " + name + ", level: " + lv + ", health: " + health + ", attack:" + attack + ", aumor: " + aumor
				+ ", resistance: " + resistance + ", ability: " + ability + "money: " + money;
	}

}
