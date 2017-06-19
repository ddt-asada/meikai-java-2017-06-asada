/*演習3-6
 * 正の整数値を読み込んで10の倍数かどうかを判定するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_06;
import java.util.Scanner;

public class e_03_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//10の倍数かどうかを判定したい整数値の入力を促す。
		System.out.print("10の倍数かどうかを判定したい正の整数を入力したください。");
		int num = stdIn.nextInt();	//整数値を読み込む。

		//判定することを表示。
		System.out.println("10の倍数かどうかを判定します。");

		//10の倍数かどうかを判定するための分岐。
		if(num < 0) {
			System.out.println("正でない値が入力されました。");

		} else if (num % 10 == 0) {
			System.out.println("その値は10の倍数です。");

		} else if (num % 10 != 0) {
			System.out.println("その値は10の倍数ではありません。");
		}

		stdIn.close();
	}

}
