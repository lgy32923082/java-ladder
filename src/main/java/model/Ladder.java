package model;

public class Ladder {

    private int ladderHeight = 0;
    private int ladderRowLength = 0;

    public Ladder(int height, int rowLength) {
        ladderHeight = height;
        ladderRowLength = rowLength;
    }

    public int getLadderHeight() {
        return ladderHeight;
    }

    public int getLadderRowLength() {
        return ladderRowLength;
    }
}
