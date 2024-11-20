package out.production.java.bs;

public class ClassObjectExample {

    public static void main(String[] args) {

        Customer abhinavx = new Customer();
        Customer rohan = new Customer();
        abhinavx.name="abhinav kumaer singh";
        abhinavx.show();
        rohan.name="rohan";
        rohan.show();

    }



}


class Customer{

    int cid;
    String name;
    long phone;
    static String areaname;
    

    void show(){
        System.out.println("cid ="+cid);
        System.out.println("name ="+name);
        System.out.println("phone ="+phone);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
