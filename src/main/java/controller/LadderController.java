package controller;

import model.Ladder;
import model.Line;
import model.Player;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LadderController {
    private Ladder ladder;
    private List<Player> players;
    private List<Line> playersLine;

    public LadderController() {
        players = new ArrayList<>();
        playersLine = new ArrayList<>();
    }

    public void run() {
        addPlayer();
        createLadderInfo();
        addPlayersLine();
        OutputView.showResult();
        OutputView.showPlayers(players);
        ladderHeightControl();
    }

    private void createLadderInfo() {
        ladder = new Ladder(InputView.inputLadderHeight(), Player.getMaxNameLength());
    }

    private void addPlayer() {
        for (String name : InputView.inputPlayers()) {
            players.add(new Player(name));
        }
    }

    private void addPlayersLine() {
        for (int i = 0; i < ladder.getLadderHeight(); i++) {
            Line line = new Line(players);
            playersLine.add(line);
        }
    }

    private void ladderHeightControl() {
        for (int heightIndex = 0; heightIndex < ladder.getLadderHeight(); heightIndex++) {
            ladderRowControl(playersLine, heightIndex);
        }
    }

    private void ladderRowControl(List<Line> playersLine, int heightIndex) {
        OutputView.verticalLine();
        for (int rowIndex = 0; rowIndex < Line.getCountOfPerson()-1; rowIndex++) {
            OutputView.ladderPrint(playersLine, ladder.getLadderRowLength(), rowIndex, heightIndex);
        }
        OutputView.enter();
    }

}
