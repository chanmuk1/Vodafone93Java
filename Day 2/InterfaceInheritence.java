interface i11{void f1();}
interface i2{void f2();}

interface i3 extends i11,i2
{void f3();}

class A11 implements i11,i2
{
	@Override
	public void f2() {}

	@Override
	public void f1() {}
}


class A10 implements i3
{
	@Override
	public void f1() {}

	@Override
	public void f2() {}

	@Override
	public void f3() {}
}



public class InterfaceInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
