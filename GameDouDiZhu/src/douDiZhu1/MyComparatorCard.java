package douDiZhu1;

import java.util.Comparator;

public class MyComparatorCard implements Comparator<String>{

	
	
	public MyComparatorCard() {
	}

	@Override
	public int compare(String o1, String o2) {
		// 比较两张牌的大小
		return valueOfCard(o1) - valueOfCard(o2);
	}
	
	// 牌面直接转换成值来比较
	private int valueOfCard(String s) {
		int cardValue = 0;
		char theSecondChar = s.charAt(1);
		if(theSecondChar!='A' && 
				theSecondChar!='J' && 
				theSecondChar!='Q' && 
				theSecondChar!='K' &&
				theSecondChar!='o' &&
				theSecondChar!='O') {  //非花色牌
			if(Character.getNumericValue(theSecondChar) == 2) { // 如果是2 则返回15
				cardValue =  15;
			}
			else if(s.length() >2) { // 如果是10
				cardValue =  10;
			}
			else if(Character.getNumericValue(theSecondChar) != 2) { // 如果是不是2，则返回牌的数值。
				cardValue =  Character.getNumericValue(theSecondChar);
			}
			
		}
		else {// 如果是花色牌
			switch (theSecondChar) {
			case 'J': {cardValue = 11;break;}
			case 'Q': {cardValue = 12;break;}
			case 'K': {cardValue = 13;break;}
			case 'A': {cardValue = 14;break;}
			case 'o': {cardValue = 16;break;}
			case 'O': {cardValue = 17;break;}
			default:
				throw new IllegalArgumentException("Unexpected value: " + theSecondChar);
			}
		}
		
		return cardValue;
	}
	

}
