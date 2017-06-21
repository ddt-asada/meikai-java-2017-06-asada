/*演習7-14
 * 整数の連続したビットを1にした値を返すメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_14;
import java.util.Scanner;

public class e_07_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;		//回転したい整数。
		int n;		//変更したいビットの始点。
		int pos;	//変更したいビットの終点。

		//変更したい整数の入力。
		System.out.print("変更したい整数：");
		x = stdIn.nextInt();

		//何ビット目から変更するか。
		System.out.print("何ビット目から：");
		n = stdIn.nextInt();

		//何ビット目まで変更するか
		System.out.print("何ビット目まで：");
		pos = stdIn.nextInt();

		//変更前の整数を表示。
		System.out.println("回転前：" + x);
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(x);
		System.out.println();

		//任意のビット数を0にした値を表示。
		System.out.println("0ビットに変更：" + reset(x, pos, n));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(reset(x, pos, n));
		System.out.println();

		//任意のビットを1にした値を表示。
		System.out.println("1ビットに変更：" + set(x, pos, n));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(set(x, pos, n));
		System.out.println();

		//任意のビットを反転した値を表示。
		System.out.println("反転した値：" + inverse(x, pos, n));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(inverse(x, pos, n));
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

	//整数の任意のビットを0に変更する関数。
	static int reset(int x, int pos, int n) {
		return x & ~(~(~0 << pos)<< n);
	}

	//整数の任意のビットを1に変更する関数。
	static int set(int x, int pos, int n) {
		return x | (~(~0 << pos) << n);
	}

	//整数の任意のビットを反転して返す関数。
	static int inverse(int x, int pos, int n) {
		return x ^ (~(~0 << pos) << n);
	}

}
