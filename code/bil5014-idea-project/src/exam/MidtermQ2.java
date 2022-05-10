package exam;

public class MidtermQ2 {
    public static void main(String[] args) {
        algorithm(10);
    }

    private static void algorithm(int N){
        for(int i=0; i<N; i++) {
            for(int j=1; j<(N-i); j++) {
                for(int k=j; k<(j+1); k++) {
                    System.out.println("hello");
                }
            }
        }
    }
}