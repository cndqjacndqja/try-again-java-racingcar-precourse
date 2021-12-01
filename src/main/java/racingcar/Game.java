package racingcar;

import racingcar.domain.CarRepository;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Game {
	public void run() {
		String[] carNames = InputView.inputCarNames();
		CarRepository carRepository = new CarRepository();
		carRepository.createCars(carNames);
		int numberOfCarsMove = InputView.inputNumberOfCarsMoving();
		System.out.println("실행 결과");
		for (int i = 0; i < numberOfCarsMove; i++) {
			carRepository.moveCars();
			OutputView.printResultOfCarStatus(carRepository.getCarList());
		}
	}
}
