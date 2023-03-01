public class Sourcecode {

    public void printSomething(String name){
        System.out.println("저는 소스 코드 브랜치입니다. 만나서 반갑습니다.");
        System.out.println("Hello Source Code Branch!!");
        System.out.println("print(Hello World)");
    }

    public static void main(String[] args) {
        Sourcecode me = new Sourcecode();
        me.printSomething("Sourcecode");
    }
}
