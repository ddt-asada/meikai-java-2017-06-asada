/*演習4-6
 * 読み込んだ値の数だけ＊を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_06;
import java.util.Scanner;

public class e_04_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//＊を表示する個数を入れる整数。

		//＊を表示したい数の入力を促す。
		System.out.print("＊を何個表示しますか？");
		num = stdIn.nextInt();

		//入力された個数分だけ＊を表示する。
		for( ; num > 0; num--) {
			System.out.print('*');

			if(num == 1) {
				System.out.print('\n');
			}
		}

		stdIn.close();
	}
}
