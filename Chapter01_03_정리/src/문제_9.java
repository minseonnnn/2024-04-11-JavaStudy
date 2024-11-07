<<<<<<< HEAD
/*
 *   9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
 *      1~100까지 7의배수, 9의 배수의 합 
 */
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a2=0,a3=0;
		for(int i=0;i<=12;i++)
        {
			// 6 12 
        	if(i%2==0)
        		a2+=i;//2의 배수 합
        	if(i%3==0)
        		a3+=i;//3의 배수 합
        }
		System.out.println("2의 배수 합:"+a2);
		System.out.println("3의 배수 합:"+a3);
		
	    int a4=0,a5=0;
	    for(int i=1;i<=100;i++)
	    {
	    	if(i%7==0)
	    		a4+=i;
	    	if(i%9==0)
	    		a5+=i;
	    }
	    System.out.println("7의 배수 합:"+a4);
		System.out.println("9의 배수 합:"+a5);
	}
	

}
=======
/*
 *   9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
 *      1~100까지 7의배수, 9의 배수의 합 
 */
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a2=0,a3=0;
		for(int i=0;i<=12;i++)
        {
			// 6 12 
        	if(i%2==0)
        		a2+=i;//2의 배수 합
        	if(i%3==0)
        		a3+=i;//3의 배수 합
        }
		System.out.println("2의 배수 합:"+a2);
		System.out.println("3의 배수 합:"+a3);
		
	    int a4=0,a5=0;
	    for(int i=1;i<=100;i++)
	    {
	    	if(i%7==0)
	    		a4+=i;
	    	if(i%9==0)
	    		a5+=i;
	    }
	    System.out.println("7의 배수 합:"+a4);
		System.out.println("9의 배수 합:"+a5);
	}
	

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
