public class implementation {
    public static void main(String[]args){
    int n=5;
    Integer m=n;//autoboxing
    int o=m;//unboxing
    Integer a1=1;
    Integer a2=2;
    Integer a3=127;
    Integer a4=127;
    Integer a5=128;
    Integer a9=128;
    Integer a6= -128;
    Integer a7= -128;
    Integer a8=-129;
    Integer a81=-129;
    System.out.println(a3==a4);
    System.out.println(a5==a9);
    System.out.println(a6==a7);
    System.out.println(a8==a81);//Integer wrapper class has limit of -128 to 127.......and in it too it compares the addresses stored in it of these values number greater or lesser than the limit creates its own memory address


    }
    
}
