/*演習13-3
 * じゃんけんのプレーヤを表すクラス群を作成する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_13_03;
import java.util.Random;
import java.util.Scanner;

public class e_13_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int phand;		//プレイヤーの手を決定するのに利用する整数。
		int chand;		//CPUの手を決定するのに使う整数。

		chand = rand.nextInt(3);	//CPUの手を乱数により決定。

		//プレイヤーの手の入力を促す。
		System.out.print("どの手を出しますか：0…グー/1…チョキ/2…パー");
		phand = stdIn.nextInt();

		//じゃんけんクラスの配列を生成。
		Hand[] h = new Hand[2];

		//CPUの手を決定。
		h[0] = new CPU(chand);

		//プレイヤーの手を決定。
		h[1] = new Player(phand);

		//勝敗の判定。
		if(h[0].whand() > h[1].whand()) {
			System.out.println("CPUの勝ちです。");

		} else if (h[0].whand() < h[1].whand()) {
			System.out.println("あなたの勝ちです。");

		} else if (h[0].whand() == h[1].whand()) {
			System.out.println("あいこです。\n");
		}

		stdIn.close();
	}
}
