public interface A {
    public void doSomeProcess(String s);
}

public class AImpl implements A{
    public void doSomeProcess(String s){
        System.out.println("A Impl Code");
    }
}

public class B  {
    public A doit(){
        A aObject = new AImpl();
        System.out.println("Class B, doIt()");
        return aObject;
    }
    public String execute(){
        System.out.println("Class B, execute()");
        return "0";
    }
}

public class C extends B {
    public AImpl doIt(){
        AImpt aObject = new AImpl();
        System.out.println("Class C, doIt()");
        return aObject;
    }

    // public Object execute(){
        // The Object return type does not match with the 
        // parent method return type.
        // Either change the Child return type or the method name.
    // }

    // Solution:
    public String execute(){
        System.out.println("Class C, execute()");
        return "0";
    }
}

// No output as there is no public static void main method
// for execution
