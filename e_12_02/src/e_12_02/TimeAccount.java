/*演習12-2
 * スーパークラス普通預金残高とサブクラス定期預金残高の合計額を比較する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */

package e_12_02;

public class TimeAccount extends Account {
	private long timeBalance;		//預金残高（定期預金）

	//コンストラクタ
	TimeAccount(String n, String num, long z, long timeBalance) {
		super(n, num, z);
		this.timeBalance = timeBalance;		//定期預金残高
	}

	//定期預金残高のゲッタ。
	long getTimeBlance() {
		return timeBalance;
	}

	//定期預金を解約して全額を普通預金に移すメソッド。
	void cancel() {
		setBalance(timeBalance);
		timeBalance = 0;
	}

	//普通預金残高と定期預金残高の合計金額を比較し返却するメソッド。
	static int compBalance(Account a, Account b) {
		long abalance;		//比較に使う整数。
		long bbalance;		//比較に使う整数。
		int judge = 0;		//比較の判定結果を格納する。

		//キャストできるクラスであるかを判定する。
		//キャスト可能であれば普通預金と定期預金の合計金額を格納。
		if(a instanceof TimeAccount) {
			abalance = a.getBlance() + ((TimeAccount)a).timeBalance;

		} else {
			abalance = a.getBlance();
		}

		//キャストできるクラスであるかを判定する。
		//キャスト可能であれば普通預金と定期預金の合計金額を格納。
		if(b instanceof TimeAccount) {
		bbalance = b.getBlance() + ((TimeAccount)b).timeBalance;

		} else {
			bbalance = b.getBlance();
		}

		//合計金額の比較を行いその結果に応じた値を格納する。
		if(abalance > bbalance) {
			judge = 1;

		} else if(abalance < bbalance) {
			judge = -1;
		}

		//判定を返却する
		return judge;
	}


}
