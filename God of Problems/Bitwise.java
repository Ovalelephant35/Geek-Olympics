

// User function Template for Java

class Geeks {
    // Function to perform bitwise manipulations
    // a, b and c are input integers
    static void bitWiseOperation(int a, int b, int c) {

        System.out.println(a^a);
        System.out.println(c^b);
        System.out.println(a&b);
        System.out.println(c | (a^a));
        System.out.println(~(c^b));
        
    }
}
