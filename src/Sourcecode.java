public class Sourcecode {

    public void printSomething(String name){
        System.out.println("저는 " + name + "입니다. 반갑습니다!");
    }

    public static void main(String[] args) {
        Sourcecode me = new Sourcecode();
        me.printSomething("Sourcecode");
    }
}
