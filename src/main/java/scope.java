import jdk.incubator.vector.VectorOperators;
//scope variable java
public class scope {
    static int x=10;
    private int y=20;
    public void method1(int x){

        scope t=new scope();
        this.x=10;
        y=20;
        System.out.println("Test"+ scope.x);
        System.out.println("t.x"+t.x);
        System.out.println("y:"+y);
    }
    public static void main(String[] args){
        scope t=new scope();
        t.method1(5);
    }
}


