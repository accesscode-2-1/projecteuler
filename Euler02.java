public class Euler02 {

    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 1;
        int c = a + b;
        int sum = 0;


        while (c < 4e6){
            //Thread.sleep(500); 
            
            if (c%2 == 0){
                sum += c;
            }
            a = b; b = c; c = a + b;
            //System.out.println(String.format("a=%s,b=%s,c=%s",a,b,c));
        }

        System.out.println(sum);
    }

}
