/*演習4‐24
 * 整数値を素数かどうかを判定するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_24;
import java.util.Scanner;

public class e_04_24 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int prime;	//素数かどうかを判定したい整数を入力するための変数。

		//素数をもとめたい整数の入力を促す。
		System.out.print("素数かどうかを判定したい整数値を入力してください。");
		prime = stdIn.nextInt();

		//素数を求めるための繰り返し。
		for(int i = 2; i <= prime; i++) {

			//素数かどうかを判定した分岐。
			if(i == prime) {
				System.out.println("それは素数です。");

			} else if(prime % i ==0) {
				System.out.println("素数ではありません。");
				break;

			}
		}
		stdIn.close();
	}

}
