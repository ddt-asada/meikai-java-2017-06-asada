/*演習14-2
 * 着せ替え可能なロボット型ペットクラスを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_02;

public interface Skinnable {
	int BLACK = 0;		//黒
	int RED = 1;		//赤
	int GREEN = 2;		//緑
	int BLUE = 3;		//青
	int LEOPARD = 4;	//ヒョウ柄

	//スキン変更
	void changeSkin(int skin);
}
