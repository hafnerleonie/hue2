package net.htlgkr.hafle.pos3.hue02;

public class NumberTester {
    NumberTest oddTester = number -> number % 2 == 0;
    NumberTest primeTester = number -> number == 2 || number % 2 == 1;
    NumberTest palindromeTester = number -> {
        int temp = 0;
        while (number != 0){
            int temp2 = number % 10;
            temp = temp * 10 + temp2;
            number = number / 10;
        }
        return number == temp;
    };
    String fileName;

    public NumberTester ( String fileName ) {
        this.fileName = fileName;

    }
    public void setOddEvenTester (NumberTest oddTester ) {
        this.oddTester = oddTester ;
    }

    public void setPrimeTester ( NumberTest primeTester ) {
        this.primeTester = primeTester ;
    }
    public void setPalindromeTester ( NumberTest palindromeTester ) {
        this.palindromeTester = palindromeTester ;
    }
    public void testFile ( ) {
        // TODO
    }
}
