import java.util.Scanner;

public class frequency {

    public static void main(String args[]){

        frequency obj=new frequency();

        obj.hello();

        reverse obja=new reverse();

        obja.hello1();

    }

    

    

}

class frequency{

void hello(){

   System.out.println("enter the string \n");

    Scanner st=new Scanner(System.in);

    String str=st.next();

    

    int[] freq = new int[str.length()];  

    int i, j;  

      

    //Converts given string into character array  

    char string[] = str.toCharArray();  

      

    for(i = 0; i <str.length(); i++) {  

        freq[i] = 1;  

        for(j = i+1; j <str.length(); j++) {  

            if(string[i] == string[j]) {  

                freq[i]++;  

                  

                //Set string[j] to 0 to avoid printing visited character  

                string[j] = '0';  

            }  

        }  

    }  

      

    //Displays the each character and their corresponding frequency  

    System.out.println("Characters and their corresponding frequencies");  

    for(i = 0; i <freq.length; i++) {  

        if(string[i] != ' ' && string[i] != '0')  

            System.out.println(string[i] + "-" + freq[i]);  

    }  

}

}

class reverse{

public Object hello1;

void hello1(){

    System.out.println("enter the string to be reversed\n");

    Scanner hellot=new Scanner(System.in);

    String string = hellot.next();;    

    //Stores the reverse of given string    

    String reversedStr = "";    

        

    //Iterate through the string from last and add each character to variable reversedStr    

    for(int i = string.length()-1; i >= 0; i--){    

        reversedStr = reversedStr + string.charAt(i);    

    }    

        

    System.out.println("Original string: " + string);    

    //Displays the reverse of given string    

    System.out.println("Reverse of given string: " + reversedStr);    

}

}
