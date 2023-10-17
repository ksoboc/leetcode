package ValidateBinaryTreeNodes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        UF uf = new UF(n);

        for (int i = 0; i < n; i++) {
            int[] children = {leftChild[i],rightChild[i]};

            for (var child:children) {
                if (child==-1)
                    continue;
                // this child has already a parent
                if (uf.find(child)>i)
                    return false;

                if(!uf.union(i,child))
                    return false;

            }

        }

        return uf.getNrGroups()==1;

    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\U104712\\workspace\\leetcode\\src\\ValidateBinaryTreeNodes\\test_case.txt"));) {
            String line = br.readLine();
            int n = Integer.parseInt(line);
            line = br.readLine();

            line=line.substring(1,line.length()-1);
            String[] values = line.split(",");
            int[] leftChild = new int[n];
            int i=0;
            for (var v:values) {
                leftChild[i++]=Integer.parseInt(v);
            }

            line = br.readLine();
            line=line.substring(1,line.length()-1);
            values = line.split(",");
            int[] rightChild = new int[n];
            i=0;
            for (var v:values) {
                rightChild[i++]=Integer.parseInt(v);
            }
            Solution solution=new Solution();
            var res = solution.validateBinaryTreeNodes(n,leftChild,rightChild);
            System.out.println("res = " + res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class UF {
    private int nrGroups;
    private int[] parent;
    private int[] size;

    public UF(int n) {
        nrGroups=n;
        parent=new int[n];
        size=new int[n];
        for (int i = 0; i < n; i++) {
            parent[i]=i;
            size[i]=1;

        }
    }

    public int find(int x) {
        while (parent[x]!=x) {
            int tmp=x;
            x=parent[x];
            parent[tmp]=x;
        }
        return x;
    }

    public boolean union(int x, int y) {
        int fx=find(x);
        int fy=find(y);
        if (fx==fy)
            return false;
        if (size[fx]>=size[fy]) {
            size[fx]+=size[fy];
            parent[fy]=fx;
        } else {
            size[fy]+=size[fx];
            parent[fx]=fy;

        }
        --nrGroups;
        return true;
    }

    public int getNrGroups() {
        return nrGroups;
    }
}

class UF2 {
    private int nrGroups;
    private int[] parent;

    public UF2(int n) {
        nrGroups=n;
        parent=new int[n];
        for (int i = 0; i < n; i++) {
            parent[i]=i;

        }
    }

    public int find(int x) {
        while (parent[x]!=x) {
            int tmp=x;
            x=parent[x];
            parent[tmp]=x;
        }
        return x;
    }

    public boolean union(int parent, int child) {
        int fx=find(parent);
        int fy=find(child);
        if (fx==fy )
            return false;
        this.parent[fy]=fx;
        --nrGroups;
        return true;
    }

    public int getNrGroups() {
        return nrGroups;
    }
}
