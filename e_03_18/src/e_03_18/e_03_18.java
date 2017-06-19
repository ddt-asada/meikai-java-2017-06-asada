/*演習3-18
 * 月を整数値として読み込んで、それに対応する季節を表示するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_18;
import java.util.Scanner;

public class e_03_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//月の入力を促す。
		System.out.print("月を入力してください。");
		int month = stdIn.nextInt();	//月を読み込む。

		//入力された月に応じて季節を表示。
		switch(month) {
		case 12:
		case 1:
		case 2:		System.out.println("冬");	break;
		case 3:
		case 4:
		case 5:		System.out.println("春");	break;
		case 6:
		case 7:
		case 8:		System.out.println("夏");	break;
		case 9:
		case 10:
		case 11:	System.out.println("秋");	break;
		default :	System.out.println("不正な月が入力されました。");	break;
		}

		stdIn.close();
	}
}
