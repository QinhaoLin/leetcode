package showmebug.t5652;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class T5652 {
    public static void main(String[] args) {

    }

    /**
     * 返回一个 Map，Key 是用户ID，Value 是该用户的总订单数。
     *
     * @param orders
     * @return
     */
    public Map<String, Integer> countOrdersPerUser(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getUserId, Collectors.summingInt(e -> 1)));
    }

    /**
     * 返回一个 Map，Key 是用户ID，Value 是该用户的总消费金额。
     *
     * @param orders
     * @return
     */
    public Map<String, Double> totalAmountPerUser(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getUserId, Collectors.summingDouble(Order::getAmount)));
    }

    /**
     * 返回消费金额最高的用户ID。
     *
     * @param orders
     * @return
     */
    public String findHighestSpendingUser(List<Order> orders) {
        return totalAmountPerUser(orders).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    /**
     * 返回订单数量最多的用户ID。
     *
     * @param orders
     * @return
     */
    public String findMostActiveUser(List<Order> orders) {
        return countOrdersPerUser(orders).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    /**
     * 返回指定用户的所有订单。
     *
     * @param orders
     * @param userId
     * @return
     */
    public List<Order> getOrdersOfUser(List<Order> orders, String userId) {
        return orders.stream()
                .filter(order -> order.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
