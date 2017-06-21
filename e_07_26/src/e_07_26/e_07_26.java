/*演習7-26
 * 配列の任意のインデックスに任意の整数を挿入した配列を返却するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_26;
import java.util.Scanner;

public class e_07_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//配列の要素数。
		int insidx;	//挿入したい場所。
		int insnum;	//挿入したい値。
		
		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		num =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[num];

		//配列の全要素に値を入れる。
		for(int i = 0; i < num; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//挿入したいインデックス。
		System.out.print("挿入したいインデックス：");
		insidx = stdIn.nextInt();
		
		//挿入したい値を入力。
		System.out.print("挿入したい値：");
		insnum= stdIn.nextInt();

		//配列から任意の箇所に値を挿入した配列を返却するメソッドを呼び出す。
		int[] insarray = arrayInsOf(array, insidx, insnum);

		//任意の値を挿入した配列を表示する。
		System.out.println("値を挿入した配列を表示します。");
		for(int i = 0; i < insarray.length; i++) {
			System.out.println("insarray[" + i + "] = " + insarray[i]);
		}

		stdIn.close();
	}
	
	//任意の値を挿入した配列を返却するメソッド。
	static int[] arrayInsOf(int[] array, int insidx, int insnum) {
		//挿入した後の配列を格納するための配列を生成。
		int insarray[] = new int[array.length + 1];
		
		//前半部分の値をコピーしていく。
		for(int i = 0; i < insidx; i++) {
			insarray[i] = array[i];
		}
		
		//値を挿入する。
		insarray[insidx] = insnum;
		
		//後半部分をコピーしていく。
		for(int i = insidx; i < array.length; i++) {
			insarray[i + 1] = array[i];
		}
		
		//生成された配列を返却する。
		return insarray;
		
	}

}
