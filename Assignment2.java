class MyStringOps {
    public static String toTitleCase(String str) {
            String s[] = str.split(" ");
            String titleCase = new String();
            for(String x : s)
                titleCase += x.trim().substring(0,1).toUpperCase() 
                + x.trim().substring(1).toLowerCase() + " ";
            return titleCase;    
        }
}

@FunctionalInterface 
interface MyInterface<I, O> {
    O func(I i);
}

class Assignment2 {
    // Write a Lambda expression that accepts a String, 
    // converts it to Title Case and returns it.
    public static void main(String args[]) {
        MyInterface<String, String> mi = MyStringOps::toTitleCase;
        System.out.println(mi.func("This is a new world"));
    }
}

/* 
Write method references for the following cases:
a. Convert string to title case.
b. Convert string to camel case.
c. Remove spaces from string.
d. Count number of vowels in a string.
e. Count number of consonants in a string
f. Count number of alphabets in a string
g. Count number of words in a string

*/