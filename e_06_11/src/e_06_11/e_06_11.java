/*演習6-11
 * 異なる要素が同じ値を持つことの内容に乱数を配列に代入していく。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_11;

import java.util.Random;
import java.util.Scanner;

public class e_06_11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の要素数を決めるのに使う。

		//配列の要素数の入力を促す。
		System.out.print("配列の要素数を入力してください。");
		n = stdIn.nextInt();

		//入力された要素数の配列を生成。
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = 1 + rand.nextInt(10);

			//生成された配列の全要素に1～10の乱数を代入。
			for(int j = 0; j < i; j++) {

				//ほかの要素に同じ値があった場合はもう一度乱数を求める。
				if(a[i] == a[j]) {
					do {
						a[i] = 1 + rand.nextInt(10);

					}while(a[i] == a[j]);
					j = -1;
				}
			}
		}
		//配列の全要素を表示して確認。
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		stdIn.close();
	}

}
