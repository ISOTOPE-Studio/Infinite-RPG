
package operation;
import character.*;
import java.util.*;
/**
 * 属性点
 */
/**
 * @author hua
 *
 */
public class statusPoint {
	
	final int startStatusPoint = 500;

	public static Player startStatus(){
		int h, at,  au, r, ab, money;
	String name;
		Scanner type=new Scanner (System.in);
		System.out.println("请输入游戏名字：");
		name=type.next();
		System.out.println("你好，"+name);
		System.out.println("你现在需要设定角色的初始数值，总值500，请认真选择");
		System.out.println("");
		for(int i=1;i<99999;i++){
			for (int j=1;j<99999;i++){
		System.out.println("现在请输入你的生命值：");
		h=type.nextInt();
		if (h<0){
			break;
		}System.out.println("你现在剩下"+(500-h)+"能力值");
		System.out.println("顺便一提，如果想重新输入，则输入负值");
		System.out.println("");
		System.out.println("现在请输入你的攻击值：");
		at=type.nextInt();
		if (at<0){
			break;
		}
		System.out.println("你现在剩下"+(500-h-at)+"能力值");
		System.out.println("");
		System.out.println("现在请输入你的护甲值：");
		au=type.nextInt();
		if (au<0){
			break;
		}
		System.out.println("你现在剩下"+(500-h-at-au)+"能力值");
		System.out.println("");
		System.out.println("现在请输入你的魔抗值：");
		r=type.nextInt();
		if (r<0){
			break;
		}
		System.out.println("你现在剩下"+(500-h-at-au-r)+"能力值");
		System.out.println("");
		System.out.println("请输入你的魔法攻击值：");
		System.out.println("（这是最后一个属性，如果有问题，则可以重新来过；）");
		System.out.println("（如果没有问题，则直接输入能力值，剩余的能力值会转变为初始金币）");
		ab=type.nextInt();
		if (ab<0){
			break;}
			money=500-h-at-au-r-ab;
		if (money<0){
			System.out.println("能力值总数请小于500");
		break;}
		System.out.println("你现在的能力值为：");
		System.out.println("生命值为："+h);
		System.out.println("攻击力为："+at);
		System.out.println("护甲值为："+au);
		System.out.println("魔抗值为："+r);
		System.out.println("魔法攻击为："+ab);
		System.out.println("是否确定？（1.确定；2.不确定)");
		int decide=type.nextInt();
		if (decide==2){
			break;
		}
		}
		}
			
		Player newPlayer = new Player(h,at,au,r,ab);
		return newPlayer;
	}
}

