/*演習7-8
 * a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成する。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_07_08;
import java.util.Random;
import java.util.Scanner;

public class e_07_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int max;	//生成したい乱数の上限値。
		int min;	//生成したい乱数の下限値。

		//生成したい乱数の上限値の入力を促す。
		System.out.print("乱数の上限値：");
		max = stdIn.nextInt();

		//生成したい乱数の下限値の入力を促す。
		System.out.print("乱数の下限値：");
		min = stdIn.nextInt();

		//乱数を生成するメソッドを呼び出し、帰ってきた乱数を表示する。
		System.out.println("生成した乱数は" + random(max, min) + "です。");

		stdIn.close();
	}

	//受け取った引数を上限値と下限値とした乱数の生成を行うメソッド
	static int random(int max, int min) {
		Random rand = new Random();

		int random;		//生成した乱数を格納する整数。

		//受け取った下限値が上限値を超えていないかの判定お行う分岐。
		if(min >= max) {
			random = min;

		} else {
		random = min + rand.nextInt(max - min + 1);

		}

		return random;	//生成した乱数を返す。
	}
}
