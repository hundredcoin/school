package school;

public class NorCalc implements Calc{
	Subject sub = new Subject();
	String grade;
	int score;

	@Override
	public void grade() {
		if (score <= 90) {
			grade = "A";

		} else if (score <= 80 || score < 90) {
			grade = "B";

		} else if (score <= 70 || score < 80) {
			grade = "C";

		} else if (score <= 60 || score < 70) {
			grade = "D";

		} else {
			grade = "F";

		}

	}
}
