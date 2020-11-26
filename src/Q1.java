import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        String content = ReadFile("Lab 3");
        boolean doChar = true;
        if (content == null){
            System.out.println("File was not found!");
        }
        else{
            if(doChar){
                content = content.replace(" ","");
                char[] letters = content.toCharArray();
                Sort.bubble(letters);
                System.out.println("Sorted letters: " + Arrays.toString(letters));
            }
            else{
                String[] words = content.split(" ");
                Sort.bubble(words);
                System.out.println("Sorted words: " + Arrays.toString(words));
            }
        }
    }
    public static String Sort(char[] l){
        return "sort";
    }
    public static String Sort(String[] s){
        return "sort";
    }
    public static Scanner ScanFile(File f){
        try{
            return new Scanner(f);
        }
        catch (FileNotFoundException e){
            return null;
        }
    }
    public static String ReadFile(String file_name){
        File file = new File(".\\content\\" + file_name + ".txt");
        Scanner sc = ScanFile(file);
        if (sc != null){
            String out = "";
            while (sc.hasNextLine()) {
                out += sc.nextLine();
            }
            out = out.replace("!","");
            out = out.replace("?","");
            out = out.replace(".","");
            out = out.replace(",","");
            out = out.replace("'","");
            out = out.replace(":","");
            out = out.replace(";","");
            return out;
        }
        else
            return null;
    }
}
