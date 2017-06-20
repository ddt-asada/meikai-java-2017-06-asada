/*演習5-7
 * 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラム。
 * 作成日：2017年6月29日
 * 作成者：浅田　知嗣
 */
package e_05_07;

public class e_05_07 {

	public static void main(String[] args) {
		float x = 0.0F;	//0.0から1.0まで0.001ずつ増やしていくときの変化を見るための実数値。

		//表のように見せるために間隔を調整する。
		System.out.println(" float        2乗値");
		System.out.println("---------------------");

		//0.0から1.0まで増やしていき、2乗値を横に並べて表示する。
		for( ; x <= 1.0F; x += 0.001F) {
			System.out.printf("%5.3f %10.7f\n", x, (x * x));
		}
	}
}
