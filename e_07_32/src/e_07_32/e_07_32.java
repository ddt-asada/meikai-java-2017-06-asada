/*演習7-32
 * ビットを表示する多重定義されたメソッド群を作成。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_32;

public class e_07_32 {

	public static void main(String[] args) {
		byte bbits = 10;	//bit表記を行うbyte型の整数。
		short sbits = 20;	//bit表記を行うshort型の整数。
		int bits = 30;		//bit表記を行うint型の整数。
		long lbits = 40;	//bit表記を行うlong型の整数。

		//多重定義されたメソッド群を呼び出し、返却値を確認する。
		printBits(bbits);
		System.out.println();

		printBits(sbits);
		System.out.println();

		printBits(bits);
		System.out.println();

		printBits(lbits);
		System.out.println();
	}

	//ビット表記を行う多重定義されたメソッド群
	static void printBits(byte x) {
		for(int i = 7; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	}

	//ビット表記を行う多重定義されたメソッド群
	static void printBits(short x) {
		for(int i = 15; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	}


	//ビット表記を行う多重定義されたメソッド群
	static void printBits(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	}

	//ビット表記を行う多重定義されたメソッド群
	static void printBits(long x) {
		for(int i = 63; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	}
}
