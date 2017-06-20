/*演習6-12
 * 配列の要素の並びをシャッフルするプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_12;
import java.util.Random;
import java.util.Scanner;

public class e_06_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int n;			//配列の要素数を決めるのに使う。
		int shuffle1;	//配列のシャッフルするときに使う整数。
		int shuffle2;	//配列のシャッフルするときに使う整数。
		int t;			//配列をシャッフルするときの仮の置き場。

		//配列の要素数の入力を促す。
		System.out.print("配列の要素数を入力してください。");
		n = stdIn.nextInt();

		//入力された要素数の配列を生成。
		int[] a = new int[n];

		//配列の全要素に整数を入力。
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		//配列をシャッフルしていく。
		for(int i = 0; i < n; i++) {
			shuffle1 = rand.nextInt(n);	//配列のシャッフル先を乱数により決定。
			shuffle2 = rand.nextInt(n);	//配列のシャッフル先を乱数により決定。

			//シャッフルする対象が同じの時をはじく分岐。
			if(shuffle1 != shuffle2) {
				t = a[shuffle1];
				a[shuffle1] = a[shuffle2];
				a[shuffle2] = t;
			}
		}

		//配列の全要素を表示して確認。
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		stdIn.close();
	}

}
