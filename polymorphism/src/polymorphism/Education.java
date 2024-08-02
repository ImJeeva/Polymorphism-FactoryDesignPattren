package polymorphism;

class EducationalInstrute {

	public void admit() {
		System.out.println("Admit the student.");
	}

	public void exam() {
		System.out.println("Conduct Exam");
	}

	public void trip() {
		System.out.println("Conduct trip");
	}

}

class Schooll extends EducationalInstrute {

	public void exam() {
		System.out.println("School conduct the unit test.");
	}

	public void trip() {
		System.out.println("School conduct the field trip.");
	}
}

class Collegee extends EducationalInstrute {
	public void exam() {
		System.out.println("College conduct the  semester exam.");
	}

	public void trip() {
		System.out.println("College conduct the internship.");
	}
}

class Universityy extends EducationalInstrute {
	public void exam() {
		System.out.println("University conduct the external exam and lab.");
	}

	public void trip() {
		System.out.println("University conduct the internship.");
	}
}

class EducationSystem {
	public static void permit(EducationalInstrute ei) {
		ei.admit();
		ei.exam();
		ei.trip();

		System.out.println();

	}

}

public class Education {

	public static void main(String[] args) {
		Schooll s = new Schooll();
		Collegee c = new Collegee();
		Universityy u = new Universityy();
		
		EducationSystem.permit(s);
		EducationSystem.permit(c);
		EducationSystem.permit(u);

//		educationSystem e = new educationSystem();
//
//		e.permit(s);
//		e.permit(c);
//		e.permit(u);

	}

}
