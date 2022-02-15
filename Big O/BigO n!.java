package first_package;

public class BigO {
    int count = 0;
    public void function(int n){
        if(n==0){
            count++;
            System.out.println(count);
            return;
        }
        for(int i=0; i<n; i++){
            function(n-1);
        }
    }

    public static void main(String[] args) {
        BigO cal =new BigO();
        cal.function(38);
    }
}
