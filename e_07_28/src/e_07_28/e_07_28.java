/*演習7-28
 * 行列の和を格納した2次元配列を返すメソッドを作成する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_28;

import java.util.Scanner;

public class e_07_28 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int row;		//行列の行に当たる整数。
		int column;		//行列の列に当たる整数。

		//行列の行数と列数を入力。
		System.out.print("行列の行数：");
		row = stdIn.nextInt();

		System.out.print("行列の列数：");
		column = stdIn.nextInt();

		//計算に使う行列の生成
		int[][] a = new int[row][column];
		int[][] b = new int[row][column];

		//行列をの要素を入力していく。
		//行列aの要素の入力。
		System.out.println("行列a");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print("a[" + i + "][" + j + "]：");
				a[i][j] = stdIn.nextInt();

			}
		}

		//行列bの要素の入力。
		System.out.println("行列b");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print("b[" + i + "][" + j + "]：");
				b[i][j] = stdIn.nextInt();

			}
		}

		//行列の和を格納した行列を返却するメソッドを呼び出す。
		int c[][] = addMatrix(a, b);

		//行列を表示して中身を確認する。
		//行列aの中身を表示。
		System.out.println("行列a");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.printf("%3d", a[i][j]);

			}
			System.out.println();

		}

		//行列bの中身を表示。
		System.out.println("行列b");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.printf("%3d", b[i][j]);

			}
			System.out.println();

		}

		//行列cの中身を表示。
		System.out.println("行列c");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.printf("%3d", c[i][j]);

			}
			System.out.println();

		}

		stdIn.close();
	}

	static int[][] addMatrix(int[][] x, int[][] y) {
		//求めた和を格納するための行列を生成する。
		int[][] z = new int[x.length][];

		//行列の和を求める。
		//行列aの中身を表示。
		for(int i = 0; i < x.length; i++) {
			z[i] = new int[x[0].length];
			for(int j = 0; j < x[0].length; j++) {
				z[i][j] = x[i][j] + y[i][j];

			}
		}

		//和を格納した行列を返却する。
		return z;
	}
}

