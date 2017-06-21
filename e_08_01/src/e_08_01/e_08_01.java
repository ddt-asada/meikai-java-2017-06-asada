/*演習8-1人間クラスを作成する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_08_01;
import java.util.Scanner;

public class e_08_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String name;	//オブジェクトを生成するための名前。
		int height;		//オブジェクトを生成するための身長。
		double weight;	//オブジェクトを生成するための体重。

		//名前の入力
		System.out.print("あなたの名前は：");
		name = stdIn.nextLine();

		//身長の入力
		System.out.print("身長は：");
		height = stdIn.nextInt();

		//体重の入力
		System.out.print("体重は：");
		weight = stdIn.nextDouble();

		//人間クラスよりオブジェクトを生成する。
		Human personal = new Human(name, height, weight);

		//名前のゲッタを呼び出す。
		System.out.println("名前は" + personal.getName() + "です。");

		//身長のゲッタを呼び出す。
		System.out.println("身長は" + personal.getHeight() + "です。");

		//体重のゲッタを呼び出す。
		System.out.println("体重は" + personal.getWeight() + "です。");

		//BMIを表示する。
		personal.bmi();

		//身長との差を表示する。
		personal.theight();

		stdIn.close();
	}

}
