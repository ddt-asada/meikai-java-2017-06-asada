/*演習9-2
 * 日付クラスを作成し、全コンストラクタの動きが確認できるプログラムを作成する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_09_02;

public class e_09_02 {

	public static void main(String[] args) {
		//日付クラスに存在する5種類すべてのコンストラクタを呼び出し配列を作る。
		Day d1 = new Day();				//空のコンストラクタを呼び出す。
		Day d2 = new Day(2000);			//年数のみを入力したコンストラクタを呼び出す。
		Day d3 = new Day(1999, 5);		//年数と月を入力したコンストラクタを呼び出す。
		Day d4 = new Day(1993, 9, 11);	//年月日すべてを入力したコンストラクタを呼び出す。
		Day d5 = new Day(d4);			//コピーコンストラクタを呼び出す。

		//全てのインスタンスの中身を表示してどのようになったかを確認する。
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);
		System.out.println("d5 = " + d5);
	}

}
