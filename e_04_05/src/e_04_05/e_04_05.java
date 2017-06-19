/*演習4-5
 * カウントダウンプログラムのインクリメントが前置の時の動作を確認する。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_05;
import java.util.Scanner;

public class e_04_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int max;	//カウントダウンの始点となる整数値。

		//カウントダウンの始点の入力を促す。
		System.out.print("カウントダウンの始点を入力してください。");
		max = stdIn.nextInt();

		//入力された値から0までカウントダウンする。
		for( ; max >= 0; --max) {
			System.out.println(max);
		}

		//カウントダウンが終了した時の値を表示する。
		System.out.println("カウントダウンが終了しました。\n終了時の値は" + max + "です。");

		stdIn.close();
	}

}