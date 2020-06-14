
public abstract class Fish {
	
	public boolean sing(){
		System.out.println("Fish don't sing");
		return false;
	}
	
	public boolean walk(){
		System.out.println("Fish don't walk");
		return false;
	}
	
	public boolean swim(){
		System.out.println("Swim");
		return true;
	}
	
	public abstract void size();
	 
    public abstract void colour();	

}
