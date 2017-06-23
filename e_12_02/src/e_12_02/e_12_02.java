/*演習12-2
 * スーパークラス普通預金残高とサブクラス定期預金残高の合計額を比較する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */

package e_12_02;

public class e_12_02 {

	public static void main(String[] args) {
		//普通預金クラスよりインスタンスを生成。
		Account asada = new Account("浅田", "12345", 10000);

		//定期預金残高クラスよりインスタンスを生成。
		TimeAccount kazushi = new TimeAccount("知嗣", "123456", 10000, 5000);
		//合計額を比較するメソッドを呼び出し、結果を表示。
		System.out.println("合計額を比較しました。結果は" + kazushi.compBalance(asada, kazushi) + "です。");
	}

}