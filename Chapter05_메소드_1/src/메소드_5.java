<<<<<<< HEAD
/*
 *   1~100까지 사이의 2의 배수의 합 
 *                 3의 배수의 합
 *                 4 , 5, 6, 7, 8, 9
 */
public class 메소드_5 {
    /*static int display2()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%2==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display3()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%3==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display4()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%4==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display5()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%5==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display6()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%6==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display7()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%7==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display8()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%8==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display9()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%9==0)
    			sum+=i;
    	}
    	return sum;
    }*/
	// 다른 클래스에서 사용이 가능 => 재사용 => 조립식 
	// 게시판 (CRUD) => 읽기 , 수정 , 추가 , 삭제 => 3000줄 => 게시판 5개이상 
	static int display(int num)
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%num==0)
				sum+=i;
		}
		return sum;
	}
	// 메소드 => 반복제어 => 소스를 간결하게 만들 수 있다
	// 절차적언어 => 순차적 => 재사용을 할 수 없다
	// 한번 사용하고 버린다 => main안에 코딩하면 절차적언어 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=9;i++)
		{
			System.out.println("1~100까지 사이의 "+i+"배수의 합:"+display(i));
		}
		/*System.out.println("1~100까지 사이의 2의배수의 합:"+display2());
		System.out.println("1~100까지 사이의 3의배수의 합:"+display3());
		System.out.println("1~100까지 사이의 4의배수의 합:"+display4());
		System.out.println("1~100까지 사이의 5의배수의 합:"+display5());
		System.out.println("1~100까지 사이의 6의배수의 합:"+display6());
		System.out.println("1~100까지 사이의 7의배수의 합:"+display7());
		System.out.println("1~100까지 사이의 8의배수의 합:"+display8());
		System.out.println("1~100까지 사이의 9의배수의 합:"+display9());*/

	}

}
=======
/*
 *   1~100까지 사이의 2의 배수의 합 
 *                 3의 배수의 합
 *                 4 , 5, 6, 7, 8, 9
 */
public class 메소드_5 {
    /*static int display2()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%2==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display3()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%3==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display4()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%4==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display5()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%5==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display6()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%6==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display7()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%7==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display8()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%8==0)
    			sum+=i;
    	}
    	return sum;
    }
    static int display9()
    {
    	int sum=0;
    	for(int i=1;i<=100;i++)
    	{
    		if(i%9==0)
    			sum+=i;
    	}
    	return sum;
    }*/
	// 다른 클래스에서 사용이 가능 => 재사용 => 조립식 
	// 게시판 (CRUD) => 읽기 , 수정 , 추가 , 삭제 => 3000줄 => 게시판 5개이상 
	static int display(int num)
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%num==0)
				sum+=i;
		}
		return sum;
	}
	// 메소드 => 반복제어 => 소스를 간결하게 만들 수 있다
	// 절차적언어 => 순차적 => 재사용을 할 수 없다
	// 한번 사용하고 버린다 => main안에 코딩하면 절차적언어 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=9;i++)
		{
			System.out.println("1~100까지 사이의 "+i+"배수의 합:"+display(i));
		}
		/*System.out.println("1~100까지 사이의 2의배수의 합:"+display2());
		System.out.println("1~100까지 사이의 3의배수의 합:"+display3());
		System.out.println("1~100까지 사이의 4의배수의 합:"+display4());
		System.out.println("1~100까지 사이의 5의배수의 합:"+display5());
		System.out.println("1~100까지 사이의 6의배수의 합:"+display6());
		System.out.println("1~100까지 사이의 7의배수의 합:"+display7());
		System.out.println("1~100까지 사이의 8의배수의 합:"+display8());
		System.out.println("1~100까지 사이의 9의배수의 합:"+display9());*/

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
