//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Convert an array to linked list
    public static Node convertArrayToLL(int [] arr){
        Node head = new Node(arr[0], null);
        Node mover = head;
        for(int i = 1; i<arr.length; i++) {
            Node temp = new Node(arr[i], null);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }


    public static void main(String[] args) {
        int [] arr = {2,3,4,5};
        int LLLength = 0;
        Node head = convertArrayToLL(arr);
        System.out.println(head.data);
        //Traversing through the LL
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
            LLLength++;
        }
        System.out.println("Length of the LL is " + LLLength);
    }
}