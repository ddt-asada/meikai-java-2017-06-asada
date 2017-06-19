/*演習4－20
 * 記号文字を並べてn段の正方形を表示する。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_04_20;
import java.util.Scanner;

public class e_04_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int square = 0;	//何段のピラミッドを作るのかを入力する整数。
		
		//何段の正方形を作るのかを入力する。
		System.out.print("何段の正方形をつくりますか。");
		square = stdIn.nextInt();
		
		//正方形を作る繰り返し。
		//縦方向の描写の繰り返し。
		for(int i = 0; i < square; i++) {
			//横方向の描写の繰り返し。
			for(int j = 0; j < square; j++) {
				System.out.print('*');
				
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
