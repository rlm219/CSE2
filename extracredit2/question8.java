public class question8{
    public static void main(String[] args){
        System.out.println("i \t m(i)"); 
        for(int i = 1; i<=20; i++){
            System.out.println(i+" \t "+m());
        }
    }
    public static double m(){
        double m = 0;
        for(int i = 0; i<=20; i++){
            m = i/((2*i)+1);
        }
        return m;
    }
}