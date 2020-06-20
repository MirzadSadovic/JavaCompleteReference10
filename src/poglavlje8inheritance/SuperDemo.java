package poglavlje8inheritance;

class A{
    int i;
}

class B extends A{
    int i; //Ovo i skriva i u klasi A
    
    B(int a, int b){
        super.i = a; //i u klasi A
        i = b;       //i u klasi B
    }
    void Show(){
        System.out.println("i u natklasi: " + super.i);
        System.out.println("i u potklasi: " + i);
    } 
}

public class SuperDemo {
    public static void main(String[] args) {
        B podObject = new B(1, 2);
        podObject.Show();
    }
}
