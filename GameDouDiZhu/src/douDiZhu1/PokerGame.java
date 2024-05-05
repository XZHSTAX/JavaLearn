package douDiZhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;

public class PokerGame {
	
	static ArrayList<String> list  = new ArrayList<>();
	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	static {
		String[] color = {"♠","♦","♥","♣"};
		String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		
//		for (String n : number) {
//			for (String c : color) {
//				list.add(c + n);
//			} 
//		}
		for (int i = 0; i < number.length; i++) {
			for (String c : color) {
				list.add(c + number[i]);
				hm.put(c + number[i], i+1);
			}
		}
		
		
		list.add("JOCKER");
		list.add("jocker");
		hm.put("JOCKER", 15);
		hm.put("jocker", 14);
		
	}

	public PokerGame() {
		// 洗牌
		Collections.shuffle(list);
		
		ArrayList<String> lord  = new ArrayList<>();
		ArrayList<String> player1  = new ArrayList<>();
		ArrayList<String> player2  = new ArrayList<>();
		ArrayList<String> player3  = new ArrayList<>();
		
		Collections.addAll(lord, list.get(0),list.get(1),list.get(2));
		
		for (int i = 3; i < list.size(); i++) {
			
			switch (i%3) {
			case 0: {player1.add(list.get(i));break;}
			case 1: {player2.add(list.get(i));break;}
			case 2: {player3.add(list.get(i));break;}
			default:
				throw new IllegalArgumentException("Unexpected value: " + i%3);
			}
		}
		// 为牌排序
		
//		MyComparatorCard mcc = new MyComparatorCard();
//		Collections.sort(player1,mcc);
//		Collections.sort(player2,mcc);
//		Collections.sort(player3,mcc);
		
		Collections.sort(player1,(o1,o2) ->hm.get(o1) - hm.get(o2));
		
		
		lookCard("xzh", player1);
		lookCard("ljy", player2);
		lookCard("robot", player3);
		System.out.println(player1.size() + " " +player2.size() + " " +player3.size());
	}
	
	public void lookCard(String playerName,ArrayList<String> card) {
		System.out.print(playerName + ": ");
		card.forEach(s->System.out.print(s+" "));
		System.out.print("\n");
	}
	
	

}
