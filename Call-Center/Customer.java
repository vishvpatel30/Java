
import java.util.*;

public class Customer {
    double phone_no;
    String name;
    int age;
    List <CallDetail> list_of_calls= new ArrayList<>();
    
    Customer(double no, String n, int a){
        setphoneno(no);
        setname(n);
        setage(a);
    }
    private void setname(String n){
        name = n;
    }
    String getname(){
        return name;
    }
    private void setphoneno(double n){
        phone_no = n;
    }
    double getphoneno(){
        return phone_no;
    }
    private void setage(int n){
        age = n;
    }
    int getage(){
        return age;
    }
    void print(){
        for(CallDetail c: list_of_calls){
            c.disp();
        }
    }
}