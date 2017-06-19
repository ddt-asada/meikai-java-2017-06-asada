/*演習4-18
 * 1からnまでの整数値の2乗値を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_18;
import java.util.Scanner;

public class e_04_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num = 0;	//どこまでの2乗値を求めるか。

		//どこまでの2乗値を求めるかの入力を促す。
		System.out.print("1からどこまでの2乗値をもとめますか。");
		num = stdIn.nextInt();

		//2乗値を求める繰り返し。
		for(int i = 1; i <= num; i++) {
			//2乗値を求めて表示。
			System.out.println(i + "の2乗は" + (i * i));
		}

		stdIn.close();
	}

}
