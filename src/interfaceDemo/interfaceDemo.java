package interfaceDemo;
interface Demo
{
    int a=10; //public,static,final
    void display(); //abstract , public
    //abstract: then i will depend on my child
}

class Test implements Demo
{
    @Override
    public void display() {
        System.out.println("hello");
    }
}

public class interfaceDemo {
        public static void main(String[] args) {
            Test t=new Test();
            t.display();
        }
    }
