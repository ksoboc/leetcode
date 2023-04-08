package Common;

import java.util.*;

public class GraphUtil {
    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    };
    // A method to create a node with a given value
    public static Node createNode(int val) {
        return new Node(val);
    }

    // A method to create a graph from an adjacency list
    public static Node createGraph(int[][] adjList) {
        // A map to store the nodes by their values
        Map<Integer, Node> map = new HashMap<>();

        // A node to store the root of the graph
        Node root = null;

        // Loop through the adjacency list
        for (int i = 0; i < adjList.length; i++) {
            // Get the value and the neighbors of the current node
            int val = i + 1; // Assume the value is the same as the index (1-indexed)
            int[] neighbors = adjList[i];

            // Create a node with the value if it does not exist in the map
            if (!map.containsKey(val)) {
                map.put(val, createNode(val));
            }

            // Get the node from the map
            Node node = map.get(val);

            // Set the root to the first node
            if (i == 0) {
                root = node;
            }

            // Loop through the neighbors and add them to the node's list
            for (int n : neighbors) {
                // Create a node with the neighbor value if it does not exist in the map
                if (!map.containsKey(n)) {
                    map.put(n, createNode(n));
                }

                // Get the neighbor node from the map
                Node neighbor = map.get(n);

                // Add the neighbor to the node's list
                node.neighbors.add(neighbor);
            }
        }

        // Return the root of the graph
        return root;
    }

    // A method to convert a graph to an adjacency list
    public static int[][] convertGraph(Node root) {
        // A list to store the adjacency list
        List<int[]> adjList = new ArrayList<>();

        // A queue to store the nodes to visit
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));

        // A set to store the visited nodes
        Set<Node> visited = new HashSet<>();

        // A map to store the indices of the nodes by their values
        Map<Integer, Integer> indices = new HashMap<>();

        // A variable to store the current index
        int index = 1;

        // Add the root to the queue and mark it as visited
        queue.offer(root);
        visited.add(root);

        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Poll a node from the queue
            Node node = queue.poll();

            // Get its value and neighbors
            int val = node.val;
            List<Node> neighbors = node.neighbors;

            // Store its index in the map
            indices.put(val, index);

            // Create an array to store its neighbors' values
            int[] arr = new int[neighbors.size()];

            // Loop through the neighbors and fill the array
            for (int i = 0; i < neighbors.size(); i++) {
                Node neighbor = neighbors.get(i);
                arr[i] = neighbor.val;
            }

            // Add the array to the adjacency list
            adjList.add(arr);

            // Increment the index
            index++;

            // Add its unvisited neighbors to the queue and mark them as visited
            for (Node neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        // Create an array to store the final adjacency list
        int[][] result = new int[adjList.size()][];

        // Loop through the adjacency list and sort each array by the indices of the values
        for (int i = 0; i < adjList.size(); i++) {
            int[] arr = adjList.get(i);
            //Arrays.sort(arr, (a, b) -> indices.get(a) - indices.get(b));
            int[] sortedArr = Arrays.stream(arr).boxed().sorted((a, b) -> indices.get(a) - indices.get(b)).mapToInt(id->id).toArray();
            result[i] = sortedArr;
        }

        // Return the result
        return result;
    }


    // A method to print the graph in a BFS manner
    public static void printGraph(Node root) {
        // A queue to store the nodes to visit
        Queue<Node> queue = new LinkedList<>();

        // A set to store the visited nodes
        Set<Node> visited = new HashSet<>();

        // Add the root to the queue and mark it as visited
        queue.offer(root);
        visited.add(root);

        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Poll a node from the queue
            Node node = queue.poll();

            // Print its value and neighbors
            System.out.print(node.val + ": ");
            for (Node neighbor : node.neighbors) {
                System.out.print(neighbor.val + " ");
            }
            System.out.println();

            // Add its unvisited neighbors to the queue and mark them as visited
            for (Node neighbor : node.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

}
