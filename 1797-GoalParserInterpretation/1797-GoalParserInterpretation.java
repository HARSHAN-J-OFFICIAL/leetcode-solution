// Last updated: 5/25/2026, 11:14:48 AM
class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        return command.replace("(al)","al");
    }
}