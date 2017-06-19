/*演習3-17
 * じゃんけんプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_17;
import java.util.Random;

public class e_03_17 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int hand = rand.nextInt(3);		//乱数の範囲を1～2に設定。
		
		//どの手を出すかの分岐。
		switch(hand) {
		case 0:	System.out.println("グー");		break;
		case 1:	System.out.println("チョキ");	break;
		case 2:	System.out.println("パー");		break;
		}
	}
}
