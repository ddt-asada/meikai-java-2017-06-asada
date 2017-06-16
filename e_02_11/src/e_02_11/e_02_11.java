/*演習2-11
 * 乱数を生成して表示するプログラム。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_11;
import java.util.Random;

public class e_02_11 {

	public static void main(String[] args) {
		Random rand = new Random();

		//1桁のランダムな整数値を生成。
		int rand1 = rand.nextInt(9);

		//1桁のランダムな負の整数値を生成。
		int rand2 = -rand.nextInt(9);

		//2桁の正の整数値を生成。
		int rand3 = rand.nextInt(99);

		//1桁の乱数を表示。
		System.out.println("生成された1桁の正の乱数は" + rand1 +"です。");

		//1桁の負の乱数を表示。
		System.out.println("生成された1桁の負の乱数は" + rand2 +"です。");

		//2桁の正の乱数を表示。
		System.out.println("生成された1桁の正の乱数は" + rand3 +"です。");

	}

}
