/*演習4‐26
 * 整数値を次々と読み込んで、負でない値の合計と平均を求めるプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_26;
import java.util.Scanner;

public class e_04_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int i = 0;		//繰り返し回数を設定する整数。
		int num = 0;	//いくつの整数を読み込むかを設定する整数。
		int sum = 0;	//求めた合計を代入する整数。
		int t = 0;		//合計を求めるときに使う変数。

		//何個の整数を読み込むかを入力する。
		System.out.print("何個の整数を入力しますか");
		num = stdIn.nextInt();

		//整数と次々と入力して合計を求める繰り返し。
		for( ; i < num; i++) {
			System.out.print("整数（0で終了）：");
			t = stdIn.nextInt();

			//0なら強制終了。
			if(t == 0) {
				break;

			} else if(t < 0) {
				System.out.println("負の値は加算しません。");
				i--;
				num--;

			} else {
				sum += t;
			}

		}

		//求めた合計と平均を表示。
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + (sum / i) +"です。");

		stdIn.close();
	}

}
