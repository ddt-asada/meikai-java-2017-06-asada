/*演習6-5
 * 配列の要素数と個々の要素数の値を読み込んで、各要素の値を表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_05;
import java.util.Scanner;

public class e_06_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;					//配列の要素数。

		//配列の要素数の入力を促す。
		System.out.print("配列の要素数は：");
		n = stdIn.nextInt();

		int[] a = new int[n];	//要素数nの配列。

		//配列の各要素に値を入力。
		System.out.println("配列の全要素に値を代入します。");

		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();

		}

		//入力された配列の全要素を表示する。
		System.out.print('{');

		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}

		System.out.println('}');

		stdIn.close();
	}

}
