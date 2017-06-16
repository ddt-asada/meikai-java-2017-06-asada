/*演習2-3
 * 少数部を持つ実数値で合計と平均を求める。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_03;

public class e_02_03 {

	public static void main(String[] args) {
		double x = 100.2;	//合計と平均を求めるのに使う変数。
		double y = 50.1;		//合計と平均を求めるのに使う変数。

		//合計を求めて表示する。
		System.out.println("xとyの合計は" + (x + y));
		//平均を求めて表示する。
		System.out.println("xとyの平均は" + ((x + y ) / 2));
	}

}
