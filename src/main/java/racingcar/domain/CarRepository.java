package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
	private final List<Car> carList = new ArrayList<>();

	public void createCars(String[] name) {
		for (String s : name) {
			carList.add(new Car(s));
		}
	}

	public void moveCars() {
		for (Car car : carList) {
			car.move();
		}
	}

	public List<String> getWinnersName() {
		List<Car> winners = findWinners();
		return winners.stream()
			.map(Car::getName)
			.collect(Collectors.toList());
	}

	public List<Car> findWinners() {
		Collections.sort(carList);
		List<Car> winnerNames = new ArrayList<>();
		if (!carList.isEmpty()) {
			winnerNames.add(carList.get(0));
		}

		for (int i = 1; i < carList.size(); i++) {
			if (carList.get(i).getPosition() >= winnerNames.get(0).getPosition()) {
				winnerNames.add(carList.get(i));
			}
		}

		return winnerNames;
	}
}
