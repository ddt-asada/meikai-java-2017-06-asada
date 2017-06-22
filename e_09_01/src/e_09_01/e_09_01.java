/*演習9-1
 * 人間クラスの配列を生成するプログラムを作成。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_09_01;

public class e_09_01 {

	public static void main(String[] args) {
		//人間クラスの配列を生成する。
		Human[] x = { new Human("浅田　知嗣", 160, 50),
					  new Human("浅田　知嗣", 180, 10)
		};
		
		//それぞれのゲッタを呼び出し中身を確認する。
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = "
								+ x[i].getName() 			//名前のゲッタ。
								+ x[i].getHeight() + "cm"	//身長のゲッタ。
								+ x[i].getWeight() + "kg");	//体重のゲッタ。
		}
	}

}
