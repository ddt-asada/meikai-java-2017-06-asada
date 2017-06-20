/*演習6-1
 * 要素型がdoubleで要素数が5の配列を生成して表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_01;

public class e_06_01 {

	public static void main(String[] args) {
		//要素数が5の配列を生成
		double[] a = new double[5];
		
		//配列の中身を一つ一つ表示して確認。
		for(int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
