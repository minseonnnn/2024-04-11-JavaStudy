/*
 *   1~10까지 합을 구하는 메소드를 구현하시오
 */
// 리턴형(O) 매개변수(X)
public class 문제_2 {
	/*static int aaa()
	{
		return 10.5;
	}*/
	static int b()
    {
		int sum=0;
    	for(int i=1;i<=10;i++)
    	{
    		sum+=i;
    		
    	}
    	return sum; // 값 = 리턴형에 사용되는 데이터형이 동일
    	// 특별한 경우에는 return 값이 작을 수 있다. 
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리턴형이 있는 경우 => 결과값을 받는다
		int sum=b(); // 메소드 호출
		System.out.println("sum="+sum);
	}

}
