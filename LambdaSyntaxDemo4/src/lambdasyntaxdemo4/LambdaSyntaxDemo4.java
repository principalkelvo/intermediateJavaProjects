/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdasyntaxdemo4;

/**
 *
 * @author KELVO FRAYAY
 */
public class LambdaSyntaxDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testMethod((int x,int y)-> System.out.println("The sum is "+(x+y)));
        //or
        TestInterface t =(int x,int y)->System.out.println("The sum is "+(x+y));
        testMethod(t);
    }
    
    static void testMethod(TestInterface testObjectIn){
        testObjectIn.test(10, 5);
    }
}
