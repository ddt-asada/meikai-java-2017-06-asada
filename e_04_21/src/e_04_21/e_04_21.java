/*演習4－21
 * 直角が左下、左上、右下、右上のあっ角形を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成さ：浅田　知嗣
 */
package e_04_21;
import java.util.Scanner;

public class e_04_21 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int tri = 0;	//何段のピラミッドを作るかを入れる整数。

		//何段のピラミッドを作るかの入力を促す。
		System.out.print("何段のピラミッドを作りますか。");
		tri = stdIn.nextInt();


		//左下直角の三角形を生成する繰り返し。
		System.out.println("左下直角三角形");
		//縦方向の移動。
		for(int i = 1; i <= tri; i++) {

			//横方向の移動
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}

			System.out.println();
		}

		//左上直角の三角形を生成する繰り返し。
		System.out.println("左上直角三角形");
		//縦方向の移動。
		for(int i = tri; i > 0; i--) {

			//横方向の移動。
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}

			System.out.println();
		}

		//右上直角の三角形を生成する繰り返し。
		System.out.println("右上直角三角形");
		//縦方向の移動。
		for(int i = 0; i < tri; i++) {

			//空白を挿入して間隔を調整する。
			for(int j = 0; j < i; j++) {
				System.out.print(' ');
			}

			//横方向の移動。
			for(int j = i; j < tri; j++) {
				System.out.print('*');
			}

				System.out.println();
		}

		//右下直角の三角形を生成する繰り返し。
		System.out.println("右下直角三角形");
		//縦方向の移動。
		for(int i = tri; i > 0; i--) {

			//空白を挿入して間隔を調整する。
			for(int j = 0; j < i - 1; j++) {
				System.out.print(' ');
			}

			//横方向の移動。
			for(int j = i; j <= tri; j++) {
				System.out.print('*');
			}

				System.out.println();
		}

		stdIn.close();
	}

}
