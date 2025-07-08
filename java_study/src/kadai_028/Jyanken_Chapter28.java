package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public	String	getMyChoice() { 
		
		   //ユーザーからの入力
		System.out.println("自分のじゃんけんの手を入力しましょう");
		
		Scanner scanner = new Scanner (System.in);
	
	    //ユーザーからの入力をもらう
		String choice  = scanner.nextLine();
		
		 HashMap<String, String> handMap = new HashMap<>();
	        
		    handMap.put("r", "グー");
	        handMap.put("s", "チョキ");
	        handMap.put("p", "パー");
	        
	        if (choice.equals("r")) {
	            System.out.println("グーはrockのrを入力しました");
	        } else if (choice.equals("s")) {
	            System.out.println("チョキはscissorsのsを入力しました");
	        } else if (choice.equals("p")) {
	            System.out.println("パーはpaperのpを入力しました");
	        } 
	        
	        
	        
	        while(scanner.hasNext()) {
	            //改行までの入力を受け取る
	            String input= scanner.nextLine();
	            System.out.println(input);

	         }
	        }
	public	String getRandom() {
		
		 String[] choise = {"r", "s", "p"};
		 
		 int index = (int)(Math.random() * 3); // 0〜2の整数（乱数）を作る
		 return choise[index];
		
		
		
		
		
		
	}
	
}
	
	
	