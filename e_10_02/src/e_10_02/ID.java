/*演習10-2
 * 識別番号を任意の数ずつ増やして与えるように変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_10_02;

public class ID {
	static int counter = 0;	//何番までの識別番号を与えたか。

	//最後に与えた識別番号を返すメソッド
	static int getMaxId() {
		return counter;
	}

	private int id;				//識別番号
	
	private int n = 1;			//かさんするばんごう。

	//デフォルトコンストラクタ
	public ID() {
		id = (counter += n);			//識別番号を加算。
	}
	
	//コンストラクタ
	public ID(int num) {
		n = num;
		id = (counter += n);			//識別番号を加算。
	}

	//識別番号を取得。
	public int getID() {
		return id;
	}
}
