package Questions;

public class wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,21,3},{4,15,6},{7,8,19}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0,wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
            wealth=0;
        }
        return maxWealth;
    }
}
