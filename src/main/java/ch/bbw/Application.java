package ch.bbw;

/**
 * @author Jannik Hug
 * @version 0.0.1
 */

public class Application {

    public static void main(String[]args){
        Calculator calculator = new Calculator();
        int v1;
        int v2;

        System.out.println("Console Calculator");
        System.out.println("------------------");

        v1 = 10;
        v2 = 20;
        System.out.println("Summe: "+ v1 +"+"+ v2 +"=" + calculator.summe(10, 20));
    }
}
