public class Calculator implements CalcOp{
    public int add (int x, int y){
        int v = x + y;
        return v;
    }

    public int subtract(int x, int y){
        int v = x-y;
        return v;
    }
    public int multiply(int x, int y){
        int v = x*y;
        return v;
    }
    public int divide(int x, int y){
        int v = x/y;
        return v;
    }
    
    public int hexToDec(String hexValue){
      int deci = Integer.parseInt(hexValue, 16);
      return deci;
    }
}
