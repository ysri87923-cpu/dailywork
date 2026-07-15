class Solution {
    public int passThePillow(int n, int time) {
        int cycle = time % (n - 1);
        int laps = time / (n - 1);
        return (laps % 2 == 0) ? 1 + cycle : n - cycle;
    }
}