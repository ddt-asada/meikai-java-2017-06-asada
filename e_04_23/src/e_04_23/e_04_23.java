/*演習4－23
 * n段の数字ピラミッドを表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_23;

import java.util.Scanner;

public class e_04_23 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int pilamid = 0;		//何段のピラミッドを作るかの整数。

		//何段のピラミッドを生成するかを入力する。
		System.out.print("何段のピラミッドを作りますか。");
		pilamid = stdIn.nextInt();

		//ピラミッドを生成する繰り返し。
		for(int i = 1; i <= pilamid; i++) {

			//空白を挿入して間隔を調整する。
			for(int j = 0; j < pilamid - i; j++) {
				System.out.print(' ');
			}

			//横方向の移動。
			for(int j = 0; j <((i - 1) * 2 + 1); j++) {
				System.out.print(i % 10);
			}

			System.out.println();
		}

		stdIn.close();
	}

}
