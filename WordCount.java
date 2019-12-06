    /******************************************************************************
    *  Jianxin Wang | 23448316
    *  Assigment 3
    *
    *  objective:
    *  Reads in a text file of lyrics
    *  catch each word in the file and put it into a data structure
    *  count word frequency for each unique word
    *  print out word frequency list

    ******************************************************************************/

    import java.util.Set;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.Scanner;
    import java.io.PrintWriter;
    import java.io.FileWriter;
    import java.util.Iterator;
    import java.io.IOException;
    import java.util.*;
    import java.io.*;

    public class WordCount{
        private Set<String> wordList = new HashSet<String>();
        private HashMap<String,Integer> frequencyList= new HashMap<String,Integer>();
    
        public void setData(Scanner read){
            while(read.hasNext()){
                String input="";
                
                input=read.next();
                char[] word =input.toCharArray();
                input="";
                //makes input only contain lower case letter or digits
                    for(int i=0;i<word.length;i++){
                        if(Character.isLetterOrDigit(word[i])){
                        input+=Character.toLowerCase(word[i]);
                        }
                    }
                //add input to wordList and frequnecyList.  if it's duplicate input, increment frequency by 1 
                    if(wordList.add(input)){
                        frequencyList.put(input,1);
                    }
                    else{
                        frequencyList.replace(input,frequencyList.get(input)+1);
                    }
                }
        }
        public void printData()throws IOException {
            PrintWriter b= new PrintWriter("output.txt");
            Iterator <String> c = wordList.iterator();
            String d = "";
            while(c.hasNext()){
            d=c.next();
            b.println(d+" : "+frequencyList.get(d));
            }
            b.close();
            }
        public static void main(String[] args) {
        try {
        File lyrics = new File("lyrics.txt");
        Scanner read = new Scanner(lyrics);
        WordCount project = new WordCount();
        project.setData(read);
        project.printData();
        read.close();
        }catch(Exception e){
        System.out.println("file is not found");
        }
 
    }
}