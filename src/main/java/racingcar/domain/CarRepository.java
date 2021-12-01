package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
	private List<Car> carList = new ArrayList<>();

	// 입력받은 이름에 따라 자동차 생성
	public void createCars(String[] name) {
		for (String s : name) {
			carList.add(new Car(s));
		}
	}
}
