package DotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; // ��ͨ��������ΪArrayList
    private String name;
    // int numOfHints = 0; �Ľ�����Ҫ

    public void setLocationCells(ArrayList<String> locs) { // �����������ҲҪ�޸�ΪArrayList
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
    * ����ʹ��ѭ���ķ���������Ϸ��bug������������ͬһ��λ��
    * ����һ�������Ƿ����еĲ�������
    * �����������и�������Ϊ-1
    * ��������ֱ��ɾ����������Ӧ���ӣ�����������ȡ��������������Ϊ0��Ϊkill
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
