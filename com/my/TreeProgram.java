package com.my;

public class TreeProgram {

    static TreeNode root = new TreeNode();

    static void addDay(String value) {
        // Add all characters from the string to the tree.
        TreeNode node = root;
        for (int i = 0; i < value.length(); i++) {
            node = node.add(value.charAt(i), node);
        }
        node.word = true;
    }

    static boolean exists(String value) {
        // See if a word exists in the tree.
        TreeNode node = root;
        for (int i = 0; i < value.length(); i++) {
            node = node.get(value.charAt(i));
            if (node == null) {
                return false;
            }
        }
        return node.word;
    }

    public static void main(String[] args) 
    {
        // Lets Add three days to our tree.
        addDay("Monday");
        addDay("Tuesday");
        addDay("Wednesday");

        // These three days should be present.
        boolean dayexists1 = exists("Monday");
        boolean dayexists2 = exists("Tuesday");
        boolean dayexists3 = exists("Wednesday");
        
        System.out.println(dayexists1);
        System.out.println(dayexists2);
        System.out.println(dayexists3);

        // These days do not exist.
        dayexists1 = exists("Thu");
        dayexists2 = exists("Fri");
        dayexists3 = exists("Sat");
        
        System.out.println(dayexists1);
        System.out.println(dayexists2);
        System.out.println(dayexists3);
    }
}
