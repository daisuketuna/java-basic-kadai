package kadai_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter26 {
	//フィールド（内部データ）
	public String myHands; // 自分のじゃんけんの手
	public String opponentHands; //相手のじゃんけんの手
	
	Scanner scanner = new Scanner(System.in);
	
	ArrayList<String> opponentHandsList = new ArrayList<String>();
	
	HashMap<String,String> jyankenMap = new HashMap<String,String>();
	
	
	
	//自分のじゃんけんの手を決める
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperはpを入力しましょう");
		
		
		//入力内容をmyHandsに格納		
		this.myHands = scanner.next();
		
		//入力内容の精査		
		if (this.myHands.equals( "r")) {
		
			return myHands;
			
		}else if(this.myHands.equals("s")){
			
			return myHands;
			
		}else if(this.myHands.equals("p")) {
			
			return myHands;
			
		}else {
			System.out.println(myHands + "は正しくありません");
			
			return getMyChoice();
		}
	}
	
	public String getRandom() {
		opponentHandsList.add("r");
		opponentHandsList.add("s");
		opponentHandsList.add("p");
		int result = (int) Math.floor(Math.random()*3);
		
		this.opponentHands = opponentHandsList.get(result);
		
		return this.opponentHands;
	}
	
	public void playGame() {
		jyankenMap.put("r","グー");
		jyankenMap.put("s","チョキ");
		jyankenMap.put("p","パー");
		
		String myResult = jyankenMap.get(this.myHands);
		String yourResult = jyankenMap.get(this.opponentHands);
		
		System.out.println("自分の手は"+ myResult +"," + "相手の手は" + yourResult);
		
		if(myResult.equals(yourResult)) {
			
		
			System.out.println("あいこです");
			
		}else if(myResult.equals("グー") && yourResult.equals("チョキ")) {
			
		
			System.out.println("自分の勝ちです");
		
		}else if(myResult.equals("グー") && yourResult.equals("パー")) {
			
			System.out.println("自分の負けです");
			
		}else if(myResult.equals("チョキ") && yourResult.equals("グー")) {
			
			System.out.println("自分の負けです");
			
		}else if(myResult.equals("チョキ") && yourResult.equals("パー")) {
			
			System.out.println("自分の勝ちです");
		}else if(myResult.equals("パー") && yourResult.equals("グー")) {
			
			System.out.println("自分の勝ちです");
		}else {
			
			System.out.println("自分の負けです");
		}
			
}
}
	
	

