
import java.util.*;

public class Util {
    
    static void parse_customer(List<Customer> list_cust, List<CallDetail> list_call){
        for ( Customer c : list_cust)
            for ( CallDetail d : list_call)
                if(c.phone_no==d.phone_no || c.phone_no==d.called_no)
                    c.list_of_calls.add(d);
    }
}