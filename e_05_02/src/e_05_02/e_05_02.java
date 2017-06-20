/*演習5-2
 * float型の変数とdouble型の変数に値を読み込んで表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_05_02;
import java.util.Scanner;

public class e_05_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		double dtest;		//キーボードから入力された値を格納する実数値。
		float ftest;		//キーボードから入力された値を格納する実数値。

		//実数値の入力を促す。
		System.out.print("double型の実数値を入力してください");
		dtest = stdIn.nextDouble();//キーボードから値を読み込む。

		System.out.print("float型の実数値を入力してください");
		ftest = stdIn.nextFloat();

		//読み込んだdouble型の実数値を表示。
		System.out.println("入力したdouble型の実数値は" + dtest + "です。");

		//読み込んだfloat型の実数値を表示。
		System.out.println("入力したfloat型の実数値は" + ftest + "です。");

		stdIn.close();
	}

}
