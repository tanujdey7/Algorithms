public class unionFind {
    private int[] id;

    public unionFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        unionFind find = new unionFind(5);
        System.out.println(find.connected(1, 2));
        find.union(1, 2);
        System.out.println(find.connected(1, 2));
        find.union(1, 4);
        System.out.println(find.connected(1, 4));
        System.out.println(find.connected(4, 2));
    }
}

//union operator is expensive (time consuming)  It is quadratic time algorithm