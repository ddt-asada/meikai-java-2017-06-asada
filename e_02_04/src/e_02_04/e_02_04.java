/*演習2-4
 * 三つのint型変数に値を代入し、合計と平均を求めるプログラム。
 * 作成日：2017年6月16日
 * 作成者：浅田　知嗣
 */
package e_02_04;

public class e_02_04 {

	public static void main(String[] args) {
		int x = 100;	//合計と平均を求めるのに使う変数。
		int y = 20;	//合計と平均を求めるのに使う変数。
		int z = 1;	//合計と平均を求めるのに使う変数。

		//合計を求めて表示。
		System.out.println("xとyとzの合計は" + (x + y + z));

		//平均を求めて表示。
		System.out.println("xとyとzの平均は" + ((x + y + z) / 3));
	}

}
