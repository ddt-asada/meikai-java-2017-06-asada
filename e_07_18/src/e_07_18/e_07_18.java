/* 演習7-18
 * 配列から任意の要素を削除するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_18;
import java.util.Scanner;

public class e_07_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の要素数。
		int idx;	//配列のどこの要素を削除するかの指定。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		n =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[n];

		//何番目の要素を削除するか。
		System.out.print("何番目を削除しますか：");
		idx = stdIn.nextInt();

		//配列の全要素に値を入れる。
		for(int i = 0; i < n; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//配列の要素を削除するメソッドを呼び出す。
		aryRmv(array, idx);

		//要素を削除した配列を表示する。
		for(int i = 0; i < n; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

		stdIn.close();
		}

	static void aryRmv(int[] array, int idx){
		//配列の値を削除する。
		for(int i = idx; i <(array.length - 1); i++) {
			array[i] = array[i + 1];
		}
	}

}
