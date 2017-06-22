/*演習10-5
 * 口座が開設されるたびに「口座開設ありがとうございます。」と表示するように銀行口座クラスを変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_10_05;

public class e_10_05 {

	public static void main(String[] args) {

		//口座を開設してインスタンス初期化子が実行されるかを確認する。
		Account asada = new Account("浅田", "12345", 1000);
		Account kazushi = new Account("知嗣", "23145", 1500);
		Account asadakazushi = new Account("浅田知嗣", "1232145", 2000);
	}

}
