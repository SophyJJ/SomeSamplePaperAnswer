public class MichaelStack<T>{
    private int index = 0;
    public static final int MAX = 3;
    private T[] data = (T[]) new Object[MAX];
    public void push(T obj) {
        data[index++] = obj;
    }
    public boolean hasNext() {
        return index > 0;
    }
    public boolean hasRoom() {
        return index < MAX;
    }
    public T pop() {
        if (hasNext()) {
            return data[--index];
        }
        throw new ArrayIndexOutOfBoundException(-1);
    }
}

public class TestStack {
    public static void main(String[] args){
        String[] strlist = { "KOMALA ", "SU MON" , "KUANG" };
        Integer[] intlist = {20, 30, 60, 45};
        MichaelStack<String> strStack = new MichaelStack<String>();
        MichaelStack<Integer> intStack = new MichaelStack<Integer>();
        //lifo for strlist and intstack
        for(int i = 0; i < 3; i++){
            strStack.push(strlist[i]);
            intStack.push(intlist[i]);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(strStack.pop());
        }
        for(int i = 0; i < 3; i++){
            System.out.println(intStack.pop());
        }
    }
}