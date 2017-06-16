/*演習2-7
 * キーボードから読み込んだ整数値の最下位桁を除いた値と最下位桁を表示するプログラム。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_07;

import java.util.Scanner;

public class e_02_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数値の入力を促す。
		System.out.print("整数値を入力してください");

		int x = stdIn.nextInt();	//整数値を読み込む。

		//入力された整数値の最上位桁を除いた値を表示。
		System.out.println(x + "の最下位桁を除いた値は" + (x / 10) + "です。");

		//入力された整数値の最下位桁を表示。
		System.out.println(x + "の最下位桁は" + (x % 10) + "です。");

	}

}
