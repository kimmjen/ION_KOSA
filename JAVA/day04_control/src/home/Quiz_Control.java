package home;
/*
문제] 1~100 중에서 3의 배수의 개수와 합을 구하세요.
for, if, while
*/
public class Quiz_Control {
	
	public static void main(String[] args) {
		int count =0;
		int sum = 0;
		for(int i =1;i<=100;i++) {
			if(i%3==0) {
				count ++;
				sum +=i;
			}//if end
				
		}//for end
		
		System.out.println("3의 배수의 개수는 "+count+"이고, 합은 "+sum+"입니다.");
		
	}
}