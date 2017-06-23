/*演習15-4
 * 浮動小数点値を表示するメソッドを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_15_04;

public class e_15_04 {

	public static void main(String[] args) {
		//浮動小数点値を表示するメソッドを呼び出す。
		printDouble(23.52, 5, 10);
	}

	//浮動小数点値を小数点以下をp桁、全体をw桁で表示するプログラム。
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df\n", w, p), x);
	}

}
