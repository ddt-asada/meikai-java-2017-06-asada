/*演習3-14
 * 二つの整数値の小さい方と大きい方の両方を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_14;
import java.util.Scanner;

public class e_03_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int min;		//求めた最小値を格納する整数値。
		int max;		//求めた最大値を格納する整数値。

		//最大と最小を求めたい整数値を入力することを促す。
		System.out.print("最大と最小を求めたい整数値を入力してください。");
		int com1 = stdIn.nextInt();

		//最大と最小を求めたい整数値を入力することを促す。
		System.out.print("最大と最小を求めたい整数値を入力してください。");
		int com2 = stdIn.nextInt();

		//大小を判定するための分岐。
		if(com1 > com2) {
			min = com2;		//最小値を取得。
			max = com1;		//最大値を取得。

		} else {
			min = com1;		//最小値を取得。
			max = com2;		//最大値を取得。

		}

		//最大値と最小値を表示。
		System.out.println("最大値は" + max + "です。");
		System.out.println("最小値は" + min + "です。");

		stdIn.close();

	}

}
