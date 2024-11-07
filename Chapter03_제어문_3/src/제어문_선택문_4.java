<<<<<<< HEAD
// 중복인 경우 => 10,9 = A  8 => B , 7 => C , 6 => D 나머지 : F
public class 제어문_선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*11); //0~10
		System.out.println("score="+score);
		switch(score) 
		{
		case 10:   // if(score==10 || score==9)
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}

	}

}
=======
// 중복인 경우 => 10,9 = A  8 => B , 7 => C , 6 => D 나머지 : F
public class 제어문_선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*11); //0~10
		System.out.println("score="+score);
		switch(score) 
		{
		case 10:   // if(score==10 || score==9)
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
