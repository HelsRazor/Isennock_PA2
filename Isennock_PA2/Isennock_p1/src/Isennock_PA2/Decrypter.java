package Isennock_PA2;
import java.lang.String;
public class Decrypter {
    private String toDecrypt;
    private String decrypted;
/* if the integer for decryption is less then 4 we will append a 0 to the front of it until it is the minimum size of 4
 When the main method calls the basic constructor it will call the helper function decrypt which will then take each character
 and based off it's value determine how to decrypt it, if the value of the character is greater than or equal to 7 just subtract 7
 else add 3 it then appends the value to a string buffer, once all values are appended the value in the buffer is stored in decrypted
 while it is cleared, each character in decrypted is then stored individually and swapped around and appended to the buffer, then the
 decrypted is set equal to the buffer and returned
* */
    public void setToDecrypt(int intToDecrypt) {
        String temp = Integer.toString(intToDecrypt);
        //System.out.println(temp);
        while(temp.length()<4){
            StringBuffer sb = new StringBuffer();
            sb = sb.append("0");
            sb.append(temp);
            temp = sb.toString();
        }
        //System.out.println(temp);
        this.toDecrypt = temp;
    }
    private String decrypt(int length){
        //To reverse the encryption if the digit value is 7 8 or 9 subtract 7
        //else if 0->6 add 3
        StringBuffer sb = new StringBuffer();
        //System.out.println(toDecrypt);
        int x;

        for(int i =0; i<length;i++){
            /*System.out.printf("%n%n%c%n%n",toDecrypt.charAt(i));
            System.out.println((int)(toDecrypt.charAt(i)));
            */
            x=(int) (toDecrypt.charAt(i)) - 48;
            //System.out.printf("%n%n%d%n%n",x);

          if (x< 7) {
                int temp = x;
                temp = temp + 3;
                //System.out.println(temp);
                x = temp;
                sb.append(x);
                //System.out.println(sb);
            } else if (x> 7) {
                int temp = x;
                temp = temp - 7;
                //System.out.println(temp);
                x= temp;
                if(x==0 && i ==0){
                    sb.append('0');
              //      System.out.println(sb);
                }else {
                    sb.append(x);
            //        System.out.println(sb);
                }
            }
        }
            decrypted = sb.toString();
          //  System.out.println(decrypted);
            sb = new StringBuffer();
            char temp;
            char first = decrypted.charAt(0);
            char second = decrypted.charAt(1);
            char third = decrypted.charAt(2);
            char fourth = decrypted.charAt(3);

            temp = first;

            first = third;

            third = temp;



            temp = second;

            second = fourth;

            fourth = temp;
            sb.append(first);
            sb.append(second);
            sb.append(third);
            sb.append(fourth);


            decrypted = sb.toString();

        //System.out.println(sb);
            return decrypted;
    }

    public String decrypter(){
        int lengthofdecrypt = toDecrypt.length();
        //System.out.println(lengthofdecrypt);
        return decrypt(lengthofdecrypt);
    }
}
