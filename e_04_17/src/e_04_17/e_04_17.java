/*演習4-17
 * 読み込んだ整数値のすべての約数と、その個数を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_17;
import java.util.Scanner;

public class e_04_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int div;		//約数をもとめたい整数。
		int count = 0;	//約数が含まれていた数をカウントする整数。

		//約数をもとめたい整数値の入力を促す。
		System.out.print("約数をもとめたい整数を入力してください。");
		div = stdIn.nextInt();

		//約数を求める繰り返し。
		for(int i = 1; i <= div; i++) {

			//約数が含まれていたときにその約数の表示とカウントを行うための分岐。
			if(div % i == 0) {
				System.out.print(i + " ");
				count++;

			}
		}

		//求めた約数の数を表示する。
		System.out.println("約数は" + count + "個見つかりました。");

		stdIn.close();
	}

}
