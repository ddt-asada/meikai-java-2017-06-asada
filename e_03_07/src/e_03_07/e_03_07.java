/*演習3-7
 * 読み込んだ正の整数値が3で割り切れるかどうかを判定するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_07;
import java.util.Scanner;

public class e_03_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//3で割り切れるかどうかを判定したい整数値の入力を促す。
		System.out.print("3で割り切れるかどうかを判定したい正の整数を入力したください。");
		int num = stdIn.nextInt();	//整数値を読み込む。

		//判定することを表示。
		System.out.println("3で割り切れるかどうかを判定します。");

		//3で割り切れるどうかを判定するための分岐。
		if(num < 0) {
			System.out.println("正でない値が入力されました。");

		} else if (num % 3 == 0) {
			System.out.println("その値は3で割り切れます。");

		} else if (num % 3 != 0) {
			System.out.println("その値を3で割った余りは" + (num % 3) + "です。");
		}

		stdIn.close();
	}

}
