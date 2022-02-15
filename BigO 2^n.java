package first_package;

public class BigO {
    int count = 0;
    public int function(int n){
        if(n==0){
            return 0;
        }if(n==1) {
            return 1;
        }
        return (n-1)+(n-2);
    }

    public static void main(String[] args) {
        BigO cal =new BigO();
        System.out.println(cal.function(8));
    }
}
