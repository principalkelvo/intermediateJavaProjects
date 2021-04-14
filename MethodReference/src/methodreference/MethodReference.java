/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

/**
 *
 * @author KELVO FRAYAY
 */
public class MethodReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testMethod(str-> System.out.println(str));
    }
    
    static void testMethod(DoubleColonInterface testObjectIn){
        testObjectIn.test("Hello World");
    }
}
