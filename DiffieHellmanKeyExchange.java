import java.util.Scanner;
public class DiffieHellmanKeyExchange 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter q");
        int q=s.nextInt();
        
        System.out.println("Enter a");
        int a=s.nextInt();
        
        System.out.println("Enter private key of A");
        int xa=s.nextInt();
        
        System.out.println("Enter private key of B");
        int xb=s.nextInt();
        
        int ya= ((int)Math.pow(a,xa))%q;
        int yb= ((int)Math.pow(a,xb))%q;
        
        int K= ((int)Math.pow(yb,xa))%q;
        int K1= ((int)Math.pow(ya,xb))%q;
        
        System.out.println("q is: "+q);
        System.out.println("a is: "+a);
        System.out.println("Private key of A is: "+xa);
        System.out.println("Private key of B is: "+xb);
        System.out.println("Public key of A is: "+ya);
        System.out.println("Public key of B is: "+yb);
        
        if(K1==K)
        {
            System.out.println("Secret key is: "+K);
        }
    }
}
