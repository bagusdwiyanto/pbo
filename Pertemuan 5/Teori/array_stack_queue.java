package array_stack_queue;

public class Array_Stack_Queue {


    public static void main(String[] args) {
        
        System.out.println ("[Array List]");
        ArrayList new_array = new ArrayList();
        new_array.append(1);
        new_array.append(2);
        new_array.append(3);
        new_array.append(4);
        new_array.ShowData();
        System.out.println("-");
        new_array.append(5);
        new_array.ShowData();
        System.out.println("-");
        new_array.pop();
        new_array.ShowData();
        System.out.println("-");
        new_array.UbahData(0,7);
        new_array.ShowData();
        System.out.println("\n");
        
        System.out.println("[Stack]");
        Stack new_stack = new Stack();
        new_stack.append(1);
        new_stack.append(2);
        new_stack.append(3);
        new_stack.append(4);
        new_stack.append(5);
        new_stack.ShowData();
        System.out.println("-");
        new_stack.append(6);
        new_stack.ShowData();
        System.out.println("-");
        new_stack.pop();
        new_stack.ShowData();
        System.out.println("-");
        new_stack.UbahData(0,0);
        new_stack.ShowData();
        System.out.println("\n");
        
        System.out.println("[Queue]");
        Queue new_queue = new  Queue();
        new_queue.append(1);
        new_queue.append(2);
        new_queue.append(3);
        new_queue.append(4);
        new_queue.append(5);
        new_queue.ShowData();
        System.out.println("-");
        new_queue.pop();
        new_queue.ShowData();
        System.out.println("-");
        new_queue.UbahData(2,0);
        new_queue.ShowData();
        System.out.println("SELESAI");
    }
    
}
