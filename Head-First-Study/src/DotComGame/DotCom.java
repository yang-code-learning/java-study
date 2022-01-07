package DotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; // 普通数组升级为ArrayList
    private String name;
    // int numOfHints = 0; 改进后不需要

    public void setLocationCells(ArrayList<String> locs) { // 这里参数类型也要修改为ArrayList
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    /* public String checkYourself(String stringGues) {
        int guess = Integer.parseInt(stringGues);
        String result = "miss";
        for(int cell : locationCells) { 
            if(guess == cell) {
                result = "hit";
                numOfHints++;
                break;
            }  
        }

        if(numOfHints == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    } */

    /* 
    * 上述使用循环的方法存在游戏性bug：允许多次命中同一个位置
    * 方案一：设置是否命中的布尔数组
    * 方案二：命中格子设置为-1
    * 方案三：直接删除聪数组相应格子，这样还可以取消计数，当长度为0即为kill
    */

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0) {
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
        
}
