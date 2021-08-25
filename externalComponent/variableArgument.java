package externalComponent;

public class variableArgument {
    public static void main(String[]args) {
        variableArgument vararg = new variableArgument();

        vararg.method1("kim", "park", "Lee");
        vararg.method2("Noh", 1,2,3,4,5);

    } 
    public void method1(String ...name) {
        for(String temp : name) {
            System.out.println (temp);
        }
    }
    public void method2(String name, int ...num) {
        System.out.println(name);

        for(int temp : num) {
            System.out.println(temp);
        }

    }
}
