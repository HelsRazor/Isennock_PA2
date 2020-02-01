package Isennock_PA2;
import java.util.Scanner;
/*
* User will select 1 fro encryption 2 for decryption from there based on userChoice they will then be prompted to enter a
* number to be encrypted or decrypted then it will be stored inside an private instanced variable of the proper class
* then based on the choice made it will then call the primary constructor of the proper class then print out the encrypted or decrypted value
* */
public class Application {

    public static void main(String[] args) {
	    int userChoice;
	    Scanner scn = new Scanner(System.in);

	    System.out.printf("Select 1 for encryption or 2 for decryption");

	    userChoice = scn.nextInt();
	        while((userChoice != 1)&&(userChoice != 2)){
	            System.out.printf("Bad Input: Please enter either 1 to encrypt or 2 to decrypt");
	            userChoice = scn.nextInt();

            }

	        switch (userChoice){

                case 1:
                    Encrypter e = new Encrypter();

                    scn = new Scanner(System.in);

                    System.out.printf("Enter Number to be Encrypted : ");

					String toEncrypt = scn.next();

					//System.out.printf("%s",toEncrypt);


					e.setToBeEncrypted(toEncrypt);

					System.out.printf("%s",e.encrypter());

					break;
				case 2:
					Decrypter de = new Decrypter();

					scn = new Scanner(System.in);

					System.out.printf("Enter Number to Decrypt : ");

					int toDecrypt = scn.nextInt();

					de.setToDecrypt(toDecrypt);

					System.out.printf("%n%s",de.decrypter());
            }


    }
}
