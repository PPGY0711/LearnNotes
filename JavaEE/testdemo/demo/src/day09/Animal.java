package day09;

public abstract class Animal {
	public abstract void test(); //ֻҪ������һ������ķ�������ô����ͱ�����һ��������
	public abstract void move();
}

class Dog extends Animal{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		System.out.println("Dog runs");
		
	}
	
}

class Fish extends Animal{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fish swims");
	}
	
}

abstract class Bird extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bird flies");
	}
	
	public abstract void test();//ֻҪ������һ������ķ�������ô����ͱ�����һ�������࣬������Ҳ������Ϊ�������
}