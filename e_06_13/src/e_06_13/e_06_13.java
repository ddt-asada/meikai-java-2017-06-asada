/*演習6-13
 * 配列の全要素を逆順にコピーするプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */

package e_06_13;
import java.util.Scanner;

public class e_06_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;	//配列の要素数。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		n = stdIn.nextInt();

		int[] array1 = new int[n];		//コピー元の配列を生成。
		int[] array2 = new int[n];		//コピー先の配列を生成。

		//配列の要素を入力。
		for(int i = 0; i < n; i++) {
			System.out.print("array1[" + i + "] = ");
			array1[i] = stdIn.nextInt();
		}

		//配列を逆順にコピー。
		for(int i = 0; i < n; i++) {
			array2[n - i - 1] = array1[i];	//配列の後ろにコピー。
		}

		//コピーし終わった配列を表示。
		for(int i = 0; i < n; i++) {
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

		stdIn.close();
	}

}
