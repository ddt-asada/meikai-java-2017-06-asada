/*演習2-16
 * String型の変数を文字列で初期化したり、変数に文字列を代入するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_02_16;

public class e_02_16 {

	public static void main(String[] args) {
		String s1 = "浅田";		//文字列を初期化。
		String s2 = "知嗣";		//文字列を初期化。

		//初期化されているかを文字列を表示して確認。
		System.out.println("文字列s1：" + s1);
		System.out.println("文字列s2：" + s2);

		//文字列に代入。
		s1 = "浅田　知嗣";

		//再度表示して確認。
		System.out.println("文字列s1：" + s1);
		System.out.println("文字列s2：" + s2);
	}

}
