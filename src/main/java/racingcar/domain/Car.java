package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
	private final String name;
	private int position = 0;
	private static final int CONDITION_FOR_MOVE = 4;

	public Car(String name) {
		this.name = name;
	}

	// 자동차 이동
	public void move() {
		if (Randoms.pickNumberInRange(0, 9) >= CONDITION_FOR_MOVE) {
            position++;
		}
	}
}
