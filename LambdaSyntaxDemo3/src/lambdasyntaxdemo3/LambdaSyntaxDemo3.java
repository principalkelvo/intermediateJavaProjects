/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdasyntaxdemo3;

/**
 *
 * @author KELVO FRAYAY
 */
public class LambdaSyntaxDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testMethod(str -> {
            str = "Hello " + str;
            return str;
        });
    }
    
    static void testMethod(TestInterface testObjectIn){
        String output = testObjectIn.test("World");//test now requires a String argument
        System.out.println(output);
    }
}
