
public class ButterFly implements ButterCater{

	 ButterCater state=new ButterState();
	
	public void transform(){
		state=new CatpSate();
	}
	
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return state.fly();
	}

	@Override
	public boolean sound() {
		// TODO Auto-generated method stub
		return state.sound();
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return state.walk();
	}
	
	private class ButterState implements ButterCater{

		@Override
		public boolean fly() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean sound() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean walk() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
	private class CatpSate implements ButterCater{

		@Override
		public boolean fly() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean sound() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean walk() {
			// TODO Auto-generated method stub
			return true;
		}
		
	}

}
