<<<<<<< HEAD
package com.sist.main;
class AA
{
	void aaa() {}
	private void bbb() {}
	protected void ccc() {}
	public void ddd() {}
}
class BB extends AA
{

	private void bbb()
	{
		
	}
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		super.aaa();
	}

	@Override
	protected void ccc() {
		// TODO Auto-generated method stub
		super.ccc();
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		super.ddd();
	}
	// 변경해서 사용 => 오버라이딩
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new BB();
        BB b=(BB)a;
	}

}
=======
package com.sist.main;
class AA
{
	void aaa() {}
	private void bbb() {}
	protected void ccc() {}
	public void ddd() {}
}
class BB extends AA
{

	private void bbb()
	{
		
	}
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		super.aaa();
	}

	@Override
	protected void ccc() {
		// TODO Auto-generated method stub
		super.ccc();
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		super.ddd();
	}
	// 변경해서 사용 => 오버라이딩
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new BB();
        BB b=(BB)a;
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
