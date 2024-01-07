package anagram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class anagram_solver
{
  static int size;
  static int count;
  static char[] charArray;
  static char[] words;
  //static String str;

  public static void main(String[] args) throws IOException
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type the path of the dictionary to read from : ");
    String fileName = sc.nextLine();
    List<String> dictionary = new ArrayList<String>();

    BufferedReader br = null;    
    try
    {
      br = new  BufferedReader(new FileReader(fileName));
      String word;

      while((word = br.readLine())!= null)
      {
          dictionary.add(word);
      }
    }
    catch(IOException e)
     {
      e.printStackTrace();

    }

    String[] words = new String[dictionary.size()];

    dictionary.toArray(words);
    
    System.out.println("Enter the phrase to scramble: ");

    String input = sc.nextLine();
    System.out.println();
    size = input.length();
    count = 0;
    charArray = new char[size];
    for (int j = 0; j < size; j++)
      charArray[j] = input.charAt(j);
    doAnagram(size);
  }
 public static void doAnagram(int newSize)
  {
    if (newSize == 1) // if too small, return;
      return;
    for (int i = 0; i < newSize; i++)
    {
      doAnagram(newSize - 1);
      if (newSize == 2)// if innermost,
              printAnagrams();
      rotate(newSize);
    }
  } 
  public static void rotate(int newSize)
  {
    int i;
    int position = size - newSize;
    char temp = charArray[position];
    for (i = position + 1; i < size; i++)
      charArray[i-1] = charArray[i];
    charArray[i-1] = temp;
  }

  public static void printAnagrams()
  {
       
    for (int i = 0; i < size; i++)
    {        
        System.out.print(charArray[i]);
    }
    System.out.println();
  }
}
