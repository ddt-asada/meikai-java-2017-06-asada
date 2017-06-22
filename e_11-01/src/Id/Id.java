/*演習11-1
 * パッケージの所属場所を変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package Id;

public class Id {
	static int counter = 0;		//何号までの識別番号を与えたか
	private int id;					//識別番号

	//コンストラクタ
	public Id() {
		id = ++counter;		//識別番号
	}

	//識別番号のゲッタ
	public int getId() {
		return id;
	}
}
