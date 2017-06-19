/*演習3-16
 * 三つの整数値を読み込んで昇順にソートするプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_16;

import java.util.Scanner;

public class e_03_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int swap;		//ソートする際の仮の置き場となる整数値。

		//ソートしたい整数値を入力することを促す。
		System.out.print("ソートしたい整数値を入力してください。");
		int com1 = stdIn.nextInt();

		//ソートしたい整数値を入力することを促す。
		System.out.print("ソートしたい整数値を入力してください。");
		int com2 = stdIn.nextInt();

		//ソートしたい整数値を入力することを促す。
		System.out.print("ソートしたい整数値を入力してください。");
		int com3 = stdIn.nextInt();

		//昇順にソートするための分岐。
		if(com1 > com2) {
			swap = com1;	//仮の置き場に値を保管。
			com1 = com2;		//入れ替える。
			com2 = swap;		//入れ替える。。

		}

		//昇順にソートするための分岐。
		if(com2 > com3) {
			swap = com2;	//仮の置き場に値を保管。
			com2 = com3;		//入れ替える。
			com3 = swap;		//入れ替える。。

		}

		//昇順にソートするための分岐。
		if(com1 > com2) {
			swap = com1;	//仮の置き場に値を保管。
			com1 = com2;		//入れ替える。
			com2 = swap;		//入れ替える。。

		}

		//最大値と最小値を表示。
		System.out.println("昇順は" + com1 + "です。");
		System.out.println("昇順は" + com2 + "です。");
		System.out.println("昇順は" + com3 + "です。");

		stdIn.close();

	}
}
