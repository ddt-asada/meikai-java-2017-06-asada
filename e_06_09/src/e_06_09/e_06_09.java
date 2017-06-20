/*演習6-9
 * int型の配列を作り、全要素を1～10の乱数で埋め尽くす
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_09;

import java.util.Random;
import java.util.Scanner;

public class e_06_09 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の要素数を決めるのに使う。

		//配列の要素数の入力を促す。
		System.out.print("配列の要素数を入力してください。");
		n = stdIn.nextInt();

		//入力された要素数の配列を生成。
		int[] a = new int[n];

		//生成された配列の全要素に1～10の乱数を代入。
		for(int i = 0; i < a.length; i++) {
			a[i] = 1 + rand.nextInt(10);
		}

		//配列の全要素を表示して確認。
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		stdIn.close();
	}
}
