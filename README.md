# srinivas

1. Can you implement the sing() method for the bird?
I have implemented sing() method in the Bird class along with fly().
I have unit tested this by calling the sing() method in the main() method.

2.Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
Created an Animall interface which has 2 abstract methods animalSays() and animalAction(). Created two classes Duck and Chicken which implements the Animal interface and override those two methods.

3.Now how would you model a rooster?
Chicken class has a Rooster class by having composition relation ship between them.Rooster class has its own animalsays() method implemented.

4.Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
Created an abstract class AnimalParrot which implements Animall interface which contain one concrete method called Action() which returns a boolean value false. Three other classes Dog, Cat and ParrotRooster which has its own implementation for the says() method.
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
Create a new class Duck which extends AnimalParrot and provides its own say() implementation.


B. Model fish as well as other swimming animals
An abstract class Fish with three concrete methods sing(), walk() and swim() and two abstract methods size() and color() are created.
Two classes Shark and ClownFish which extends the abstract class Fish and override the methods size(), color(). Shark class has an extra method called eat() and ClownFish class has an extra method called jokes().
A new class Dolphins is created which contain Fish class as child class and maintain a composition between them.


D. Model animals that change their behaviour over time.
An interface ButterCater is created with methods fly(), sound() and walk() all return a boolean value.
A Class ButterFly is implementing the ButterCater interface which provides implementation for the above three methods and it also contain an extra method transform(). This class also contain two ineerclasses ButterState and CaptState implementing ButterCater interface and provides it's own implementation for the methods fly(), sound(), walk() by using the transform() method of their outer class.

E. Counting animals

In the Solution class main() method initialize all the count variables, based on the return type of the methods we increment these counters to find out how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?











