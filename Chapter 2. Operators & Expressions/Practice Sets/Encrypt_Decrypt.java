import java.util.Scanner;
public class Encrypt_Decrypt 
{
    public static void main(String[] args) 
    {
        // Encrypting the grade
        char grade = 'C';
        char enc_grade = (char)(grade+8);

        // Decrypting the grade
        Scanner g = new Scanner(System.in);
        System.out.println("Enter Code to decrypt grade = ");
        float dec_Code = g.nextFloat();
        char org_Grade = (char)(enc_grade-dec_Code);
        System.out.println("Original Grade = "+org_Grade); 

    }    
}
