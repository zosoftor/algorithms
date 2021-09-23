//I figured it would be better to show how to work with Java's built-in hashtable class, rather than implementing a raw
//hashtable program to show a deep understanding of the internals.  This way I know how to use hashtables when I need
//them in my software.

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// making a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        //loading the hash table with key/value pairs
        balance.put("Zeke", new Double(3434.34));
        balance.put("Karla", new Double(123.22));
        balance.put("Chloe", new Double(1378.80));
        balance.put("Zac", new Double(234523.23));
        balance.put("Delta", new Double(4232.11));

        //show all balances in hash table
        names = balance.keys();

        while(names.hasMoreELements()){
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        //Deposit 1,000 into Zeke's account
        bal = ((Double)balance.get("Zeke")).doubleValue();
        balance.put("Zeke", new Double(bal + 1000));
        System.out.println("Zeke's new balance: " + balance.get("Zeke"));
    }
}
