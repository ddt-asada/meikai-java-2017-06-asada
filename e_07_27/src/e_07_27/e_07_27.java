/*演習7-27
 * 行列xとyの和を求めてzに格納するメソッドaddMatrixを作成する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_27;
import java.util.Scanner;

public class e_07_27 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//計算に使う行列の生成
		int[][] a = {{1, 2, 3}, {4, 5, 6}};
		int[][] b = {{6, 3, 4}, {5, 1, 2}, {1, 2, 3}};
		int[][] c = new int[2][3];

		//行列の和を求めるメソッドを呼び出し、計算に成功したら行列の中身を表示する。
		if(addMatrix(a, b, c)) {
			//行列を表示。
			System.out.println("行列a");
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.printf("%3d", a[i][j]);

				}
				System.out.println();

			}

			System.out.println("行列b");
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.printf("%3d", b[i][j]);

				}
				System.out.println();

			}

			System.out.println("行列b");
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.printf("%3d", c[i][j]);

				}
				System.out.println();

			}

		//失敗した場合は失敗したとを表示。
		} else {
			System.out.println("行列の計算に失敗しました。");

		}

		stdIn.close();
	}

	//行列の和を求め、計算に成功した場合はtrueを返すメソッド
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		boolean judge;	//計算の成否の判定を格納する整数。

		//行列同士の要素数が等しいかどうかの比較を行い、等しい場合は和を求める。
		if(x.length == y.length && x[0].length == y[0].length) {
			//行列の和を求める。
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[0].length; j++) {
					z[i][j] = x[i][j] + y[i][j];

				}
			}
			judge = true;	//計算が成功したことを格納。

		//要素数が異なった場合は
		} else {
			judge = false;	//計算が失敗したことを格納。

		}

		//判定結果を返却する。
		return judge;
	}

}
