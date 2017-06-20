/*演習7-3
 * 三つの整数値の中央値を求めるメソッドをサック生する。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_07_03;
import java.util.Scanner;

public class e_07_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int med1;	//中央値を求めたい整数。
		int med2;	//中央値を求めたい整数。
		int med3;	//中央値を求めたい整数。

		//中央値をもとめたい整数の入力を促す。
		System.out.print("整数値：");
		med1 = stdIn.nextInt();

		//中央値をもとめたい整数の入力を促す。
		System.out.print("整数値：");
		med2 = stdIn.nextInt();

		//中央値をもとめたい整数の入力を促す。
		System.out.print("整数値：");
		med3 = stdIn.nextInt();

		//中央値を求めるメソッドをよびだし、帰ってきた値を表示する。
		System.out.println("中央値は" + med(med1, med2, med3) + "です。");

		stdIn.close();
	}

	//中央値を求めるメソッド。
	static int med(int med1, int med2, int med3) {
		int med;		//求めた中央値を格納するための整数。

		//中央値を求めるための分岐。
		if(med1 >= med2) {
			if(med2 >= med3) {
				med = med2;

			} else if(med1 <= med3) {
				med = med1;

			} else {
				med = med3;
			}

		} else if(med1 > med3) {
			med = med1;

		} else if(med2 > med3) {
			med = med3;

		} else {
			med = med2;
		}

		//求め終わった中央値を返す。
		return med;
	}

}
