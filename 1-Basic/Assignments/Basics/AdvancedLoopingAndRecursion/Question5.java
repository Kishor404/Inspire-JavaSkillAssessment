// 5. Write a program to generate all possible subsets of a given set using recursion.

public class Question5 {
    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        generateSubsets(set, 0, new int[0]);
    }

    static void generateSubsets(int[] set, int index, int[] current) {
        if (index == set.length) {
            System.out.print("{ ");
            for (int n : current)
                System.out.print(n + " ");
            System.out.println("}");
            return;
        }

        int[] include = new int[current.length + 1];
        System.arraycopy(current, 0, include, 0, current.length);
        include[current.length] = set[index];
        generateSubsets(set, index + 1, include);

        generateSubsets(set, index + 1, current);
    }
}
