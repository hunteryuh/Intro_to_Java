//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substring of word, sorted by length.

//For example, if the user provides the input "rum", the method returns a
//string that will print like this
//r
//u
//m
//ru
//um
//rum


//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 5 - Question 3" for some tips on 
// how to begin.

public class Word
{
    private String string;

    public Word(String string){
        this.string = string;
    }
    //TODO write the constructor and define the instance variable

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */
    public String getSubstrings()
    {
       //TODO implement this method
       //Word word = new Word(string);
       int size = string.length();
       String result="";
       for (int x =0; x<size;x++){
           for (int i = 0; i<size-x;i++){
               result = result + string.substring(i,i+x+1)+"\n";
           }
         //for (int j = 0; j< size -1;j++) {
           //result = result + string.substring(j,j+2)+ "\n";
       }
       return result;
    }
}

