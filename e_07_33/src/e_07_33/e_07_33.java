/*演習7-33
 * 1次元配列と2次元配列の全要素の値を表示する多重定義されたメソッド群を作成。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_33;

public class e_07_33 {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4};		//多重定義を呼び出すための配列。

		int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};	//多重定義を呼び出すための行列。

		//配列の中身を表示する多重定義されたメソッドを呼び出し、値を確認する。
		printArray(array);
		System.out.println();

		printArray(matrix);
	}

	//1次元配列の中身を表示するメソッド
	static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);

		}
		System.out.println();

	}

	//2次元配列の中身を表示するメソッド
	static void printArray(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);

			}
			System.out.println();
		}
	}

}
