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
public class Slime extends Monster {

	public Slime(int a) {
		lv = a;
		health = 1000 + a * 300;
		attack = 30 + a * 10;
		aumor = 150 + a * 100;
		resistance = 50 + a * 20;
	}
}
