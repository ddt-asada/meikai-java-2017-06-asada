/*演習4-9
 * 整数値を読み込み、1～nまでの積を求めるプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_09;
import java.util.Scanner;

public class e_04_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;			//どこまでの階乗を求めるかの整数値。
		int factorial = 1;	//求めた階乗を格納する値。

		//1～どこまでの積を求めるかの入力を促す。
		System.out.print("1～どこまでの積をもとめますか。");
		num = stdIn.nextInt();

		//1～nまでの積を求める繰り返し。
		for(int i = 1; i <= num; i++) {
			factorial *= i;
		}

		//求めた階乗を表示する。
		System.out.println("1～" + num + "までの階乗は" + factorial + "です。");

		stdIn.close();
	}

}
