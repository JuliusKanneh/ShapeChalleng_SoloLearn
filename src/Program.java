import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here


public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

class Square extends Shape{
    public Square(int x){
        super.width = x;
    }

    public void area(){
        System.out.println(super.width*super.width);
    }
}

class Circle extends Shape{
    public Circle(int y){
        super.width = y;
    }

    public void area(){
        System.out.println(Math.PI*super.width*super.width);
    }
}

class Reverse
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}