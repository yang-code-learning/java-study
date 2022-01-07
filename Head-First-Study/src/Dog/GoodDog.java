package Dog;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if(size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if(size > 40) {
            System.out.print("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
