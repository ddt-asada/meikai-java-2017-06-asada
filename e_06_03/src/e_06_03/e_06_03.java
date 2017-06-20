/*演習6-3
 * double型の要素数が5の配列の各要素に値を代入する。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_03;

public class e_06_03 {

	public static void main(String[] args) {
		double a[] = {1.1, 2.2, 3.3, 4.4, 5.5};

		//配列の全要素を表示。
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
