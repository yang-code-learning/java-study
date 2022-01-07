import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int randomNum = 1;
        ArrayList<String> locations =  new ArrayList<String>() {
            {
                add(randomNum + "");
                add(randomNum + 1 + "");
                add(randomNum + 2 + "");
            }
        };
        while(!locations.isEmpty()) {
            System.out.println(locations.get(0));
            locations.remove(0);
        }
    }
}
