
public class Chicken implements Animall {
	
	Roaster roaster;
	
	

	public  Roaster getRoaster() {
		return roaster;
	}

	public  void setRoaster(Roaster roaster) {
		this.roaster = roaster;
	}

	@Override
	public void animalsays() {
		// TODO Auto-generated method stub
		System.out.println("chicken says: “Cluck, cluck”");
	}

	@Override
	public boolean animalAction() {
		// TODO Auto-generated method stub
		System.out.println("A chicken cannot fly");
		return false;
	}
  
}
