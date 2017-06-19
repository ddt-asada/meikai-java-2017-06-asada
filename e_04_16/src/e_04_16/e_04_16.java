/*演習4-16
 * 読み込んだ個数だけ記号文字を表示するプログラムを書き換えて、5個表示するごとに改行するようにする。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_16;
import java.util.Scanner;

public class e_04_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num = 0;	//*を表示する個数を入れる整数。

		//*を表示したい数の入力を促す。
		System.out.print("*を何個表示しますか？");
		num = stdIn.nextInt();

		//入力された個数分だけ+-を表示する。
		for(int i = 0 ; i < num; i++) {
			System.out.print('*');

			//5個表示するごとに改行するための分岐。
			if(i % 5 == 4) {
				System.out.print('\n');
			}

			//表示する記号文字がなくなったときに改行するための分岐。
			if(i == num - 1) {
				System.out.print('\n');
			}
		}

		stdIn.close();
	}

}
