
interface Members{
    void callback();
}

class Customer implements Members{
    public String name;

    Customer(String name){
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("Yes, I will visit the store, " +name);
    }
}

class Store {

    Members[] mem = new Members[100];
    int count = 0;

    void register(Members m){
        mem[count++] = m;
    }

    void inviteCustomers(){
        for(int i=0; i<count; i++){
            mem[i].callback();
        }
    }
}


public class Interface2 {
    public static void main(String[] args) {
        Store store = new Store();

        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        store.register(cust1);
        store.register(cust2);

        store.inviteCustomers();
    }
}
