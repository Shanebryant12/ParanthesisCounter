import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.*; 
public class parenthesis
{
    public static void main(String[] args) {

        String path = "C:\\Users\\Shane\\Documents\\Data3.txt"; // change the path of file accordingly

        try {

            // default StandardCharsets.UTF_8
            String content = Files.readString(Paths.get(path));  //this line reads the content of file to a string variable
            int count = 0; // will be used to count the parenthesis
            Stack st = new Stack(); // create a stack variable
            String[] c = content.split(""); // convert the string to an array of string
            for(int i = 0;i<c.length;i++) // traverse through all the elements in the array
            {
                
                if(!c[i].equals(" ")) 
                {
                    if(c[i].equals("("))
                {
                    st.push(++count);// push a constant value on the stack
                    System.out.print(count);// print the pushed value
                }
                if(c[i].equals(")"))
                {
                    System.out.print(st.pop());// pop the value from stack and print
                    
                } 
                if(st.empty())
                {
                    System.out.print(" ");// if the stack gets empty print a space
                }
                }
            }
                System.out.println("");
                System.out.println(content);// print the content of the file
        } catch (IOException e) {
            e.printStackTrace();
        }}
       
    }