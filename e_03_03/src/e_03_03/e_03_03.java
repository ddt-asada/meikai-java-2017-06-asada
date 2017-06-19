/*演習3-3
 * 二つの正の整数値を読み込んで、約数かどうかを調べるプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_03;
import java.util.Scanner;

public class e_03_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//約数かどうかを判定したい整数値の入力を促す。
		System.out.print("整数値Aを入力してください。");
		int div1 = stdIn.nextInt();		//キーボードから整数値を読み込む。

		//約数かどうかを判定したい整数値の入力を促す。
		System.out.print("整数値Bを入力してください。");
		int div2 = stdIn.nextInt();

		//約数かどうかを判定するための分岐。
		//BがAの約数の時。
		if(div1 % div2 == 0) {
			//約数であると表示。
			System.out.println(div2 + "は" + div1 + "の約数です。");
		} else {
			//約数でないと表示。
			System.out.println(div2 + "は" + div1 + "の約数ではありません。。");
		}
		
		stdIn.close();
	}

}
