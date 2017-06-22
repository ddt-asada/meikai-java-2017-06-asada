/*演習9-3
 * 銀行口座クラスに口座開設日フィールドとtoStringメソッドを追加する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_09_03;

public class Account {
	private String name;		//口座名義
	private String no;			//口座番号
	private long balance;		//預金残高
	private int year;			//口座開設年
	private int month;			//口座開設月
	private int day;			//口座開設日

	//コンストラクタ
	Account(String n, String num, long z, int y, int m, int d){
		name = n;		//口座名義
		no = num;		//口座番号
		balance = z;	//預金残高
		year = y;		//口座開設年
		month = m;		//口座開設月
		day = d;		//口座開設日
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

	//口座開設年のゲッタ
	int getYear() {
		return year;
	}

	//口座開設月のゲッタ
	int getMonth() {
		return month;
	}

	//口座開設日のゲッタ
	int getDay() {
		return day;
	}

	//お金を預けるメソッド
	void deposit(long k) {
		balance += k;
	}

	//お金を引き出すメソッド
	void withdraw(long k) {
		balance -= k;
	}

	//口座開設日の文字列表現を返却するメソッド
	public String toString() {
		return String.format("%04d年%02d月%02d日", year, month, day);
	}
}
