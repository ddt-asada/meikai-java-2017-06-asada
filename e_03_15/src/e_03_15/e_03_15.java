/*演習3-15
 * 二つの整数値を読み込んで降順にソート
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_15;
import java.util.Scanner;

public class e_03_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int swap;		//ソートする際の仮の置き場となる整数値。

		//ソートしたい整数値を入力することを促す。
		System.out.print("ソートしたい整数値を入力してください。");
		int com1 = stdIn.nextInt();

		//ソートしたい整数値を入力することを促す。
		System.out.print("ソートしたい整数値を入力してください。");
		int com2 = stdIn.nextInt();

		//ソートするための分岐。
		if(com1 < com2) {
			swap = com1;	//仮の置き場に値を保管。
			com1 = com2;		//入れ替える。
			com2 = swap;		//入れ替える。。

		}

		//最大値と最小値を表示。
		System.out.println("降順は" + com1 + "です。");
		System.out.println("降順は" + com2 + "です。");

		stdIn.close();

	}

}
