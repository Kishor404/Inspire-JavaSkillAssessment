public class ParameterExample{
    public static void main(String[] args) {
        int x=10;
        int[] y={1,2,3,4};
        System.out.println(x);
        for(int i=0; i<y.length; i++){
            System.out.print(y[i]+" ");
        }

        ModifyValue(x);
        System.out.println(x);

        ModifyRef(y);
        for(int i=0; i<y.length; i++){
            System.out.print(y[i]+" ");
        }

        Varargs("Hello", 1,2,3);

    }
    public static void ModifyValue(int x){
        x+=3;
    }
    public static void ModifyRef(int[] y){
        y[1]=8;
    }
    public static void Varargs(String s, int... StringNum){
        System.out.println(s);
        for(int i=0; i<StringNum.length; i++){
            System.out.print(StringNum[i]+" ");
        }
    }
}