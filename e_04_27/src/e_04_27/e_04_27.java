/*演習4－27
 * 数あてゲームの当てるべき数を0～99にせいげんしたプログラム
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_27;
import java.util.Random;
import java.util.Scanner;

public class e_04_27 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int x = 0;						//プレイヤーが入力する整数。
		int max = 6;					//最大の入力回数。
		int num = max;					//残り回数。
		int ran = rand.nextInt(100);	//当てるべき数を設定。

		//数あてゲームの開始を宣言。
		System.out.println("数あてゲーム開始！！");
		System.out.println("0～99の数を当ててください。");

		//正解するか規定回数まで無限ループ。
		do {
			System.out.print("いくつかな：");
			x = stdIn.nextInt();

			//答えより多きとき。
			if(x > ran) {
				System.out.println("もっと小さい数だよ。");
			} else if (x < ran) {
				System.out.println("もっと大きい数だよ。");
			} else {

				System.out.println("正解です！");
			}

			num--;
		} while (x != ran && num > 0);

		//正解だった場合。
		if(x == ran) {
			System.out.println((max - num) + "回で正解しました。");
		} else {
			System.out.println("正解は。" + ran + "です。");
		}

		stdIn.close();
	}

}
