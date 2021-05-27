package Consructor;

public class Q02 {
    int x = 3;
    int y = 5;
    Q02(){
        x+=1;
        System.out.println("-x"+x);
    }
    Q02(int i){
        this();
        this.y =i;
        x+=y;
        System.out.println("-x"+x);
    }
    Q02(int i, int i2){
        this(3);
        this.x -=4;
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        Q02 a = new Q02(4,3);

    }
}
