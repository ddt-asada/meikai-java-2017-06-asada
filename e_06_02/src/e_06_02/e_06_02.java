/*演習6-2
 * 要素型がint型で要素数が5の配列の要素に対して先頭から順に5～1を代入して表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_02;

public class e_06_02 {

	public static void main(String[] args) {
		//int型の要素数5の配列を5～1で初期化。
		int a[] = {5, 4, 3, 2, 1};

		//配列の中身を表示。
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
