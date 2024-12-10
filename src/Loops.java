public class Loops {
    public static void main(String[] args) {
        //types of Do-while , For and while

        //1:- For Loop
        //Used for Definite Iterations

        for(int i=0;i<5;i++){
            System.out.println(i);
        }

        //while loop
        int i=0;
        while(i<10){
            System.out.println(i+ " While Loop");
            i++;
        }

        //do-while
        int g=0;
        do{
            System.out.println(g + " Do While");
            g++;
        }
        while(g<5);
    }
}
