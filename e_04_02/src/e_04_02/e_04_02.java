/*演習4-2
 * 3桁の正の整数値を読み込むプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_02;

import java.util.Scanner;

public class e_04_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num = 0;	//読み込む値。

		//3桁の正の整数値が入力されるまで繰り返す。
		for( ; num < 100 || num > 999; ) {
			//3桁の正の整数値の入力を促す。
			System.out.print("3桁の正の整数値を入力してください。");
			num = stdIn.nextInt();
		}

		//読み込んだ値を表示。
		System.out.println("読み込んだ値は" + num + "です。");

		stdIn.close();
	}

}
