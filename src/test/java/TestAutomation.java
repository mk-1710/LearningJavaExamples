import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomation {

    @Test
    public void testInts() {
        //integer examples
        int myInt1 = 5;
        int result = myInt1 - 2;

        System.out.println("myInt1: " + myInt1);
        System.out.println("result: " + result);

        Assert.assertEquals(result, 2);

    }
public int minusTwo(int par){
    int result = par - 2;
    return result;
}
    @Test
    public void testFloat() {
        //float examples

        float myFloat = 5.604f;
        float result = myFloat - 0.601f;

        System.out.println(myFloat);
        System.out.println(result);

        Assert.assertEquals(result, 5.003f);
    }

    @Test
    public void testDouble() {
        //double examples

        double myDouble = 5.604;
        double result = myDouble - 0.601;

        System.out.println(myDouble);
        System.out.println(result);

        Assert.assertEquals(result, 5.003);
    }

    @Test
    public void testStrings() {
        String myString1 = "This is my string";
        String myString2 = "This is my string";

        String myString3 = new String("This is object string");
        String myString4 = new String("This is object string");

        Assert.assertEquals(myString1, myString2);
        Assert.assertEquals(myString3, myString4);

        if (myString3 == myString4) {
            System.out.println("strings are the same");
        }else {
            System.out.println("strings aren't the same");
        }

    }

    @Test
    public void testConcatenateTwoStrings() {
        String strOne="Hi there";
        String strTwo = "Let's meet New Year!";

        String results = concatenateAndPrint(strOne,strTwo);
        Assert.assertEquals(results, "Hi there Let's meet New Year!");
    }

    public String concatenateAndPrint(String stringOne, String stringTwo){
        String result = "";

        result = stringOne + " " + stringTwo;
        System.out.println(result);

        return result;
    }


    @Test
    public void testLearningPrimitivesExample() {

        //Create all of the primitives (except long and double)
        // with different values.
        // Concatenate them into a string and print it to the screen
        // so it will print: H3110 w0r1d 2.0 true

        char ch1 = 'H';
        int int1 = 3110;
        char ch2 = 'w';
        int int2 = 0;
        char ch3 = 'r';
        int int3 = 1;
        char ch4 = 'd';
        float fl1 = 2.0f;
        boolean bool1 = true;

        String myText = "" + ch1 + int1 + " " + ch2 + int2 + ch3 + int3 + ch4 + " " + fl1 + " " + bool1;
        System.out.println(myText);
    }

    @Test
    public void testConditionals() {
        int a = 4;
        int b = 5;
        boolean result;
//        result = a < b; // true
//        result = a > b; // false
//        result = a <= 4; // a smaller or equal to 4 - true
//        result = b >= 6; // b bigger or equal to 6 - false
//        result = a == b; // a equal to b - false
//        result = a != b; // a is not equal to b - true
//        result = a > b || a < b; // Logical or - true
//        result = 3 < a && a < 6; // Logical and - true
//        result = !result; // Logical not - false
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b? Answer: " + (a < b ? false:true));
        System.out.println("a > b? Answer: " + (a > b ? true:false));
        System.out.println("a <= 4? Answer: " + (a <= 4 ? true:false));
        System.out.println("b >= 6? Answer: " + (b >= 6 ? true:false));
    }

    @Test
    public void testBooleanOperators() {
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("a && b " + (isTrue && isFalse));
        System.out.println("a || b " + (isTrue || isFalse));
        System.out.println("!a " + (!isTrue));
    }

    @Test
    public void testArrays() {
        int[] intArray;
        intArray = new int[10];
        for(int i = 0; i < 10; i++){
            intArray[i] = i * 2;
        }

        int[] intArray1 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] intArray1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 10; i++){
            //System.out.println(intArray[i]);
            System.out.println(intArray1[i]);
        }
    }

    @Test
    public void testLoops() {
//        //simple loop
//        System.out.println("***** simple loop");
//        for (int i = 1; i<6; i++){
//            System.out.println("i = " + i);
//        }
//
//        System.out.println("***** loop variant 1");
//        //loop variant 1
//        boolean isVisible = true;
//
//        for (int j = 0; isVisible; j++){
//            if (j > 5) isVisible = false;
//            System.out.println("j = " + j);
//        }
//
//        System.out.println("***** loop variant 2");
//        //loop variant 2
//        for (int k = 0; true; k++){
//            System.out.println("k = " + k);
//            if (k > 5) break;
//        }
//
//        System.out.println("***** loop variant 3");
//        //loop variant 3
//        for (int l = 0; l < 10; l++){
//            if (l == 5) {
//                System.out.println("this is a gap");
//                continue;
//            }
//            System.out.println("l = " + l);
//        }

//        //loop variant 4
//        System.out.println("***** loop variant 4");
//        int i = 5;
//        int j = 1;
//        while (j < i) {
//            System.out.println("step # " + j);
//            j++;
//        }

//        //loop variant 5
//        System.out.println("***** loop variant 5");
//        int i = 5, j = 5;
//        int st = 1;
//        do {
//            System.out.println("step # " + st);
//            st++;
//        }while (j < i);

//        //loop variant 6
//        System.out.println("***** loop variant 6");
//        int[] myArray = {2, 4, 5, 6};
//        for (int el: myArray) {
//            System.out.println("element value " + el);
//        }

//        //loop variant 7
//        System.out.println("***** loop variant 7");
//        int[] myArray = new int[10];
//
//        for(int i = 0; i<10; i++){
//           myArray[i] = i*10;
//        }
//
//        for (int el: myArray) {
//            System.out.println("element value " + el);
//        }

//        //loop variant 8
//        System.out.println("***** loop variant 8");
//        String[] myArray = new String[10];
//
//        for(int i = 0; i<10; i++){
//            myArray[i] = "element " + i;
//        }
//
//        for (String el: myArray) {
//            System.out.println("element value '" + el +"'");
//        }

        //exercise
        //Loop through and print out all even numbers,
        // each in a separate line, from the numbers list
        // in the same order they are received.
        // Don't print any numbers that come after 237 in the sequence.

        int[] myArray = new int[255];
        for(int i = 0; i<255; i++){
            myArray[i] = i;
        }

        for (int el:
                myArray) {
            if (el >=237) break;
            if (el%2 == 0) {
                System.out.println("even number: " + el);
            }
        }
    }

}
