/*演習10-5
 * 口座が開設されるたびに「口座開設ありがとうございます。」と表示するように銀行口座クラスを変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_10_05;

public class Account {
	private static int counter= 0;		//何番までの識別番号を与えたか。
	private String name;		//口座名義
	private String no;			//口座番号
	private long balance;		//預金残高
	private int id;					//識別番号

	//インスタンス初期化子
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	//コンストラクタ
	Account(String n, String num, long z){
		name = n;		//口座名義
		no = num;		//口座番号
		balance = z;	//預金残高
		id = ++counter;	//識別番号
	}

	//口座名義のゲッタ
	String getName() {
		return name;
	}

	//口座番号のゲッタ
	String getNo() {
		return no;
	}

	//預金残高のゲッタ
	long getBlance() {
		return balance;
	}

	//識別番号のゲッタ
	public int getId() {
		return id;
	}

	//お金を預けるメソッド
	void deposit(long k) {
		balance += k;
	}

	//お金を引き出すメソッド
	void withdraw(long k) {
		balance -= k;
	}
}
