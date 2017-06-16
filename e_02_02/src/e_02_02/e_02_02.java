/*演習2-2
 * 二つの変数の合計と平均を求めて表示するプログラムを作成する。
 * 変数には適当な値を代入しておく。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_02;

public class e_02_02 {

	public static void main(String[] args) {
		int x = 100;	//合計と平均を求めるのに使う変数。
		int y = 50;		//合計と平均を求めるのに使う変数。

		//合計を求めて表示する。
		System.out.println("xとyの合計は" + (x + y));
		//平均を求めて表示する。
		System.out.println("xとyの平均は" + ((x + y ) / 2));
	}

}
