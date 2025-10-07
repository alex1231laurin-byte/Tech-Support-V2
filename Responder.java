import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author   Michael Kölling and David J. Barnes
 * @version 7.2
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    private HashMap<String, String> responsesMap;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        responsesMap = new HashMap<>();
        fillResponses();
        fillResponsesMap();
    }
    
    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponseFromHashSet(HashSet<String> words){
        for (String word : words) {
             String answer = responsesMap.get(word);
            if(answer!=null){
                return answer;
            } 
        }
        return pickDefaultResponse();
    }
    
    
    private String pickDefaultResponse(){
        return "This is the default response.";
    }

    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponseFromArray(){
        int number2 = randomGenerator.nextInt(responses.size());
        String response = responses.get(number2);
        return response;
    }

    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillResponses()
    {
        responses.add("That sounds odd. Could you describe this in more detail?");
        responses.add("""
                      No other customer has ever complained about this before.
                      What is your system configuration?
                      """);
        responses.add("I need a bit more information on that.");
        responses.add("Have you checked that you do not have a dll conflict?");
        responses.add("That is covered in the manual. Have you read the manual?");
        responses.add("""
                      Your description is a bit wishy-washy. Have you got an expert
                      there with you who could describe this more precisely?
                      """);
        responses.add("That's not a bug, it's a feature!");
        responses.add("Could you elaborate on that?");
        responses.add("Have you tried running the app on your phone?");
        responses.add("I just checked StackOverflow - they don't know either.");
    }
    private void fillResponsesMap()
    {
        responsesMap.put("issue","That sounds odd. Could you describe this in more detail?");
        responsesMap.put("configuration","""
                      No other customer has ever complained about this before.
                      What is your system configuration?
                      """);
        responsesMap.put("trouble","I need a bit more information on that.");
        responsesMap.put("windows","Have you checked that you do not have a dll conflict?");
        responsesMap.put("documentation","That is covered in the manual. Have you read the manual?");
        responsesMap.put("friend","""
                      Your description is a bit wishy-washy. Have you got an expert
                      there with you who could describe this more precisely?
                      """);
        responsesMap.put("broken","That's not a bug, it's a feature!");
        responsesMap.put("nightmare","Could you elaborate on that?");
        responsesMap.put("tablet","Have you tried running the app on your phone?");
        responsesMap.put("online","I just checked StackOverflow - they don't know either.");
    }
}

