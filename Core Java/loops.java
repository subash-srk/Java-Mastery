public class loops{
    public static void main(String[] args) {
        int i = 1;
        while(i < 5){
            System.out.println("Hi: "+i);
            i++;
        }

        do{
            System.out.println("Hi: "+i);
            i++;
        }while(i < 5);

        for(int j = 0; j < 5; j++){
            System.out.println("Hi: " + j);
        }
    }
}