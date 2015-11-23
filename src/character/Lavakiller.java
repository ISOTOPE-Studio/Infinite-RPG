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
public class Lavakiller extends Monster {
	public Lavakiller(int a) {
		lv = a;
		health = 500 + a * 75;
		attack = 75 + a * 15;
		aumor = 50 + a * 50;
		resistance = 50 + a * 20;

	}
}
