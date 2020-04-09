package com.my;

import java.util.HashMap;

public class TreeNode {
    boolean word;
    HashMap<Character, TreeNode> children = new HashMap<>();

    public TreeNode get(char value) {
        // Get anode from the HashMap.
        return children.getOrDefault(value, null);
    }

    public TreeNode add(char value, TreeNode node) {
        // Add a node if one does not yet exists.
        // ... Return the matching node.
        children.putIfAbsent(value, node);
        return get(value);
    }
}