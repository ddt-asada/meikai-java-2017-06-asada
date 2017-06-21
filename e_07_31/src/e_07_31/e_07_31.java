/*演習7-31
 * 各データ型の絶対値を求める多重定義されたメソッドを作成する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_31;
import java.util.Scanner;

public class e_07_31 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int abs = -10;		//絶対値を求める整数。
		long labs = -20;	//絶対値を求めるlong型の整数。
		float fabs = -30;	//絶対値を求めるfloat型の実数。
		double dabs = -40;	//絶対値を求めるdouble型の実数。

		//多重定義されたメソッドを呼び出し、それぞれの返却値を確認する。
		System.out.println("int型の絶対値：" + absolute(abs));
		System.out.println("long型の絶対値：" + absolute(labs));
		System.out.println("float型の絶対値：" + absolute(fabs));
		System.out.println("double型の絶対値：" + absolute(dabs));

		stdIn.close();
	}

	//絶対値を求める多重定義されたメソッド
	static int absolute(int x) {
		if(x < 0) {
			x = -x;
		}

		return x;
	}

	//絶対値を求める多重定義されたメソッド
	static long absolute(long x) {
		if(x < 0) {
			x = -x;
		}

		return x;
	}

	//絶対値を求める多重定義されたメソッド
	static float absolute(float x) {
		if(x < 0) {
			x = -x;
		}

		return x;
	}

	//絶対値を求める多重定義されたメソッド
	static double absolute(double x) {
		if(x < 0) {
			x = -x;
		}

		return x;
	}

}
