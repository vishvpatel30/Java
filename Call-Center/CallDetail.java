
public class CallDetail {
    double phone_no, called_no, duration;
    String call_type;
    
    CallDetail(double p, double c, double d, String t){
        setcalltype(t);
        setcalledno(c);
        setphoneno(p);
        setduration(d);
    }
    private void setcalltype(String t){
        call_type = t;
    }
    String getcalltype(){
        return call_type;
    }
    private void setcalledno(double c){
        called_no = c;
    }
    double getcalledno(){
        return called_no;
    }
    private void setphoneno(double p){
        phone_no = p;
    }
    double getphoneno(){
        return phone_no;
    }
    private void setduration(double d){
        duration = d;
    }
    double getduration(){
        return duration;
    }
    void disp(){
        System.out.println(phone_no+"--->"+called_no+" for "+duration+" type "+call_type);
    }
}