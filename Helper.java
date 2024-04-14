
public class Helper {
    private static String objectName = "";
    private static String processOrder(String order) {
        order = order.substring(1,order.length()-1);
        if(order.charAt(0) >= 'A' && order.charAt(0) <='Z') {
            objectName = (char)(order.charAt(0)-'A'+'a') + order.substring(1);
            return order + " " + objectName + " = new " + order + "();";
        }
        return objectName + "." + order + "(";
    }
    private static String[] processOrders(String orderStr) {
        String[] orders = orderStr.split(",");
        for(int i=0;i<orders.length;i++) {
            orders[i] = processOrder(orders[i]);
        }
        return orders;
    }
    private static String[] processNums(String numStr) {
        String[] nums = numStr.split(",");
        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i].substring(1,nums[i].length()-1);
        }
        return nums;
    }
    public static void main(String[] args) {
        String orderStr = "\"MyHashSet\",\"contains\",\"add\",\"contains\",\"add\",\"add\",\"add\",\"remove\",\"contains\",\"contains\",\"add\",\"contains\",\"add\",\"remove\",\"add\",\"remove\",\"contains\",\"add\",\"add\",\"contains\",\"contains\",\"add\",\"contains\",\"add\",\"add\",\"add\",\"contains\",\"remove\",\"contains\",\"contains\",\"add\",\"add\",\"contains\",\"add\",\"add\",\"add\",\"add\",\"add\",\"add\",\"add\",\"remove\",\"add\",\"add\",\"add\",\"add\",\"remove\",\"add\",\"add\",\"add\",\"add\",\"contains\",\"remove\",\"add\",\"contains\",\"add\",\"contains\",\"remove\",\"add\",\"add\",\"add\",\"add\",\"add\",\"contains\",\"contains\",\"add\",\"add\",\"add\",\"contains\",\"add\",\"add\",\"add\",\"contains\",\"add\",\"remove\",\"contains\",\"add\",\"contains\",\"add\",\"add\",\"remove\",\"add\",\"add\",\"contains\",\"remove\",\"add\",\"remove\",\"add\",\"add\",\"add\",\"add\",\"contains\",\"add\",\"add\",\"add\",\"remove\",\"add\",\"add\",\"remove\",\"remove\",\"contains\",\"contains\"";
        String numStr = "[],[59],[59],[59],[63],[67],[90],[67],[63],[54],[84],[26],[5],[35],[85],[33],[85],[72],[86],[72],[84],[78],[89],[55],[91],[66],[55],[86],[72],[84],[70],[3],[85],[54],[76],[61],[24],[32],[87],[4],[86],[90],[2],[2],[74],[68],[58],[70],[25],[55],[63],[92],[16],[43],[43],[72],[27],[3],[24],[43],[46],[90],[48],[97],[15],[77],[56],[35],[6],[47],[72],[68],[27],[84],[84],[0],[90],[38],[9],[29],[54],[72],[84],[7],[81],[63],[52],[76],[82],[10],[74],[75],[50],[48],[13],[24],[15],[3],[32],[39],[39]";
        String[] orders = processOrders(orderStr);
        String[] nums = processNums(numStr);
        for(int i=0;i<orders.length;i++) {
            System.out.print(orders[i]);
            if(!nums[i].equals("")) {
                System.out.print(nums[i]);
                System.out.print(");");
            }
            System.out.println();
        }
    }
}
