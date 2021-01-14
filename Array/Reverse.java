class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String reverse1 = "";
        for(int i=str.length()-1;i>=0;i--)
        reverse1+=str.charAt(i);
        return reverse1;
    }
}

//write driver code