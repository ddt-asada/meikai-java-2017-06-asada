/*演習2-6
 * キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力する。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_06;
import java.util.Scanner;

public class e_02_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;	//整数値を読み込むための型。

		//整数値の入力を促す。
		System.out.print("整数値を入力してください。");

		x = stdIn.nextInt();	//整数値を読み込む。

		//入力された整数値に10を加えた値を表示。
		System.out.println(x + "に10を加えた値は" + (x + 10) + "です。");

		//入力された整数値から10を減じた値を表示。
		System.out.println(x + "から10を減じた値は" + (x - 10) + "です。");


	}

}
