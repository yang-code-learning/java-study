package DotComGame;

import java.util.ArrayList;

public class DotComTestDrive { // 可理解为测试版本
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom dot = new DotCom();
        int randomNum = (int)(Math.random() * 5);

        ArrayList<String> locations =  new ArrayList<String>() {
            {
                add(randomNum + "");
                add(randomNum + 1 + "");
                add(randomNum + 2 + "");
            }
        }; // 这里类型也要变成ArrayList
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
