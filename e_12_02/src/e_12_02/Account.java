/*演習12-2
 * スーパークラス普通預金残高とサブクラス定期預金残高の合計額を比較する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_12_02;

public class Account {
	private String name;		//口座名義
	private String no;			//口座番号
	private long balance;		//預金残高

	//コンストラクタ
	public Account(String n, String num, long z) {
		name = n;		//口座名義
		no = num;		//口座番号
		balance = z;	//預金残高
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

	//預金残高のセッタ
	void setBalance(long money) {
		balance += money;
	}

	//貯金メソッド
	void deposit(long k) {
		balance += k;
	}

	//引き下ろしメソッド
	void withdraw(long k) {
		balance -= k;
	}
}
