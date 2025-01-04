class Strings
{
    public static void main(String args[])
    {
        String str = "Ansh";    //Immutable(can't change) -> Execution fast  as if str1-> ansh and str2->ansh 
        //it doesn't allocate new memory to str2 it refer str2 to same location of str1,
        // that's why if str1 get changes the what will happen to str2 that's why string is immutable.

        String str2 = str.concat(" Shori");
        System.out.println(str);
        System.out.println(str2);
    }
}