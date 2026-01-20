class StackOverflow extends Exception {
    public String toString() {
        return "The size of the stack is full cannot add more element";
    }

}

class StackUnderflow extends Exception {

    public String toString() {
        return "No more element to be poped out from the stack";
    }

}

class Stack {

    private int size;
    private int top = -1;
    private int s[];

    public Stack(int sz) {
        size = sz;
        s = new int[sz];
    }

    public void pushElement(int ele) throws StackOverflow {

        if (top == size - 1) {
            throw new StackOverflow();
        }

        top++;
        s[top] = ele;

    }

    public int popElement() throws StackUnderflow {
        int popedElement = -1;
        if (top == -1) {
            throw new StackUnderflow();
        }
        popedElement = s[top];
        top--;

        return popedElement;
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        try{
        st.pushElement(23);
        st.pushElement(23);
        st.pushElement(23);
        st.pushElement(23);
        st.pushElement(23);
        st.pushElement(23);
        st.pushElement(23);
        st.pushElement(23);
        st.popElement();

        }
        catch(StackOverflow s){
            System.out.println(s);
        }
        catch(StackUnderflow s){
            System.out.println(s);
        }

    }

}
