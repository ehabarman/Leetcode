package medium;

public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        return canJump(nums, 0, visited);
    }

    private boolean canJump(int[] nums, int index, boolean[] visited) {
        if(index >= nums.length) return false;
        if(index == nums.length - 1) return true;
        if(visited[index]) return false;
        visited[index] = true;
        for(int i = 1; i <= nums[index]; i++) {
            if (canJump(nums, index + i, visited)) return true;
        }
        return false;
    }

}
