package main;

public class LevelLayout {
    public int [][] level;
    private int [][] level20 = {
            {5, 5, 5, 2, 3, 0, 0, 1, 1, 0, 0, 2, 3, 2, 2, 2},
            {5, 5, 3, 3, 2, 0, 0, 1, 1, 0, 0, 3, 2, 3, 3, 3},
            {5, 5, 2, 2, 3, 0, 0, 1, 1, 0, 0, 2, 3, 2, 2, 2},
            {3, 3, 3, 3, 2, 0, 0, 1, 1, 0, 0, 0, 2, 3, 3, 3},
            {2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 0, 0, 0, 2, 2, 2},
            {3, 3, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 3},
            {2, 2, 0, 0, 0, 1, 1, 1, 1, 0, 4, 4, 0, 0, 0, 2},
            {3, 3, 3, 0, 0, 1, 1, 1, 1, 0, 4, 4, 4, 0, 0, 3},
            {2, 2, 2, 3, 0, 1, 1, 1, 1, 0, 0, 4, 4, 0, 0, 2},
            {3, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3},
            {2, 2, 2, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 2, 2, 2},
            {3, 3, 3, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3},
    };
    private int [][] level10 = {
            {3, 3, 2, 3, 3, 0, 0, 1, 1, 0, 0, 3, 3, 2, 2, 2},
            {2, 2, 3, 2, 2, 3, 0, 1, 1, 0, 3, 2, 2, 3, 3, 3},
            {3, 3, 2, 3, 3, 2, 0, 1, 1, 0, 2, 3, 3, 2, 2, 2},
            {2, 2, 3, 2, 2, 0, 0, 0, 0, 0, 0, 2, 2, 3, 3, 3},
            {3, 3, 2, 0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 2, 2, 2},
            {2, 2, 3, 0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 3, 3, 3},
            {5, 3, 2, 3, 0, 0, 4, 4, 4, 4, 0, 0, 3, 2, 2, 2},
            {5, 2, 3, 2, 3, 0, 0, 4, 4, 0, 0, 0, 2, 3, 3, 3},
            {5, 5, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2},
            {5, 5, 5, 2, 3, 0, 0, 1, 1, 0, 0, 3, 2, 3, 3, 3},
            {5, 5, 5, 5, 2, 0, 0, 1, 1, 0, 0, 2, 3, 2, 2, 2},
            {5, 5, 5, 5, 3, 0, 0, 1, 1, 0, 0, 3, 2, 3, 3, 3},
    };
    private int [][] level00 = {
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 2, 2, 2, 2, 3},
            {5, 5, 5, 5, 3, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2},
            {5, 5, 5, 3, 2, 1, 1, 3, 3, 3, 0, 0, 1, 1, 0, 3},
            {5, 3, 0, 2, 1, 1, 0, 2, 2, 2, 3, 3, 3, 0, 0, 2},
            {3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3},
            {2, 0, 1, 1, 0, 3, 0, 0, 0, 1, 1, 1, 0, 2, 2, 2},
            {3, 0, 1, 0, 0, 2, 3, 3, 0, 3, 1, 1, 1, 1, 1, 1},
            {2, 0, 1, 1, 0, 0, 2, 2, 3, 2, 3, 0, 0, 1, 1, 1},
            {3, 3, 1, 1, 1, 1, 0, 0, 2, 3, 2, 3, 0, 0, 0, 0},
            {2, 2, 3, 0, 1, 1, 1, 1, 0, 2, 3, 2, 0, 0, 0, 3},
            {3, 3, 2, 3, 3, 1, 1, 1, 1, 0, 2, 3, 3, 0, 0, 2},
            {2, 2, 3, 2, 2, 0, 0, 1, 1, 0, 0, 2, 2, 3, 3, 3},
    };
    private int [][] level01 = {
            {2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3},
            {3, 3, 3, 2, 2, 0, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2},
            {2, 2, 2, 0, 0, 0, 4, 4, 4, 4, 4, 0, 1, 1, 1, 1},
            {3, 3, 0, 0, 0, 0, 0, 4, 4, 4, 0, 0, 1, 1, 1, 1},
            {2, 2, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 3},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 3, 2},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 4, 4, 0, 0, 2, 3},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 4, 4, 4, 4, 4, 0, 2},
            {0, 0, 0, 1, 1, 1, 1, 1, 0, 4, 4, 4, 4, 4, 0, 5},
            {3, 0, 0, 0, 1, 1, 1, 1, 0, 4, 4, 4, 4, 0, 5, 5},
            {2, 3, 3, 0, 0, 0, 0, 3, 3, 3, 0, 0, 5, 5, 5, 5},
            {3, 2, 2, 3, 3, 3, 3, 2, 2, 2, 5, 5, 5, 5, 5, 5},
    };
    private int [][] level02 = {
            {3, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3},
            {2, 2, 2, 3, 3, 3, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2},
            {1, 1, 0, 2, 2, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3},
            {1, 1, 0, 0, 0, 0, 2, 2, 0, 0, 0, 2, 2, 2, 2, 2},
            {3, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3},
            {2, 3, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 2, 2},
            {3, 2, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 3, 3},
            {2, 5, 0, 3, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 2, 2},
            {5, 5, 5, 2, 0, 0, 3, 3, 0, 1, 1, 1, 1, 1, 0, 3},
            {5, 5, 5, 5, 5, 5, 2, 2, 0, 0, 0, 0, 1, 1, 0, 2},
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 1, 1, 0, 3},
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 0, 2},
    };
    private int [][] level12 = {
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 0, 3},
            {5, 5, 5, 5, 5, 5, 5, 5, 3, 3, 3, 0, 1, 1, 0, 2},
            {5, 5, 5, 5, 3, 0, 0, 0, 2, 2, 2, 1, 1, 1, 3, 3},
            {5, 5, 5, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
            {5, 5, 5, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 3, 3},
            {5, 5, 5, 0, 1, 1, 0, 0, 4, 4, 4, 4, 4, 3, 2, 2},
            {5, 5, 5, 0, 3, 1, 1, 0, 4, 4, 4, 4, 4, 2, 3, 3},
            {5, 5, 5, 5, 2, 3, 1, 1, 1, 0, 4, 4, 4, 0, 2, 2},
            {5, 5, 5, 5, 5, 2, 0, 3, 1, 1, 1, 1, 0, 0, 0, 3},
            {5, 5, 5, 5, 5, 5, 5, 2, 3, 3, 1, 1, 1, 1, 0, 2},
            {5, 5, 5, 5, 5, 5, 5, 5, 2, 2, 0, 0, 1, 1, 0, 3},
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 0, 2},
    };
    private int [][] level22 = {
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 0, 3},
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 1, 1, 1, 3, 2},
            {5, 5, 5, 5, 5, 5, 5, 5, 3, 0, 0, 1, 1, 0, 2, 3},
            {3, 5, 5, 5, 5, 5, 5, 3, 2, 0, 1, 1, 0, 3, 3, 2},
            {2, 0, 0, 5, 5, 5, 5, 2, 0, 1, 1, 1, 0, 2, 2, 3},
            {1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 3, 3, 3, 2},
            {1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 3, 2, 2, 2, 3},
            {0, 1, 1, 0, 0, 0, 3, 3, 3, 3, 3, 2, 0, 0, 0, 2},
            {0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 3},
            {3, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 3, 3, 3, 3, 0, 1, 1, 1, 1, 0, 0, 0, 0, 3, 3},
            {3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2},
    };
    private int [][] level21 = {
            {2, 2, 2, 2, 3, 3, 0, 1, 1, 0, 5, 5, 5, 5, 5, 5},
            {3, 0, 0, 0, 2, 2, 0, 1, 1, 0, 0, 0, 5, 5, 5, 5},
            {2, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 5, 5, 5},
            {3, 1, 1, 0, 3, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {2, 1, 0, 0, 2, 3, 4, 4, 4, 0, 0, 1, 1, 1, 0, 0},
            {3, 1, 1, 0, 3, 2, 3, 4, 4, 4, 0, 1, 1, 1, 1, 1},
            {2, 0, 1, 0, 2, 3, 2, 4, 4, 4, 0, 0, 0, 1, 1, 1},
            {3, 0, 1, 3, 3, 2, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 2, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3},
            {3, 0, 0, 3, 3, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2},
            {2, 0, 3, 2, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3},
            {3, 3, 2, 3, 3, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2},
    };
    private int [][] level11 = {
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 3, 3, 3, 1, 1, 1, 1, 3, 3, 3, 5, 5, 5},
            {5, 5, 6, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 6, 5, 5},
            {5, 6, 6, 7, 7, 1, 1, 1, 1, 1, 1, 7, 7, 6, 6, 5},
            {5, 6, 7, 7, 3, 1, 1, 1, 1, 1, 1, 3, 7, 7, 6, 5},
            {5, 6, 7, 3, 2, 0, 1, 1, 1, 1, 0, 2, 3, 7, 6, 5},
            {5, 6, 7, 2, 3, 3, 0, 1, 1, 0, 3, 3, 2, 7, 6, 5},
            {5, 6, 7, 7, 2, 2, 0, 1, 1, 0, 2, 2, 7, 7, 6, 5},
            {5, 6, 6, 7, 7, 0, 0, 1, 1, 0, 0, 7, 7, 6, 6, 5},
            {5, 5, 6, 6, 7, 7, 7, 1, 1, 7, 7, 7, 6, 6, 5, 5},
            {5, 5, 5, 6, 6, 6, 6, 1, 1, 6, 6, 6, 6, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
    };
    public LevelLayout(String levelNum) {
        switch(levelNum) {
            case "20" -> this.level = level20;
            case "10" -> this.level = level10;
            case "00" -> this.level = level00;
            case "01" -> this.level = level01;
            case "02" -> this.level = level02;
            case "12" -> this.level = level12;
            case "22" -> this.level = level22;
            case "21" -> this.level = level21;
            case "11" -> this.level = level11;
        }
    }
}
