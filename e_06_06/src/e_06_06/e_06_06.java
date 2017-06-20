/*演習6-6
 * テストの点数の合計点・平均点・最高点・最低点を求めて表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_06;
import java.util.Scanner;

public class e_06_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;				//配列の要素数。
		int sum = 0;			//求めた合計を代入する整数。
		int min;			//求めた最低点を代入する整数。

		//人数の入力を促す。
		System.out.print("人数は：");
		n = stdIn.nextInt();

		//人数に対応した配列を生成する。
		int[] a = new int[n];

		//配列の各要素に値を入れていく。
		for(int i = 0; i < a.length; i++) {
			//点数の入力を促す。
			System.out.print(i + "人目の点数：");
			a[i] = stdIn.nextInt();
		}

		//仮の最小点・最高点として適当な要素を代入。
		max = a[0];
		min = a[0];

		//合計点・平均点・最低点・最高点を求める。
		for(int i = 0; i < a.length; i++) {
			//合計を求める。
			sum += a[i];

			//最低点を求める。
			if(a[i] <min) {
				min = a[i];
			}

			//最高点を求める。
			if(a[i] > max) {
				max = a[i];
			}
		}

		//求めたものを表示する。
		System.out.println("合計点は" + sum + "です。");
		System.out.println("平均点は" + (sum / n) + "です。");
		System.out.println("最低点は" + min + "です。");
		System.out.println("最高点は" + max + "です。");

		stdIn.close();

	}

}
