/*演習2-5
 * キーボードから整数値を読み込んでそのまま表示するプログラム。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_05;

import java.util.Scanner;

public class e_02_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x; //キーボードから読み込んだ整数値を格納する型。

		//整数値の入力を促す。
		System.out.print("整数値を入力してください：");

		x = stdIn.nextInt();	//変数を読み込む。

		//読み込んだ整数値を表示する。
		System.out.println("入力した整数値は" + x);


	}

}
