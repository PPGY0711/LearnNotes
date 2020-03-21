package day09;

public abstract class Animal {
	public abstract void test(); //只要类中有一个抽象的方法，那么这个就必须是一个抽象类
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
	
	public abstract void test();//只要类中有一个抽象的方法，那么这个就必须是一个抽象类，抽象类也可以作为子类存在
}