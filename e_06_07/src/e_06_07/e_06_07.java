/*演習6-7
 * 配列から任意の値を持つ要素を探すプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_07;
import java.util.Scanner;

public class e_06_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;			//配列の要素数。
		int key;		//探索する値。
		int dis = 0;	//値を見つけた場所を記憶させる。

		//配列の要素数の入力。
		System.out.print("配列の要素数は：");
		n = stdIn.nextInt();

		//配列を生成。
		int[] a = new int[n];

		//配列の全要素に値を入力。
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		//どの値を探索したいかを入力。
		System.out.print("どの値を探しますか：");
		key = stdIn.nextInt();

		//入力された値を配列から探し出す。
		for(int i = 0; i < n; i++) {
			//値を見つけたとき。
			if(a[i] == key && dis == 0) {
				dis = i;	//値を取り出す。

			}
		}

		//見つけた場所を表示。
		System.out.println("それはa[" + dis + "]にあります。");

		stdIn.close();
	}

}
