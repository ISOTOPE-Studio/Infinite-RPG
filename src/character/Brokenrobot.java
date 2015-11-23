/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

/**
 *
 * @author hua
 */
public class Brokenrobot extends Monster {

	public Brokenrobot(int a) {
		lv = a;
		health = 1000 + a * 150;
		attack = 20 + a * 8;
		aumor = 100 + a * 150;
		resistance = 75 + a * 30;
	}
}
