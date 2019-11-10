package model;

public class Player {

    private static int maxNameLength = 0;
    private String name;

    public Player(String name) {
        this.name = name;
        maxNameLength(name);
    }

    private void maxNameLength(String name) {
        if (maxNameLength < name.length()) {
            maxNameLength = name.length();
        }
    }

    public String getName() {
        return name;
    }

    public static int getMaxNameLength() {
        return maxNameLength;
    }

}
