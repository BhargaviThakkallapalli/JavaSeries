package oop_abstract;

public abstract class Page {

	//main limitation: cannot create the object of abs class
	//we can have abstract + non abs methods in abs class
	//can we create the object of abs class?
	//Ans: no
	//but this will called when we create the object of child class
	//hidden default const..
	
	//in abstract class:
	//1. No (zero)abs ... method --- yes -- 0% abstraction
	//2. only abs ... method --- yes -- 100% abstraction
	//3. abs + non abs methods -- yes -- partial abstraction
	
	//Interface:
	//100% ABSTRACTION
	
	
	public Page() 
	{
		System.out.println("Page --- default ...const");
	}
	public Page(int i)
	{
		System.out.println("Page...const..." +i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public void timeOut()
	{
		System.out.println("page -- time out : 20 secs");
	}
    public final void displayLogo() 
    {
    System.out.println("page -- displayLogo");	
    }

	
	
	
}
