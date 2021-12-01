package racingcar.view;

import java.util.Arrays;
import java.util.HashSet;

import camp.nextstep.edu.missionutils.Console;

//- [ ] 자동차 이름 입력
public class InputView {
	private static final int NAME_DISTANCE = 5;

	public static String[] inputCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return splitCarNames(Console.readLine());
	}

	private static String[] splitCarNames(String input) {
		String[] names = input.split(",");
		for (String name : names) {
			validateNameFormat(name);
		}
		validateDuplicateNames(names);
		return names;
	}

	private static void validateNameFormat(String name) {
		if (name.length() > NAME_DISTANCE) {
			throw new IllegalArgumentException("자동차 이름이 5글자를 초과합니다.");
		}
	}

	private static void validateDuplicateNames(String[] names) {
		HashSet<String> tempSet = new HashSet<>(Arrays.asList(names));
		if (names.length != tempSet.size()) {
			throw new IllegalArgumentException("중복된 이름이 존재합니다.");
		}
	}
}
