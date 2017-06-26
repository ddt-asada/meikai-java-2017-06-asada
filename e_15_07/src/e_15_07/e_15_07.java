/*演習15-7
 * コマンドライン引数で与えられたすべての数値を加算して表示するプログラムを拡張for文にて再現。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_15_07;

public class e_15_07 {

	public static void main(String[] args) {
		double sum = 0.0;
		for(String i : args) {
			sum += Double.parseDouble(i);
		}
		
		System.out.println("合計は" + sum + "です。");
	}
}
