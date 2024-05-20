public class XorGate {
    public int gate(int fValue, int sValue){
        if(fValue == 0 && sValue ==0){
            return 0;
        }
        if(fValue == 1 && sValue ==1){
            return 0;
        }
        return 1;
    }
    
}
