@FunctionalInterface 
interface MyInterface {
    String func(String str);
}

class Assignment1 {
    // Write a Lambda expression that accepts a String, 
    // converts it to Title Case and returns it.
    public static void main(String args[]) {
        MyInterface mi = (str) -> {
            String s[] = str.split(" ");
            String titleCase = new String();
            for(String x : s)
                titleCase += x.trim().substring(0,1).toUpperCase() 
                + x.trim().substring(1).toLowerCase() + " ";
            return titleCase;    
        };
        System.out.println(mi.func("This is a new world"));
    }
}

/* 
Write Lambda expressions for the following cases:
a. Convert string to title case.
b. Convert string to camel case.
c. Remove spaces from string.
d. Count number of vowels in a string.
e. Count number of consonants in a string
f. Count number of alphabets in a string
g. Count number of words in a string

Before you start the code, think on the following points:
a. Identify the data types of ins' and outs' for the above cases.
b. How many functional interfaces are required?
c. Can we use Generics and reduce the number of functional interfaces?
*/