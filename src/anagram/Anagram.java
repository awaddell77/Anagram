/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.HashMap;

/**
 *
 * @author awaddell
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String testStr = "cinema";
        String testStr2 = "iceman";
        HashMap res = splitChars(testStr2);
        System.out.println(res.toString());
        boolean result = checkAnagram(testStr, testStr2);
        if (result){
            System.out.println(testStr + " is an anagram for " + testStr2);
            
        }
        else{
            System.out.println(testStr + " is not an anagram for " + testStr2);
        }
    }
    public static HashMap<Character, Integer> splitChars(String str){
        HashMap<Character, Integer> tempHash = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            if (tempHash.containsKey(str.charAt(i))){
                tempHash.put(str.charAt(i), tempHash.get(str.charAt(i)) + 1);
            }
            else{
                tempHash.put(str.charAt(i), 1);
                
            }
            
        }
        return tempHash;
    }
    public static boolean checkAnagram(String str, String str2){
        HashMap strHash = splitChars(str);
        HashMap str2Hash = splitChars(str2);
        return strHash.equals(str2Hash);
    }
    
}
