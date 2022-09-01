package SearchSuggestionsSystem;

import java.util.*;

public class Solution {
    public List<List<String>> suggestedProductsNC(String[] products, String searchWord) {
        Arrays.sort(products);
        int l = 0;
        int r = products.length - 1;
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < searchWord.length(); i++) {
            char ch = searchWord.charAt(i);

            while (l <= r && (products[l].length() < i || products[l].charAt(i) != ch))
                ++l;

            while (l <= r && (products[r].length() < i || products[r].charAt(i) != ch))
                --r;

            int size = r - l + 1;
            List<String> list = new ArrayList<>();
            for (int j = 0; j < Math.min(3, size); j++) {
                list.add(products[l + j]);
            }
            res.add(list);
        }
        return res;
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = new TrieNode();
        for (String product: products) insert(root, product);

        List<List<String>> results = new ArrayList<>();
        for (char c: searchWord.toCharArray()) {
            if ((root = root.children[c - 'a']) == null) break;
            results.add(root.getTopThree());
        }

        while (results.size() < searchWord.length())
            results.add(new ArrayList<>());
        return results;
    }

    private void insert(TrieNode root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null)
                root.children[c - 'a'] = new TrieNode();
            root = root.children[c - 'a'];
            root.addToPQ(word);
        }
    }
}

class TrieNode {
    public TrieNode[] children;
    public PriorityQueue<String> pq;

    public TrieNode() {
        children = new TrieNode[26];
        pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
    }

    public void addToPQ(String word) {
        pq.add(word);
        if (pq.size() > 3) pq.poll();
    }

    public List<String> getTopThree() {
        List<String> topThree = new ArrayList<>();
        while (!pq.isEmpty()) topThree.add(pq.poll());
        Collections.reverse(topThree);
        return topThree;
    }
}
