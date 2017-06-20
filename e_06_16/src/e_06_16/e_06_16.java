/*演習6-16
 * 4行3列と3行4列の積を求めるプログラムを作成。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_16;
import java.util.Scanner;

public class e_06_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[][]array1 = new int[4][3];	//積を求める配列。
		int[][]array2 = new int[3][4];	//積を求める配列。
		int[][]array3 = new int[4][4];	//積の答えをいれる配列。
		int sum = 0;					//行列の積を求める際の計算の途中で使う整数。

		//行列の中身を入力する。
		System.out.println("行列array1");
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("array1[" + i + "][" + j + "] = ");
				array1[i][j] = stdIn.nextInt();
			}
		}

		//行列の中身を入力する。
		System.out.println("行列array2");
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("array2[" + i + "][" + j + "] = ");
				array2[i][j] = stdIn.nextInt();
			}
		}

		for(int i = 0; i < 4; i++) {

			//行列内を横に移動。
			for(int j = 0; j < 4 ; j++) {

				//行列の積の計算。
				for(int k = 0; k < 3; k++) {

				sum += array1[i][k] * array2[k][j];	//行×列

				}

				array3[i][j] = sum;	//求めた積を行列の対応する場所に代入。

				sum = 0;			//次の計算に使うために、一度0にする。

			}
		}

		//求めた行列の積を表示。
		System.out.println("行列array3");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%5d", array3[i][j]);
			}

			System.out.println();
		}

		stdIn.close();
	}
}