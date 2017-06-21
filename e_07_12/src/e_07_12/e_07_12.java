/*演習7-12
 * 整数をnビット回転した値を返すメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_12;
import java.util.Scanner;

public class e_07_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;		//回転したい整数。
		int n;		//何ビットシフトするか。

		//回転したい整数の入力。
		System.out.print("回転したい整数：");
		x = stdIn.nextInt();

		//何ビットシフトするか。
		System.out.print("何ビットシフト：");
		n = stdIn.nextInt();
		System.out.println();

		//回転前の整数を表示。
		System.out.println("回転前：" + x);
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(x);
		System.out.println();

		//右回転させた整数を表示。
		System.out.println("右回転：" + rRotate(x, n));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(rRotate(x, n));
		System.out.println();


		//左回転させた整数を表示。
		System.out.println("左回転：" + lRotate(x, n));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(lRotate(x, n));
		System.out.println();

		stdIn.close();
	}

	//整数のビット構成を表示する関数。
	static void printBits(int x) {

		//ビット構成を表示。
		for(int i= 31; i >= 0; i--) {
			System.out.print(((x >> i & 1) == 1) ?'1' : '0');
		}
	}

	//整数を右にｎビット回転させる関数。
	static int rRotate(int x, int n) {
		//受け取った整数を右回転させて返却する。
		return (x >> n) | (x << (32 - n));

	}

	//整数を左にnビット回転させる関数。
	static int lRotate(int x, int n) {
		//受け取った整数を左回転させて返却する。
		return (x << n) | (x >> (32 - n));
	}

}
