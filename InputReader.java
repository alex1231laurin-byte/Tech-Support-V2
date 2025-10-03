import java.util.Scanner;
import java.util.HashSet;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words, and a set of words 
 * is provided.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class InputReader
{
    private Scanner reader;
    private HashSet<String> wordSet;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        HashSet<String> wordSet = new HashSet<>();
        reader = new Scanner(System.in);
        wordSet.add("one");
        wordSet.add("two");
        wordSet.add("three");
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        // print prompt
        System.out.print("> ");         
        String inputLine = reader.nextLine();

        return inputLine;
    }
}
