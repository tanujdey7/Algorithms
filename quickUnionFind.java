public class quickUnionFind {
    private int[] id;
    public quickUnionFind(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }
    public int root(int i) {
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    public static void main(String[] args) {
        quickUnionFind find = new quickUnionFind(10);
        System.out.println(find.connected(5,1));
        find.union(5, 1);
        System.out.println(find.connected(5,1));
        System.out.println(find.connected(4,5));
        find.union(4, 1);
        System.out.println(find.connected(4,5));
    }
}