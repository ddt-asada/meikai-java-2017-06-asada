/*演習5－1
 * 10進数を読み込んで、その値を8進数と16進数で表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */

package e_05_01;
import java.util.Scanner;

public class e_05_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int digits;		//変換したい10進数を代入するための整数。

		//16進数及び8進数に変換したい10進数の整数値の入力を促す。
		System.out.print("変換したい整数値を入力してください。");
		digits = stdIn.nextInt();//整数値を読み込む。

		//入力された10進数を8進数に変換して表示。
		System.out.printf("8進数に変換した値は%oです。\n", digits);

		//入力された10進数を16進数に変換して表示。
		System.out.printf("16進数に変換した値は%xです。\n", digits);

		stdIn.close();
	}

}
