/*演習7-2
 * 三つの整数値の最小値を求めるメソッドを作成する。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_07_02;
import java.util.Scanner;

public class e_07_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int min1;		//最小値の比較をしたい整数。
		int min2;		//最小値の比較をしたい整数。
		int min3;		//最小値の比較をしたい整数。

		//最小値を比較したい整数値の入力を促す。
		System.out.print("整数値：");
		min1 = stdIn.nextInt();

		//最小値を比較したい整数値の入力を促す。
		System.out.print("整数値：");
		min2 = stdIn.nextInt();

		//最小値を比較したい整数値の入力を促す。
		System.out.print("整数値：");
		min3 = stdIn.nextInt();

		//最小値を比較するメソッドに整数を渡し、帰ってきた判定を表示する。
		System.out.println("最小値は" + min(min1, min2, min3) + "です。");

		stdIn.close();
	}

	static int min(int min1, int min2, int min3) {
		int min = min1;		//仮の最小値を格納する。

		//大小を比較する
		if(min2 < min) {
			min = min2;
		}

		if(min3 < min) {
			min = min3;
		}

		//求めた最小値を返却する。
		return min;
	}

}
