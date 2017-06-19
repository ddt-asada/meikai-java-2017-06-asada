/*演習3-12
 * キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_12;
import java.util.Scanner;

public class e_03_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int min;	//求めた最小値を格納するための整数値。

		//最小値をもとめたい整数値の入力を促す。
		System.out.print("最小値をもとめたい整数を入力してください。");
		int com1 = stdIn.nextInt();		//整数を読み込む。

		//最小値をもとめたい整数値の入力を促す。
		System.out.print("最小値をもとめたい整数を入力してください。");
		int com2 = stdIn.nextInt();		//整数を読み込む。

		//最小値をもとめたい整数値の入力を促す。
		System.out.print("最小値をもとめたい整数を入力してください。");
		int com3 = stdIn.nextInt();		//整数を読み込む。

		min = com1;		//仮の最小値として代入。

		//最小値を求めるための分岐。
		if(min > com2) {
			min = com2;
		}

		//最小値を求めるための分岐。
		if(min > com3) {
			min = com3;
		}

		//求めた最小値を表示する。
		System.out.println("最小値は" + min + "です。");
		
		stdIn.close();
	}

}
