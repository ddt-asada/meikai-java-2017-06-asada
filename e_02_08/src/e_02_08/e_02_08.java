/*演習2-8
 * 二つの実数値を読み込み、その和と平均を求めて表示する。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_08;

import java.util.Scanner;
public class e_02_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//和と平均をもとめたい一つ目実数値の入力を促す。
		System.out.print("一つ目の実数値を入力してください。");
		double x = stdIn.nextDouble();	//実数値を読み込む。

		//二つ目の実数値の入力を促す。
		System.out.print("二つ目の実数値を入力してください。");
		double y = stdIn.nextDouble();	//実数値を読み込む。

		//読み込んだ実数値の和を求めて表示する。
		System.out.println(x + "と" + y + "の合計は" + (x + y) + "です。");

		//読み込んだ実数値の平均を求めて表示する。
		System.out.println(x + "と" + y + "の平均は" + ((x + y) / 2) + "です。");
	}

}
