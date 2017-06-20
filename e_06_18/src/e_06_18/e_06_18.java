/*演習6-18
 * 行によって列数の異なる2次元配列を生成するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_18;
import java.util.Scanner;

public class e_06_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int height;	//行列の行に当たる部分。
		int width;	//行列の列に当たる部分。

		//行列の行数の入力。
		System.out.print("行列の行数：");
		height = stdIn.nextInt();

		//行列を生成。
		int[][] matrix = new int[height][];

		//凸凹な行列を生成する。
		for(int i = 0; i <height; i++) {
			System.out.print("各行の列数：");
			width = stdIn.nextInt();
			matrix[i] = new int[width];
		}

		//配列の各要素に値を代入していく。
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = stdIn.nextInt();
			}
		}

		//行列の要素を表示する。
		System.out.println("行列を表示します。");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d",matrix[i][j]);
		}

			System.out.println();
		}

		stdIn.close();
	}

}
