public class XnorGate {
    public int gate(int fValue, int sValue){
        if(fValue == 0 && sValue ==0){
            return 1;
        }
        if(fValue ==1 && sValue ==1){
            return 1;
        }
        return 0;
    }
    
}
