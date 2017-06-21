/*演習7-21
 * 配列同士の全要素の値を交換するメソッド
 * 作成日；2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_21;
import java.util.Scanner;

public class e_07_21 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num1;	//一つ目の配列の要素数。
		int num2;	//二つ目の配列の要素数。

		//一つ目の配列の要素数の入力。
		System.out.print("一つ目の配列の要素数：");
		num1 =stdIn.nextInt();

		//二つ目の配列の要素数の入力。
		System.out.print("二つ目の配列の要素数：");
		num2 =stdIn.nextInt();

		//配列を生成。
		int[] array1 = new int[num1];
		int[] array2 = new int[num2];

		//配列の全要素に値を入れる。
		for(int i = 0; i < num1; i++) {
		System.out.print("array1[" + i + "] = ");
		array1[i] = stdIn.nextInt();
		}

		//配列の全要素に値を入れる。
		for(int i = 0; i < num2; i++) {
			System.out.print("array2[" + i + "] = ");
			array2[i] = stdIn.nextInt();
		}

		//配列の全要素を交換するメソッドを呼び出す。
		aryExchng(array1, array2);

		//要素を交換した配列を表示する。
		for(int i = 0; i < num1; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
		}

		//要素を交換した配列を表示する。
		for(int i = 0; i < num2; i++) {
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

		stdIn.close();
	}

	static void aryExchng(int[] array1, int[] array2) {
		//配列の要素数を比較して、小さい方の要素数を交換するための繰り返し回数として採用する。
		int num = array1.length < array2.length ? array1.length : array2.length;

		int tmp;	//配列の要素を交換する際の一時的な置き場。

		//配列の全要素を交換する繰り返し。
		for(int i = 0; i < num; i++) {
			tmp = array1[i];
			array1[i] = array2[i];
			array2[i] = tmp;
		}
	}

}
