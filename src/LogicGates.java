

public class LogicGates {
    public static void main(String[] args) {
        String gateTypeFlag = args[0];
        String[] values = args[1].split(" ");
        int firstValue;
        int secondValue;
        int output;
        YesGate yesGate = new YesGate();
        NotGate notGate = new NotGate();
        AndGate andGate = new AndGate();
        OrGate orGate =  new OrGate();
        XorGate xorGate = new XorGate();
        NandGate nandGate = new NandGate();
        NorGate norGate = new NorGate();
        XnorGate xnorGate = new XnorGate();
        
        switch (gateTypeFlag) {
            case "-yes":

                firstValue = Integer.parseInt(values[0].strip());
                output = yesGate.gate(firstValue);
                System.out.println(output);
                break;
            case "-not":

                firstValue = Integer.parseInt(values[0].strip());
                output = notGate.gate(firstValue);
                System.out.println(output);
                break;
            case "-and":

                firstValue = Integer.parseInt(values[0].strip());
                secondValue = Integer.parseInt(values[1].strip());
                output = andGate.gate(firstValue, secondValue);
                System.out.println(output); 
                break; 
            case "-or":

                firstValue = Integer.parseInt(values[0].strip());
                secondValue = Integer.parseInt(values[1].strip());
                output = orGate.gate(firstValue, secondValue);
                System.out.println(output);
                break;
            case "-xor":

                firstValue = Integer.parseInt(values[0].strip());
                secondValue = Integer.parseInt(values[1].strip());
                output = xorGate.gate(firstValue, secondValue);
                System.out.println(output);
                break;
            case "-nand":

                firstValue = Integer.parseInt(values[0].strip());
                secondValue = Integer.parseInt(values[1].strip());
                output = nandGate.gate(firstValue, secondValue);
                System.out.println(output);
                break;
            case "-nor":

                firstValue = Integer.parseInt(values[0].strip());
                secondValue = Integer.parseInt(values[1].strip());
                output = norGate.gate(firstValue, secondValue);
                System.out.println(output);
                break;
            case "-xnor":

                firstValue = Integer.parseInt(values[0].strip());
                secondValue = Integer.parseInt(values[1].strip());
                output = xnorGate.gate(firstValue, secondValue);
                System.out.println(output);
                break;
            default:
                break;
        }
    }
}
