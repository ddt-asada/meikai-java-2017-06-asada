/*演習3-5
 * キーボードから読み込んだ整数値の符号を判定して表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_05;
import java.util.Scanner;

public class e_03_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//符号を判定したい変数の入力を促す。
		System.out.print("符号をを判定したい整数値を入力してください");
		int sign = stdIn.nextInt();	//キーボードから読み込む。

		//入力された変数の符号を判定することを表示。
		System.out.println(sign + "の符号を判定します。");

		//符号を判定するための分岐。
		if(sign > 0) {
			System.out.println(sign + "は正です。");

		} else if (sign < 0) {
			System.out.println(sign + "は負です。");

		} else if (sign == 0) {
			System.out.println("は0です。");

		}

		stdIn.close();	}

}
