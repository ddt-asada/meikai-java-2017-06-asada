/*演習9-3
 * 銀行口座クラスに口座開設日フィールドとtoStringメソッドを追加する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_09_03;

public class e_09_03 {

	public static void main(String[] args) {
		//インスタンスを生成する。
		Account asada = new Account("浅田知嗣","123456789", 1000, 1993,9,11);
		
		//ゲッタを順番に呼び出し、値がかえってくるかを確認する。
		//口座名義のゲッタを呼び出す。
		System.out.println(asada.getName());
		
		//口座番号のゲッタを呼び出す。
		System.out.println(asada.getNo());
		
		//預金残高のゲッタを呼び出す。
		System.out.println(asada.getBlance());
		
		//口座開設日の文字列表現を呼び出す。
		System.out.println("口座開設日：" + asada.toString());
	}

}
