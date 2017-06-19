/*演習3-2
 * else if ( num == 0)の分岐を追加して動作を確認する。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_02;

import java.util.Scanner;

public class e_03_02 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	//整数値の入力を促す。
	System.out.print("絶対値に変換したい整数値を入力してください。");
	int num = stdIn.nextInt();

	//整数値を絶対値に変換するための分岐。
	if(num < 0) {
		num = -num;	//負の値の時は正の値に変換。
	//演習問題の条件通りにするためあえて0の時の分岐を追加。
	} else if (num == 0) {
		;
	}

	//変換した絶対値を表示。
	System.out.println("絶対値は" + num + "です。");

	stdIn.close();

	}

}
