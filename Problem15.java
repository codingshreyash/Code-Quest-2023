import java.util.*;

public class Problem15 {
    private static int[] nums;
    private static int index;
    private static int[][] tree;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numTestCases; i++) {
            String[] input = scanner.nextLine().split(" ");
            int n = (int) (Math.log(input.length + 1) / Math.log(2));
            nums = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                nums[j] = Integer.parseInt(input[j]);
            }
            index = 0;
            tree = new int[n][];
            for (int j = 0; j < n; j++) {
                int numNodes = (int) Math.pow(2, j);
                tree[j] = new int[numNodes];
                for (int k = 0; k < numNodes; k++) {
                    tree[j][k] = nums[index++];
                }
            }
            printTree(tree);
        }
        
        scanner.close();
    }
    
    private static void printTree(int[][] tree) {
        int n = tree.length;
        int maxWidth = (int) Math.pow(2, n) - 1;
        int nodeWidth = 3;
        
        for (int i = 0; i < n; i++) {
            int levelWidth = (int) Math.pow(2, i) - 1;
            int leftSpace = (maxWidth - levelWidth) * nodeWidth / 2;
            for (int j = 0; j < levelWidth; j++) {
                int node = tree[i][j];
                System.out.printf("%" + nodeWidth + "d", node);
                if (j < levelWidth - 1) {
                    int rightSpace = (maxWidth - levelWidth + 2 * j + 1) * nodeWidth / 2;
                    System.out.print(" ".repeat(rightSpace));
                }
            }
            System.out.println();
            if (i < n - 1) {
                int connectorWidth = (maxWidth - levelWidth + 1) * nodeWidth / 2;
                int leftConnector = leftSpace + nodeWidth / 2;
                int rightConnector = leftConnector + connectorWidth - 1;
                System.out.print(" ".repeat(leftConnector));
                //System.out.print("/" + " ".repeat(connectorWidth - 2) + "\\");
                System.out.println(" ".repeat(rightConnector - maxWidth));
            }
        }
    }
}
