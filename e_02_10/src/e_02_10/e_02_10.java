/*演習2-10
 * 球の表面積と体積を求める。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_10;
import java.util.Scanner;

public class e_02_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//半径の入力を促す。
		System.out.println("球の表面積と体積を求めます。");

		System.out.print("半径を入力してください。");
		double r = stdIn.nextDouble();	//実数値を読み込む。

		//球の表面積を求めて表示する。
		System.out.println("半径が" + r + "の球の表面積は" + (4 * 3.14 * r * r) + "です。");

		//球の体積を求めて表示する。
		System.out.println("半径が" + r + "の球の体積は" + (4 / 3 * 3.14 * r * r * r) + "です。");

	}

}
