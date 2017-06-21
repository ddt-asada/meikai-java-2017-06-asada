/*演習7-19
 * 配列から任意の要素を先頭とする指定した個数の要素を削除するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_19;
import java.util.Scanner;

public class e_07_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;		//配列の要素数。
		int idx;	//配列のどこの要素を先頭として削除するかの指定。
		int n;		//配列のどこまでの削除するかの指定。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		num =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[num];

		//どこから削除するか。
		System.out.print("どこの要素を先頭に削除しますか：");
		idx = stdIn.nextInt();

		//どこまで削除するか。
		System.out.print("どこまでの要素を削除しますか：");
		n = stdIn.nextInt();


		//配列の全要素に値を入れる。
		for(int i = 0; i < num; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//配列の要素を削除するメソッドを呼び出す。
		aryRmvN(array, idx, n);

		//要素を削除した配列を表示する。
		for(int i = 0; i < num; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

		stdIn.close();
	}

	static void aryRmvN(int[] array, int idx, int n) {
		//配列の任意の要素を削除する。
		for(int i = idx; i < idx + n - 1; i++) {
			array[i] = array[i + n];
		}
	}

}