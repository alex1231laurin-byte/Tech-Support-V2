TechSupport - the DodgySoft Technical support system, version #2.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.


This project implements a second version of the technical support system 
example. It is an intermediate version intended to demonstrate the first
few changes discussed in this book chapter.


To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

24: A HashMap is a reiteration of a Map and an ArrayList that is used to save and view specific things in a
saved list and to have an easier time drawing from them. It can be used to contain a collection of
Maps and has a capacity limit that causes it to stop working if the HashMap contains too much.
25: It uses an intenger and a float as its parameter. The methods that use it are containsKey, 
containsValue, size, values, entrySet and keySet. I do not think the same type could be used for both of its
parameters.
26: You either use size() or values().
28: It overrides the previous key with the new key.
29: It adds a new key with a new value.
30: You use containsKey(Object key).
31: It returns null.
32: You use a for loop that uses keySet to prevent repeating previous keys, then put print inside the for loop.
34: Both contain a list or set of objects, including but not limited to: Strings.
35: A HashSet returns a value while the ArrayList returns an element.
36: There are no problems with having more than one space between two words because it gets included inside the String. However,
if the String originally contained 1 String, you have to call it the exact same way or code a way to create a copy of the String
with the amount of space inbetween words gets reduced to 1.
43: It puts a key with the given value into the HashMap if there are no similar keys.
44: public void printWordCounts(){
        Set<String> words = counts.keySet();
        for(String word : words){
            System.out.println(word + ": " + counts.get(word));
        }
    }
45: public void printResponseMapKeys(){
        System.out.println(responseMap.keySet());
    }
46: It is accurate, but it doesn't explain what code did I use.
47: They influence the formatting of the document by changing lines and adding extra information.
48: /** starts a comment, */ end the comment, @tag will put a tag before the text, but can only be placed after the leading
asterisks, {@tag} can be place anywhere that text is allowed and certain tags do special things. For example, the @author
tag adds an "Author entry with the specified name-text tot he generated docs when the -author option is used.
