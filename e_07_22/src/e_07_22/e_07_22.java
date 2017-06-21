/*演習7-22
 * 配列と同配列を生成して返却するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_22;
import java.util.Scanner;

public class e_07_22 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//配列の要素数。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		num =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[num];

		//配列の全要素に値を入れる。
		for(int i = 0; i < num; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//配列の全要素を交換するメソッドを呼び出す。
		int[] array2 = arrayClone(array);

		//複製した配列を表示する。
		for(int i = 0; i < num; i++) {
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

		stdIn.close();
	}

	static int[] arrayClone(int[] array) {
		//配列の要素数をコピーする。
		int[] copy = new int[array.length];

		//配列の要素をコピーする。
		for(int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}

		return copy;
	}

}
