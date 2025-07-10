package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {

		//じゃんけん説明
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはrockのrを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		//ユーザーからの入力をもらう
		Scanner scanner = new Scanner(System.in);

		String choice = ""; //変数choiceを作り""に代入の作成、代入を同時に行う

		while (true) { // 無限ループ。正しい入力"r""s""p"が来たらbreakで抜ける

			//こーボード入力をchoiceを一度だけ使える
			choice = scanner.nextLine();

			//入力文字のチェック
			if (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
				System.out.println("無効な入力です。もう一度入力してください。");
				/* 無効な入力の場合はループを続ける !は"r""s""p"じゃない場合true
				表記で次に進む&&は●●と●●とandという意味
				この場合"r""s""p"じゃない場合先に進んでシステムアウトの無効な入力と表示 */
				continue; //if前に戻ってやり直し
			} else {
				// trueの場合("r""s""p")次に進む
				break;//ループ終了
			}
		}
		// スキャナーを閉じる　※クローズ、リターンはループの外
		scanner.close();//syutem.in終了　これ以降キーボード入力は受け付けない
		// 入力された手（文字）を返す
		return choice; //戻り値を返す
	}

	/*HashMap<String, String> handMap = new HashMap<>();
	
	handMap.put("r", "グー");
	handMap.put("s", "チョキ");
	handMap.put("p", "パー");
	
	
	if (choice.equals("r")) {
		System.out.println("グーはrockのrを入力しました");
	} else if (choice.equals("s")) {
		System.out.println("チョキはscissorsのsを入力しました");
	} else if (choice.equals("p")) {
		System.out.println("パーはpaperのpを入力しました");
	}*/

	public String getRandom() {

		String[] hands = { "r", "s", "p" };//hands箱にr.s.ｐを入れる

		int random = (int) Math.floor(Math.random() * 3);

		/*Mathrendomで一つの中からランダムで選ぶ*3で３をかけて３つのなかからランダムに選ぶ
		 math.floorで小数点を切り下げ
		 */
		return hands[random];//ランダムで１つ返す

	}

	public void playGame(String MyChoice, String Random) {

		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");

		System.out.println(MyChoice); //MyChice出力
		System.out.println(Random);

		if (MyChoice.equals(Random)) //お互い等しい
			System.out.println("あいこです");

		else if ((MyChoice.equals("r") && Random.equals("s")) ||
				(MyChoice.equals("s") && Random.equals("p")) ||
				(MyChoice.equals("p") && Random.equals("r")))

			System.out.println("自分の勝ちです");

		else  //上記のどれにも当てはまらない
			System.out.println("自分の負けです");

		/*if (choise.equals("グー")) {
			System.out.println("あいこです");
			System.out.println("自分の勝ちです");
			System.out.println("自分の負けです");
		} else if (choise.equals("チョキ")) {
			System.out.println("あいこです");
			System.out.println("自分の勝ちです");
			System.out.println("自分の負けです");
		} else if (choise.equals("パー")) {
			System.out.println("あいこです");
			System.out.println("自分の勝ちです");
			System.out.println("自分の負けです");
		}*/

	}

}
