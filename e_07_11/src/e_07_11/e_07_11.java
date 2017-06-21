/*演習7-11
 * 整数を左右にシフトした値が、2のべき乗での除算や乗算と等しくなることを確認するプログラム。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_11;
import java.util.Scanner;

public class e_07_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x;		//計算に使う整数。
		int n;		//何ビットシフトするかの選択。
		
		//計算する整数の入力を促す。
		System.out.print("整数：");
		x = stdIn.nextInt();
		
		//何ビットシフトするかを選択。
		System.out.println("何ビットシフトしますか：");
		n = stdIn.nextInt();
		
		//2のべき乗での乗算を求めて表示。
		System.out.println(x + "の2のべき乗での乗算は" + (x * pow(n)));
		
		//2のべき乗での除算を求めて表示。
		System.out.println(x + "の2のべき乗での除算は" + (x / pow(n)));
		
		//2を右にnビットシフトした値を表示。
		System.out.println(x + "を左に" + n + "ビットシフトした値は" + (x << n));
		
		//2を左にnビットシフトした値を表示。
		System.out.println(x + "を右に" + n + "ビットシフトした値は" + (x >> n));
		
		stdIn.close();
	}
	
	//2のべき乗を求める関数。
	static int pow(int n) {
		int pow = 1;
		
		//べき乗をする繰り返し。
		for( ; n > 0; n--) {
			pow *= 2;
		}
		
		//求めた2のべき乗を返却する。
		return pow;
	}

}
