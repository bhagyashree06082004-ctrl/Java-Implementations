class My extends  Thread{
    public void run(){
        int i=0;
        while (true) { 
         System.out.println(i+" Hello");   
         i++;
        }
    }
}
class first {
    public static void main(String[] args) {
        My m = new My();
        m.start();
        int i=0;
        while (true) { 
         System.out.println(i+" world");   
         i++;     
        }   
    }
}