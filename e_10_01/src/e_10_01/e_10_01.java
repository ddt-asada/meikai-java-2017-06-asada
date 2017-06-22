/*演習10-1
 * 連番クラスに最後に与えた識別番号を返すメソッドを追加する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_10_01;

class ID {
	static int counter = 0;	//何番までの識別番号を与えたか。

	//最後に与えた識別番号を返すメソッド
	static int getMaxId() {
		return counter;
	}

	private int id;				//識別番号

	//コンストラクタ
	public ID() {
		id = ++counter;			//識別番号を加算。
	}

	//識別番号を取得。
	public int getID() {
		return id;
	}


}

public class e_10_01 {
	public static void main(String[] args) {
		ID a = new ID();	//識別番号を取得。
		ID b = new ID();	//識別番号を取得。

		//識別番号を確認する。
		System.out.println("aの識別番号：" + a.getID());
		System.out.println("bの識別番号：" + b.getID());

		//最後に与えた識別番号を確認する。
		System.out.println("最後に与えた識別番号：" + ID.getMaxId());
	}
}