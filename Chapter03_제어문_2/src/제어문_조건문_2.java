<<<<<<< HEAD
// 3개의 난수발생 = 1~100 => 최대값,최소값 
// 제어문 => 단일 조건문
public class 제어문_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=(int)(Math.random()*100)+1; //1~100사이의 정수 추출
        int num2=(int)(Math.random()*100)+1;
        int num3=(int)(Math.random()*100)+1;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        int max=num1;
        if(max<num2)
        	max=num2;
        if(max<num3);
            max=num3;
        System.out.println("Max="+max);
        // 최소값 출력
        int min=num1;
        if(min>num2)
        	min=num2;
        if(min>num3)
        	min=num3;
        System.out.println("Min="+min);
	}

}
=======
// 3개의 난수발생 = 1~100 => 최대값,최소값 
// 제어문 => 단일 조건문
public class 제어문_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=(int)(Math.random()*100)+1; //1~100사이의 정수 추출
        int num2=(int)(Math.random()*100)+1;
        int num3=(int)(Math.random()*100)+1;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        int max=num1;
        if(max<num2)
        	max=num2;
        if(max<num3);
            max=num3;
        System.out.println("Max="+max);
        // 최소값 출력
        int min=num1;
        if(min>num2)
        	min=num2;
        if(min>num3)
        	min=num3;
        System.out.println("Min="+min);
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
