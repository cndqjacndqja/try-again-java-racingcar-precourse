package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
	private final List<Car> carList = new ArrayList<>();

	public void createCars(String[] name) {
		for (String s : name) {
			carList.add(new Car(s));
		}
	}

	public void moveCarsForNumber(int number) {
		for (int i = 0; i < number; i++) {
			moveCars();
		}
	}

	private void moveCars() {
		for (Car car: carList) {
			car.move();
		}
	}
}
