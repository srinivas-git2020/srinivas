
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int countAnimalFly=0;
		int countAnimalWalk=0;
		int countAnimalSing=0;
		int countAnimalSwim=0;
		//1 sing() implement
		Bird bird = new Bird();
		bird.walk();
		countAnimalWalk++;
		
		bird.fly();
		countAnimalFly++;
		
		bird.sing();
		countAnimalSing++;
		
		
		Animall anl;
		
		//2 For duck reference
		anl=new Duck();
		//For Chicken reference
		if(anl.animalAction())
			countAnimalSwim++;
		
		anl=new Chicken();
		
		
		anl.animalsays();
		anl.animalAction();
		if(anl.animalAction())
			countAnimalFly++;
		
		// 3 calling rooster related to chicken
		 
		Chicken ck=new Chicken();
		Roaster roa=new Roaster();
		ck.setRoaster(roa);
		ck.getRoaster().animalsays();
		
		//4 parrot
		AnimallParrot parrot;
		 
		Dog dog=new Dog();
		Cat cat=new Cat();
		parrotRooster parrotRT=new parrotRooster();
		 Parrot pt=new Parrot();
		 //Based on the condition we need to pass reference.
		 pt.setAnimalParrot(dog);
		 pt.getAnimalParrot().animalsays();
		 
		 
		 //B Swimming Animal
		 
		Fish fish;
		fish=new Shark();
		
		fish.sing();
		if(fish.sing())
			countAnimalSing++;
		
		if(fish.walk())
			 countAnimalWalk++;
		if(fish.swim())
			countAnimalSwim++;
		
		// B  shark
		
		fish.size();
		fish.colour();
		
		//B ClownFish
		fish=new ClownFish();
		
		fish.size();
		fish.colour();
		
		//dolphin
		Dolphins dh=new Dolphins();
		dh.setFish(fish);
		dh.getFish().swim();
		if(dh.getFish().swim())
		countAnimalSwim++;
		
		//D Butter Fly
		ButterCater buca=new ButterFly();
		if(buca.fly())
			countAnimalFly++;
		buca.sound();
		
		ButterFly bf=new ButterFly();
		bf.transform();
		if(buca.fly())
			countAnimalFly++;
		if(buca.walk())
			 countAnimalWalk++;
		buca.sound();
		
		
		System.out.println("how many of these animals can fly::"+countAnimalFly);
		System.out.println("how many of these animals can walk::"+countAnimalWalk);
		System.out.println("how many of these animals can sing::"+countAnimalSing);
		System.out.println("how many of these animals can swim::"+countAnimalSwim);
		
	
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
       
	}

}
