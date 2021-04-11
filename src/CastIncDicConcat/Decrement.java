package CastIncDicConcat;

public class Decrement {
    public static void main(String[] args) {
        //Decrement: degsikenlerin degerini azaltir
        int num = 10;
        System.out.println(num);
        //1.yol
        num = num-3;
        System.out.println(num);//7

        //2.yol
        num-=2;
        System.out.println(num);//5
        //3.yol
        num--;
        System.out.println(num);//4

        //Not:
        //carpma ile de arttirma yapabiliriz
        int num2 = 10;
        //1 yol
        num2 = 5*num2;
        System.out.println(num2);//50
        //2.yol
        num2*=2;
        System.out.println(num2);//100

        //bolme ile de azaltma yapilabilir
        //1yol
        num2= num2/2;
        System.out.println(num2);//50
        //2yol
        num2/=5;
        System.out.println(num2);//10




    }
}
