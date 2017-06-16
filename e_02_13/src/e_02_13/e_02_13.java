/*演習2-13
 * 実数値の乱数を生成して表示する。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */

package e_02_13;
import java.util.Random;

public class e_02_13 {

	public static void main(String[] args) {
		Random rand = new Random();

		//1桁のランダムな実数値を生成。
		double rand1 = rand.nextDouble();

		//1桁のランダムな実数値を生成。
		double rand2 = -rand.nextDouble() * 10;

		//1桁のランダムな実数値を生成。
		double rand3 = -1 + 2 * rand.nextDouble();

		//1桁の乱数を表示。
		System.out.println("生成された1桁の正の乱数は" + rand1 +"です。");

		//1桁の負の乱数を表示。
		System.out.println("生成された1桁の負の乱数は" + rand2 +"です。");

		//2桁の正の乱数を表示。
		System.out.println("生成された1桁の正の乱数は" + rand3 +"です。");
	}

}
