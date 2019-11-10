package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private List<Boolean> points;
    private static int countOfPerson;

    public Line(List<Player> playerInfo) {
        points = new ArrayList<>();
        countOfPerson = playerInfo.size();
        addValueRepeat();
    }

    public static int getCountOfPerson() {
        return countOfPerson;
    }

    public List<Boolean> getPoints() {
        return points;
    }

    private void addValueRepeat() {
        for (int i = 0; i < countOfPerson - 1; i++) {
            addValue(i);
        }
    }

    private void addValue(int index) {
        boolean value = createRandomValue();
        if (index != 0 && points.get(index - 1)) {
            value = false;
        }
        points.add(value);
    }

    private boolean createRandomValue() {
        return new Random().nextBoolean();
    }
}
