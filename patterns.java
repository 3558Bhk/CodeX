// this is pattern problem
public class patterns{
    public static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2 (int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(n-1-j + " ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
    public static void pattern5(int n){
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print(4-i+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n= 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);

    }
}
