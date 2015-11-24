
package operation;

import character.*;
import java.util.*;
import control.ExceptionList;

/**
 * 属性点
 */
/**
 * @author hua
 *
 */
public class statusPoint {

	public final static int startStatusPoint = 500;

	public static Player startStatus() {
		int h = -1, at = -1, au = -1, r = -1, ab = -1, money = -1;
		boolean status = false;
		String name; // 玩家姓名
		String restart = "如果想重新输入，则输入负值";
		String error = "输入错误，请重新输入";

		System.out.println("请输入游戏名字：");
		name = ExceptionList.scannerString(10);
		System.out.println("你好，" + name);
		System.out.println("你现在需要设定角色的初始数值，总值" + startStatusPoint + "，请认真选择");
		System.out.println("");
		while (!status) {
			loop: {
				System.out.println("现在请输入你的生命值：");
				h = ExceptionList.scannerInt();
				if (h < 0 || h > startStatusPoint) {
					break loop;
				}
				while (at < 0 || at > startStatusPoint - h) {
					System.out.println("你现在剩下" + (startStatusPoint - h) + "能力值");
					System.out.println(restart);
					System.out.println("");
					System.out.println("现在请输入你的攻击值：");
					at = ExceptionList.scannerInt();
					if (at < 0) {
						break loop;
					}
				}
				while (au < 0 || au > startStatusPoint - h - at) {
					System.out.println("你现在剩下" + (startStatusPoint - h - at) + "能力值");
					System.out.println(restart);
					System.out.println("");
					System.out.println("现在请输入你的护甲值：");
					au = ExceptionList.scannerInt();
					if (au < 0) {
						break loop;
					}
				}
				while (r < 0 || r > startStatusPoint - h - at - au - r) {
					System.out.println("你现在剩下" + (startStatusPoint - h - at - au) + "能力值");
					System.out.println(restart);
					System.out.println("");
					System.out.println("现在请输入你的魔抗值：");
					r = ExceptionList.scannerInt();
					if (r < 0) {
						break loop;
					}
				}
				while (ab < 0 || ab > startStatusPoint - h - at - au - r) {
					System.out.println("你现在剩下" + (startStatusPoint - h - at - au - r) + "能力值");
					System.out.println(restart);
					System.out.println("");
					System.out.println("请输入你的魔法攻击值：");
					System.out.println("（这是最后一个属性，如果有问题，则可以重新来过；）");
					System.out.println("（如果没有问题，则直接输入能力值，剩余的能力值会转变为初始金币）");
					ab = ExceptionList.scannerInt();
					if (ab < 0) {
						break loop;
					}
				}
				/*
				 * money = startStatusPoint - h - at - au - r - ab; if (money <
				 * 0) { System.out.println("能力值总数请小于" + startStatusPoint); break
				 * loop; }
				 */
				System.out.println("你现在的能力值为：");
				System.out.println("生命值为：" + h);
				System.out.println("攻击力为：" + at);
				System.out.println("护甲值为：" + au);
				System.out.println("魔抗值为：" + r);
				System.out.println("魔法攻击为：" + ab);
				System.out.println("是否确定？（1.是；2.否)");
				int decide = ExceptionList.scannerInt();
				if (decide == 2) {
					break loop;
				}
				status = true;

				System.out.println("完成！");
			}
		}	

		Player newPlayer = new Player(name, h, at, au, r, ab, money);
		return newPlayer;
	}
}
