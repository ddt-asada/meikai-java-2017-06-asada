/*演習7-10
 * 4種類の問題をランダムに出題する3桁の整数の暗算トレーニングプログラム。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_10;
import java.util.Random;
import java.util.Scanner;

public class e_07_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int select = 0;	//問題の種類を選択する整数。
		int retry = 1;	//暗算トレーニングを繰り返すかどうかの判定で使用する整数。

		int x;			//暗算トレーニングに使用する整数。
		int y;			//暗算トレーニングに使用する整数。
		int z;			//暗算トレーニングに使用する整数。

		//暗算トレーニングの開始を宣言。
		System.out.println("暗算トレーニング！！");

		//終了を選択するまで繰り返す。
		for( ; retry != 0; ) {
			select = rand.nextInt(4);		//問題の種類を乱数により決定。

			x = 100 + rand.nextInt(900);	//問題に使う値を乱数により決定。
			y = 100 + rand.nextInt(900);	//問題に使う値を乱数により決定。
			z = 100 + rand.nextInt(900);	//問題に使う値を乱数により決定。

			//4種類の問題を出題する関数をランダムに読み込む。
			switch(select) {
			case 0:	question0(x, y, z);	break;
			case 1:	question1(x, y, z);	break;
			case 2:	question2(x, y, z);	break;
			case 3:	question3(x, y, z);	break;
			}


			//暗算トレーニングをもう一度行うかを選択する。
			System.out.print("もう一度？ はい…1 いいえ…0");
			retry = stdIn.nextInt();
		}

		stdIn.close();
	}

	//問題を出題する関数。
	static void question0(int x, int y, int z) {
		Scanner stdIn = new Scanner(System.in);

		int answer = 0;		//問題の答えを入力する整数。

		//問題に正解するまで繰り返す。
		for( ; (x + y + z) != answer; ) {
			//問題を表示する。
			System.out.print(x + " + " + y + " + " + z + " = ");
			answer = stdIn.nextInt();

			//答えの判定の分岐。
			if((x + y + z) == answer) {
				System.out.println("正解です！！");

			} else {
				System.out.println("不正解です…");

			}
		}
	}

	//問題を出題する関数。
	static void question1(int x, int y, int z) {
		Scanner stdIn = new Scanner(System.in);

		int answer = 0;		//問題の答えを入力する整数。

		//問題に正解するまで繰り返す。
		for( ; (x + y - z) != answer; ) {
			//問題を表示する。
			System.out.print(x + " + " + y + " - " + z + " = ");
			answer = stdIn.nextInt();

			//答えの判定の分岐。
			if((x + y - z) == answer) {
				System.out.println("正解です！！");

			} else {
				System.out.println("不正解です…");

			}
		}
	}

	//問題を出題する関数。
	static void question2(int x, int y, int z) {
		Scanner stdIn = new Scanner(System.in);

		int answer = 0;		//問題の答えを入力する整数。

		//問題に正解するまで繰り返す。
		for( ; (x - y + z) != answer; ) {
		//問題を表示する。
			System.out.print(x + " - " + y + " + " + z + " = ");
			answer = stdIn.nextInt();

			//答えの判定の分岐。
			if((x - y + z) == answer) {
				System.out.println("正解です！！");

			} else {
				System.out.println("不正解です…");

			}
		}

			stdIn.close();
	}

	//問題を出題する関数。
	static void question3(int x, int y, int z) {
		Scanner stdIn = new Scanner(System.in);

		int answer = 0;		//問題の答えを入力する整数。

		//問題に正解するまで繰り返す。
		for( ; (x - y - z) != answer; ) {
		//問題を表示する。
			System.out.print(x + " - " + y + " - " + z + " = ");
			answer = stdIn.nextInt();

			//答えの判定の分岐。
			if((x - y - z) == answer) {
				System.out.println("正解です！！");

			} else {
				System.out.println("不正解です…");

			}
		}
	}
}
