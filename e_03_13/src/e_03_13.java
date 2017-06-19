/*演習3-13
 * 三つの整数値の中央値を求めて表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
import java.util.Scanner;

public class e_03_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int med;	//求めた中央値を格納するための整数値。

		//中央値をもとめたい整数値の入力を促す。
		System.out.print("中央値をもとめたい整数を入力してください。");
		int com1 = stdIn.nextInt();		//整数を読み込む。

		//中央値をもとめたい整数値の入力を促す。
		System.out.print("中央値をもとめたい整数を入力してください。");
		int com2 = stdIn.nextInt();		//整数を読み込む。

		//中央値をもとめたい整数値の入力を促す。
		System.out.print("中央値をもとめたい整数を入力してください。");
		int com3 = stdIn.nextInt();		//整数を読み込む。

		//中央値を求めるための分岐。
		if(com1 >= com2) {
			if(com2 > com3) {
				med = com2;

			} else if(com1 <= com3) {
				med = com1;

			} else {
				med = com3;

			}

		} else if(com1 > com3) {
			med = com1;

		} else if(com2 > com3) {
			med = com2;

		} else {
			med = com3;
		}

		//求めた中央値を表示する。
		System.out.println("中央値は" + med + "です。");

		stdIn.close();
	}

}
