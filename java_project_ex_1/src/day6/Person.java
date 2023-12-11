package day6;

public class Person {

		String name;
		int age;
		String addr;
		
		//생성자(메소드)
		//오버로딩
		//1.매개변수(파라미터)의 개수가 다르거나
		//2.매개변수(파라미터)의 타입이 다르거나
		//주의:변수명 다르다고 정의 안됨,
		Person(String n, int a){
			name = n;
			age = a;
			
		}
		
		String getName() {
			return name;
		}
		
		
		Person(){
		}
		
		int getAge(){
			return age;
		}
		
		void info() {
			System.out.println("이름은 " + name + ", 나이는 " + age + " 입니다. ");
		}
		
		void setAddr(String addr) {
			this.addr = addr;
		}
}//class
