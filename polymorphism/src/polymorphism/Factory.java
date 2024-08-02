package polymorphism;

import java.util.Scanner;

abstract class Bird {
	abstract public void eat();

	abstract public void fly();

}

abstract class Eagle extends Bird {
	abstract public void eat();

	public void fly() {
		System.out.println("This Eagle fly at greate height.");
	}
}

abstract class Sperrow extends Bird {
	abstract public void eat();

	public void fly() {
		System.out.println("This sparrow fly at medium height.");
	}
}

class SerpentEagle extends Eagle {
	public void eat() {
		System.out.println("Serpent Eagele eat snakes in mountain area.");
	}

}

class GoldenEagle extends Eagle {
	public void eat() {
		System.out.println("Golden eagle eat fish in ocean areas.");
	}
}

class VegSperrow extends Sperrow {
	public void eat() {
		System.out.println("Veg Sperrow eat the frits.");
	}
}

class NonvegSperrow extends Sperrow {
	public void eat() {
		System.out.println("Nonveg sperrow eat the small invrtebrate animals.");
	}
}

class fly {
	public static Bird flying(String input) {
		if (input.equalsIgnoreCase("Serpent Eagle")) {
			return new SerpentEagle();
		} else if (input.equalsIgnoreCase("Golden Eagle")) {
			return new GoldenEagle();
		} else if (input.equalsIgnoreCase("veg sperrow")) {
			return new VegSperrow();
		} else if (input.equalsIgnoreCase("nonveg Sperrow")) {
			return new NonvegSperrow();
		} else {
			System.out.println("Input MisMatch!!!");
			return null;

		}

	}
}

public class Factory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please enter the bird name \n ->Serpent Eagle, \n ->Golden Eagle, \n ->Veg Sperrow, \n ->Nonveg Sperrow. ");
		String input = sc.nextLine();

		Bird ref = fly.flying(input);

		ref.eat();
		ref.fly();

	}

}
