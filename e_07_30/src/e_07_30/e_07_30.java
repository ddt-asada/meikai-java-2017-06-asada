/*演習7-30
 * 二つの整数値の最小値、三つの整数の最小値、配列の最小要素を求める多重定義されたメソッド群を作成する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_30;
import java.util.Scanner;

public class e_07_30 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int min1;						//最小値を比較したい整数。
		int min2;						//最小値を比較したい整数。
		int min3;						//最小値を比較したい整数。
		int[] minarray = new int[3];	//最小値を比較したい配列。

		//最小値を比較したい整数を入力する。
		System.out.print("整数値：");
		min1 = stdIn.nextInt();

		//最小値を比較したい整数を入力する。
		System.out.print("整数値：");
		min2 = stdIn.nextInt();

		//最小値を比較したい整数を入力する。
		System.out.print("整数値：");
		min3 = stdIn.nextInt();

		//最小値を比較したい配列の要素を入力する。
		for(int i = 0; i < minarray.length; i++) {
			System.out.print("minarray[" + i + "] = ");
			minarray[i] = stdIn.nextInt();
		}

		//多重定義したメソッドを呼び出し、返却値を確認する。
		System.out.println(min1 + "と" + min2 + "の小さい方は" + min(min1, min2) + "です。");
		System.out.println(min1 + "と" + min2 + "と" + min3 +"の小さい方は" + min(min1, min2, min3) + "です。");
		System.out.println("配列minarrayの小さい方は" + min(minarray) + "です。");

		stdIn.close();
	}

	//二値の最小値を求める多重定義されたメソッド
	static int min(int min1, int min2) {
		int tmp = min1;		//最小値を求める際に使用する一時的な置き場。

		//最小値の比較を行う。
		if(tmp > min2) {
			tmp = min2;
		}

		//求めた最小値を返却する。
		return tmp;
	}

	//三値の最小値を求める多重定義されたメソッド
	static int min(int min1, int min2, int min3) {
		int tmp = min1;		//最小値を求める際に使用する一時的な置き場。

		//最小値の比較を行う。
		if(tmp > min2) {
			tmp = min2;
		}

		if(tmp > min3) {
			tmp = min3;
		}

		//求めた最小値を返却する。
		return tmp;
	}

	//配列の最小要素を求める多重定義されたメソッド
	static int min(int[] minarray) {
		int tmp = minarray[0];	//最小値を求める際に使用する一時的な置き場。

		//最小値を求める。
		for(int i = 1; i < minarray.length; i++) {
			if(tmp > minarray[i]) {
				tmp = minarray[i];
			}
		}

		//求めた最小値を返却する。
		return tmp;
	}

}