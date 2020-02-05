

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List <CallDetail> list_calls= new ArrayList<>();
        List <Customer> list_cust = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            System.out.println("Enter phone no");
            double p = scan.nextDouble();
            System.out.println("Enter name");
            scan.next();
            String n = scan.nextLine();
            System.out.println("Enter age");
            int a = scan.nextInt();
            Customer c = new Customer(p,n,a);
            list_cust.add(c);
        }
        for(int j=0; j<2; j++){
            System.out.println("Enter cust no calling");
            int h = scan.nextInt();
            System.out.println("Enter cust to call");
            int o = scan.nextInt();
            System.out.println("Enter duration");
            int z = scan.nextInt();
            System.out.println("Enter type");
            scan.nextLine();
            String k = scan.nextLine();
            CallDetail d = new CallDetail(list_cust.get(h).phone_no,list_cust.get(o).phone_no,z,k);
            list_calls.add(d);
        }
        System.out.println("**************************************");
        Util.parse_customer(list_cust, list_calls);
        System.out.println("Enter no");
        int p = scan.nextInt();
        list_cust.get(p).print();
    }
    
}