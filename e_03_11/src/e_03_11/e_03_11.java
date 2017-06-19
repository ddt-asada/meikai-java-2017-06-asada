/*演習3-11
 * 二つの整数値を読み込んで、それらの値が10以下かどうかを判定するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_11;
import java.util.Scanner;

public class e_03_11 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	int diff;		//求めた差を格納する整数値。

	//差をもとめたい整数値を入力することを促す。
	System.out.print("差をもとめたい整数値を入力してください。");
	int com1 = stdIn.nextInt();

	//差をもとめたい整数値を入力することを促す。
	System.out.print("差をもとめたい整数値を入力してください。");
	int com2 = stdIn.nextInt();

	//大小を判定するための分岐。
	if(com1 > com2) {
		diff = com1 - com2;		//二値の差を取得。

	} else {
		diff = com2 - com1;		//二値の差を取得。

	}

	//二値の差が10以下かどうかを判定する。
	if(diff <= 10) {
		System.out.println("それらの差は10以下です。");

	} else {
		System.out.println("それらの差は11以上です。");
	}
	stdIn.close();

	}

}
