/*演習10-2
 * 識別番号を任意の数ずつ増やして与えるように変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_10_02;

public class e_10_02 {

	public static void main(String[] args) {
		ID a = new ID();	//識別番号を取得。
		ID b = new ID(3);	//識別番号を取得。

		//識別番号を確認する。
		System.out.println("aの識別番号：" + a.getID());
		System.out.println("bの識別番号：" + b.getID());

		//最後に与えた識別番号を確認する。
		System.out.println("最後に与えた識別番号：" + ID.getMaxId());
	}

}
