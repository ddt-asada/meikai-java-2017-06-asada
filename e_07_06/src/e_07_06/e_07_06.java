/*演習7-6
 * 読み込んだ月に応じて季節を表示するメソッド。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_07_06;
import java.util.Scanner;

public class e_07_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int month;		//季節を確かめたい季節を格納する整数。
		
		//季節を判定したい月の入力層流す。
		System.out.print("月を入力してください：");
		month = stdIn.nextInt();
		
		//季節を表示するメソッドに月を渡す。
		printseason(month);
	
	stdIn.close();
	}
	
	static void printseason(int month) {
		//季節を表示する分岐。
		switch(month) {
			case 12:
			case 1:
			case 2:	System.out.println("それは冬です。");	break;
			case 3:
			case 4:
			case 5:	System.out.println("それは春です。");	break;
			case 6:
			case 7:
			case 8:	System.out.println("それは夏です。");	break;
			case 9:
			case 10:
			case 11:System.out.println("それは秋です。");	break;
			default:
		}	
	}

}