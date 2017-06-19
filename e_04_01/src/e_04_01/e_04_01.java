/*演習4-1
 * 読み込んだ整数値の符号を判定して表示するプログラムを好きなだけ何度でも繰り返せるように変更。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_01;
import java.util.Scanner;

public class e_04_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int retry;		//繰り返しの判定に使う変数。

		//好きなだけ何度でも繰り返せす。
		do {
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
			//もう一度繰り返すかを選択する。
			System.out.print("もう一度？はい…1/いいえ…0");
			retry = stdIn.nextInt();

		} while (retry == 1);

		stdIn.close();
	}
}
