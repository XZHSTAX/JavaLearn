package exerciseTreeSet;

public class NewStudent implements Comparable<NewStudent>{
	private String name;
	private int age;
	private int scoreChinese;
	private int scoreMath;
	private int scoreEnglish;
	private int score;
	
	
	
	public NewStudent() {
	}
	
	public NewStudent(String name, int age, int scoreChinese, int scoreMath, int scoreEnglish) {
		super();
		this.name = name;
		this.age = age;
		this.scoreChinese = scoreChinese;
		this.scoreMath = scoreMath;
		this.scoreEnglish = scoreEnglish;
		this.score = this.scoreChinese + this.scoreMath + this.scoreEnglish;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreChinese() {
		return scoreChinese;
	}
	public void setScoreChinese(int scoreChinese) {
		this.scoreChinese = scoreChinese;
	}
	public int getScoreMath() {
		return scoreMath;
	}
	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}
	public int getScoreEnglish() {
		return scoreEnglish;
	}
	public void setScoreEnglish(int scoreEnglish) {
		this.scoreEnglish = scoreEnglish;
	}

	@Override
	public String toString() {
		return "NewStudent [name=" + name + ", age=" + age + ", scoreChinese=" + scoreChinese + ", scoreMath="
				+ scoreMath + ", scoreEnglish=" + scoreEnglish + "]";
	}

	@Override
	public int compareTo(NewStudent s) {
		int i = this.score - s.score;
		if(i == 0) {
			i = this.getScoreChinese() - s.getScoreChinese();
			if(i ==0) {
				i = this.getScoreMath() - s.getScoreMath();
				if(i==0) {
					i = this.getScoreEnglish() - s.getScoreEnglish();
					if(i==0) {
						i = this.getAge() - s.getAge();
						if(i==0) {
							i = this.getName().compareTo(s.getName());
						}
					}
				}
			}
		}
		
		return -i;
	}
	
	
	
	
}
