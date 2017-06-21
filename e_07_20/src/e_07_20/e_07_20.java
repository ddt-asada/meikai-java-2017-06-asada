/*演習7-20
 * 配列の任意の要素に整数を挿入するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_20;
import java.util.Scanner;

public class e_07_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//配列の要素数。
		int idx;	//配列のどこの要素に挿入するか指定。
		int x;		//配列に挿入したい値。。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		num =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[num];

		//配列の全要素に値を入れる。
		for(int i = 0; i < num; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//どこに挿入するか。
		System.out.print("どこに挿入しますか：");
		idx = stdIn.nextInt();

		//どの値を挿入するか。
		System.out.print("挿入する値：");
		x = stdIn.nextInt();


		//配列の要素を挿入するメソッドを呼び出す。
		aryIns(array, idx, x);

		//要素を削除した配列を表示する。
		for(int i = 0; i < num; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

		stdIn.close();
	}

	static void aryIns(int[] array, int idx, int x) {
		//挿入する箇所の値を後ろにずらす繰り返し。
		for(int i = array.length - 1; i > idx; i--) {
			array[i] = array[i - 1];
		}

		//空いた箇所に挿入したい値を入れる。
		array[idx] = x;
	}

}
