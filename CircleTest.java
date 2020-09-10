package laba2_1;
import java.util.Scanner;

public class CircleTest {
    private double r;
    private Circle circle;
    public CircleTest(){
        do{
        System.out.print("Введите радиус окружности:\n");
        Scanner in = new Scanner(System.in);
        r=in.nextDouble();
        if (r!=0.0){
            circle=new Circle(r);
            Test();
        }
        } while (r!=0.00);
        System.out.print("END\n");
    }
    public void Test(){
        System.out.print("Результаты работы программы:\n");
        System.out.print("Радиус окр = "+ circle.Get_r()+" Диаметр окр = "+circle.Get_d()+" Периметр окр = "+circle.Get_p()+" Площадь окр = "+circle.Get_s()+"\n");
    };
}
