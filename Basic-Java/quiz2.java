public class quiz2 {
    public static void main(String[] args) {
        //calculate a*b / a-b where a = 10; b = 5
        int a = 10;
        int b = 5;
        int ans = a*b / a-b; //output = 0; because Java doesn't follow BODMAS rule, it calculates from left to right
        System.out.println(ans);
        int calc = (a*b) / (a-b);
        System.out.println(calc);
    }
    
}
