/*演習4-3
 * 二つの整数値を読み込んで、小さい方以上大きい方以下の全整数を小さい方から表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_03;
import java.util.Scanner;

public class e_04_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int min;	//整数を並べる際の小さい方の整数値。
		int max;	//整数を並べる際の大きい方の整数値。

		//小さい方の整数値の入力を促す。
		System.out.print("小さい方の整数値を入力してください。");
		min = stdIn.nextInt();	//整数値を読み込む。

		//大きい方の整数値の入力を促す。
		System.out.print("大きい方の整数値を入力してください。");
		max = stdIn.nextInt();	//整数値を読み込む。


		//小さい方以上大きい方以下の整数を並べて表示。
		for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

		stdIn.close();
	}

}
