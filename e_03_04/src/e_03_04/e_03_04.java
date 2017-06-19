/*演習3-4
 * 二つの変数を読みこんで、大小関係を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_04;
import java.util.Scanner;

public class e_03_04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//大小を比較する変数の入力を促す。
		System.out.print("大小を比較したい整数値を入力してください");
		int com1 = stdIn.nextInt();	//キーボードから読み込む。

		//大小を比較する変数の入力を促す。
		System.out.print("大小を比較したい整数値を入力してください");
		int com2 = stdIn.nextInt();	//キーボードから読み込む。

		//入力された整数値の大小を比較することを表示。
		System.out.println(com1 + "と" + com2 + "の大小を比較します。");

		//大小を比較するための分岐。
		if(com1 > com2) {
			System.out.println(com1 + "の方が大きいです。");

		} else if (com1 < com2) {
			System.out.println(com2 + "の方が大きいです。");

		} else if (com1 == com2) {
			System.out.println("等しいです。");

		}
		
		stdIn.close();
	}
}
