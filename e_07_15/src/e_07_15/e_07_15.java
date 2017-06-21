/*演習7-15
 * 配列のぜんようその合計を求めるメソッドを作成。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_15;
import java.util.Scanner;

public class e_07_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の要素数。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		n =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[n];

		//配列の全要素に値を入れる。
		for(int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] = ");
			array[i] = stdIn.nextInt();
		}

		//配列の全要素の合計を求める関数に渡し、帰ってきた値を表示する。
		System.out.println("配列の全要素の合計は" + sumOf(array) + "です。");;

		stdIn.close();
	}

	//配列の全要素の合計を求める関数。
	static int sumOf(int[] array) {
		int sum = 0;	//求めた合計を格納する整数。

		//全要素の合計を求める。
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		//求めた合計を返す。
		return sum;
	}

}
