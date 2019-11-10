package view;

import model.Line;
import model.Player;

import java.util.List;

public class OutputView {

    private static final String HORIZON_LINE = "-";
    private static final char VERTICAL_LINE = '|';
    private static final String SPACE = " ";
    private static final String TAB = "\t";

    public static void showResult() {
        System.out.println("실행결과");
    }

    public static void showPlayers(List<Player> players) {
        for (Player name : players) {
            System.out.print(name.getName() + TAB);
        }
        System.out.println();
    }

    public static void verticalLine() {
        System.out.print(VERTICAL_LINE);
    }

    public static void ladderPrint(List<Line> playersLine, int rowLength, int index, int heightIndex) {
        String outputChar = SPACE;
        if (playersLine.get(heightIndex).getPoints().get(index)) {
            outputChar = HORIZON_LINE;
        }
        for (int i = 0; i < rowLength; i++) {
            System.out.print(outputChar);
        }
        verticalLine();
    }

    public static void enter() {
        System.out.println();
    }
}
