/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.common.subsequence;

/**
 *
 * @author muhaiminur
 */
public class LCS {
    int[][]array;
    String [][]direction;
    int size;
    String lcs="";
    String input;
    public String COMPUTE(String a,String b){
        input=a;
        int m=a.length();
        int n=b.length();
        array=new int[m+1][n+1];
        direction=new String[m+1][n+1];
        for (int c = 0; c <=a.length(); c++) {
            array[c][0]=0;
            //array[c][0]=0;
        }
        for (int d = 0; d <=b.length(); d++) {
            array[0][d]=0;
        }
        for (int c = 1; c <= m; c++) {
            for (int d = 1; d <= n; d++) {
                if (a.charAt(c-1)==b.charAt(d-1)) {
                    array[c][d]=array[c-1][d-1]+1;
                    direction[c][d]="diagonal";
                    
                } else {
                    if (array[c-1][d] > array[c][d-1]) {
                        array[c][d]=array[c-1][d];
                        direction[c][d]="up";
                    } else {
                        array[c][d]=array[c][d-1];
                        direction[c][d]="left";
                    }
                }
                size=array[c][d];
            }
            
        }
        result(m,n);
        print(m, n,a,b);
        return lcs;
    }
    
    
    public void result(int m,int n){
        if(m==0 || n==0){
            return;
        }else if(direction[m][n].equalsIgnoreCase("diagonal") ) {
            result(m-1, n-1);
            lcs=lcs+input.charAt(m-1);
            //System.out.print(input.charAt(m-1));
        }else if(direction[m][n].equalsIgnoreCase("up")){
            result(m-1, n);
        }else{
            result(m, n-1);
        }
        
    }
    
    
    public void print(int m,int n,String a, String b){
        
        int count=0;
        System.out.println("======PRINTING TABLE======");
        System.out.println("--------------------------");
        System.out.print("    ");
        for (int c = 0; c <b.length(); c++) {
            System.out.print(b.charAt(c)+" ");
            
        }
        System.out.println("");
        System.out.print("    ");
        for (int c = 0; c <b.length(); c++) {
            System.out.print("| ");
        }
        System.out.println("");
        for (int c = 1; c <= m; c++) {
            if (c>0) {
                System.out.print(a.charAt(c-1)+"-->");
            }
            for (int d = 1; d <= n; d++) {
                System.out.print(array[c][d]+" ");
                
            }
            System.out.println("");
        }
        
        
        System.out.println("Total LCS Size = "+size);
    }
    
}
