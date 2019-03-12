/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.common.subsequence;

import java.util.Scanner;

/**
 *
 * @author ITCLANBD
 */
public class LongestCommonSubsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abir = new Scanner(System.in);
        System.out.println("Enter your first String");
        //String a=abir.nextLine();
        String aa = "abaab";
        String a0 = "abbsbkdsbba";

        System.out.println("Enter your Second String");
        //String b=abir.nextLine();
        String bb = "abab";
        String b0 = "abbbdsofakssa";
        LCS l = new LCS();
        l.COMPUTE(a0, b0);
        //System.out.println("===="+l.COMPUTE(a0, b0)+"===");
        System.out.println(l.lcs);
    }

}
