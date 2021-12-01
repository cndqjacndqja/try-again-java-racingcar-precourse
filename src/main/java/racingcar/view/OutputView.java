package racingcar.view;

import java.util.List;

import racingcar.domain.Car;

public class OutputView {

	public static void printResultOfCarStatus(List<Car> carList) {
		for (Car car : carList) {
			System.out.println(car.getName() + " : " + getCarPositionString(car));
		}
		System.out.println();
	}

	public static String getCarPositionString(Car car) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < car.getPosition(); i++) {
			sb.append("-");
		}
		return sb.toString();
	}

}
