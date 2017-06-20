/*演習6-4
 * int型の配列に乱数を代入し、各要素の値を立て向きの棒グラフとして表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_06_04;
import java.util.Random;
import java.util.Scanner;

public class e_06_04 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の要素数を決めるのに使う。

		//配列の要素数の入力を促す。
		System.out.print("配列の要素数を入力してください。");
		n = stdIn.nextInt();

		//入力された要素数の配列を生成。
		int[] a = new int[n];

		//生成された配列の全要素に1～10の乱数を代入。
		for(int i = 0; i < a.length; i++) {
			a[i] = 1 + rand.nextInt(10);
		}

		//棒グラフを生成。
		for(int i = 10; i > 0; i--) {
			//配列の各要素が棒グラフの桁数と一致しているかを調べる。
			for(int j = 0; j < a.length; j++) {
				//もし一致していれば棒グラフとして＊を置く。
				if(a[j] >= i) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			//一つの行の走査が終わったら改行して次の列に行く。
			System.out.println();

		}

		//棒グラフが完成したら表なるようにインデックス等を付ける。
		System.out.println("-------------------------------------------");

		for(int i = 0; i < a.length; i++) {
			System.out.print((i % 10) + " ");

		}
		stdIn.close();
	}

}
