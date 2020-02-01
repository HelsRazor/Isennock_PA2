package Isennock_PA2;
import java.lang.String;
/*the primary constructor will call a helper function called encrypt the encrypt function will first take the toBeEncrypted string and
* break it down into it's base characters and convert them to their decimal value then apply the encryption method of adding seven then
* taking the mod of 10, then proceed to store them into a string buffer to be held until the full string is converted. after the full string
* is converted it will then take and store it in encrypted while clearing the string buffer, now it will store each character into a different variable
* and begin to swap them, after they have been swapped they will be appended back to the string buffer and set to encrypted variable and returned*/
public class Encrypter {
    private String toBeEncrypted;
    private String encrypted;



    public void setToBeEncrypted(String toBeEncryptedIn) {
            System.out.println(toBeEncryptedIn);
         this.toBeEncrypted = (toBeEncryptedIn);
    }

    private String encrypt(int length){
        int x;
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<length;i++){

            x = (int) (toBeEncrypted.charAt(i)) - 48;

        //    System.out.printf("%d %n", x);
            x = (x+7);
          //  System.out.printf("%d %n", x);
            x = x%10;
            //System.out.printf("%d %n", x);
            sb.append(x);

            System.out.println(sb);

        }
        encrypted = sb.toString();
        sb = new StringBuffer();

        /*System.out.println(encrypted.charAt(0));
        System.out.println(encrypted.charAt(1));
        System.out.println(encrypted.charAt(2));
        System.out.println(encrypted.charAt(3));
*/
        char first = encrypted.charAt(0);
        char third = encrypted.charAt(2);
        char temp = first;
        System.out.println(first);
        System.out.println(third);
        System.out.println(temp);
        first = third;
        third = temp;

        System.out.println(first);
        System.out.println(third);

        //sb.append(first);
        //sb.append(third);
        char second = encrypted.charAt(1);
        char fourth = encrypted.charAt(3);
        temp = second;

        /*System.out.println("Second pre: "+ second);
        System.out.println("Fourth pre: "+ fourth);
        System.out.println("temp 2nd time :"+temp);*/
        second = fourth;
        fourth = temp;

        /*System.out.println("second post: "+ second);
        System.out.println("fourth post"+fourth);
*/
        sb.append(first);
  //      System.out.println("SB append 1 :"+sb);
        sb.append(second);
    //    System.out.println("SB append 2 :"+sb);
        sb.append(third);
      //  System.out.println("SB append 3 :"+sb);
        sb.append(fourth);
        //System.out.println("SB append 4 :"+sb);
        encrypted = sb.toString();
        //System.out.printf(encrypted);
        //encryptedInt = Integer.parseInt(encrypted);
        return encrypted;
    }

    public String encrypter(){

        int lengthOfToBeEncrypted = toBeEncrypted.length();

        encrypt(lengthOfToBeEncrypted);
        
        return encrypted;

    }
}
