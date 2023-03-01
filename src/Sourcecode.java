public class Sourcecode {

    public void printSomething(String name){
        System.out.println("저는 새로운 브랜치로 넘어온" + name + "입니다. 반갑습니다!");
        System.out.println("Hello Source Code!!");
    }

    public static void main(String[] args) {
        Sourcecode me = new Sourcecode();
        me.printSomething("Sourcecode");
    }
}
