/*演習7-29
 * 2次元配列をコピーして返却するメソッドを作成。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_29;

import java.util.Scanner;

public class e_07_29 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int row;		//行列の行に当たる整数。
		int column;		//行列の列に当たる整数。

		//行列の行数と列数を入力。
		System.out.print("行列の行数：");
		row = stdIn.nextInt();

		System.out.print("行列の列数：");
		column = stdIn.nextInt();

		//コピー元の行列の生成
		int[][] a = new int[row][column];

		//行列の要素を入力していく。
		//行列aの要素の入力。
		System.out.println("行列a");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print("a[" + i + "][" + j + "]：");
				a[i][j] = stdIn.nextInt();

			}
		}

		//行列をコピーして返却するメソッドを呼び出す。
		int b[][] = matrixClone(a);
		
		//行列の中身を確認。
		System.out.println("行列a");
		//行列の中身を表示するメソッドを呼び出す。
		printMatrix(a);
		
		//行列の中身を確認。
		System.out.println("行列b");
		//行列の中身を表示するメソッドを呼び出す。
		printMatrix(b);

		stdIn.close();
	}
	
	//行列の中身を表示するメソッド。
	static void printMatrix(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);

			}
			System.out.println();

		}
	}
	
	//行列をコピーするメソッド
	static int[][] matrixClone(int[][] a) {
		//コピー先の行列を生成。
		int[][] b = new int[a.length][];
		
		//コピーしていく。
		for(int i = 0; i < a.length; i++) {
			b[i] = new int [a[i].length];
			
			for(int j = 0; j < a[i].length; j++) {
				b[i][j] = a[i][j];
				
			}
		}
		
		//コピーした行列を返却。
		return b;
	}

}
