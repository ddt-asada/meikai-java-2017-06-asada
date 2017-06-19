/*演習4-8
 * 正の整数値を読み込んでその桁数を出力するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_08;
import java.util.Scanner;

public class e_04_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int digits = 0;	//桁数をカウントした値を格納する整数値。
		int num;		//桁数を調べたい整数値。

		//桁数を調べたい整数値の入力を促す。
		System.out.print("桁数を調べたい整数値を入力してください。");
		num = stdIn.nextInt();

		//桁数を調べるための繰り返し。
		for( ; num > 0; num /= 10) {
			digits++;
		}

		//数えた桁数を表示する。
		System.out.println("その整数値の桁数は" + digits + "です。");

		stdIn.close();
	}

}
