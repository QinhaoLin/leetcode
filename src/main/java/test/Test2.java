package test;

import java.util.HashMap;

public class Test2 {
//    public static void main(String[] args) {
//        String idStr = "593169411003";// 20656491002
//        Integer contentId = Integer.valueOf(idStr);
//        System.out.println("contentId = " + contentId);
//    }

    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("appid", "wx8a4158ce6c849245");
//        map.put("appid", "wx56508ef28ddbf268");
////        map.put("secret", "dd5c7053ddf667c8a553f020115321c6");
//        // accessToken = {"errcode":40125,"errmsg":"invalid appsecret rid: 685f7eeb-22bca0f5-0cee65f0"}
//        map.put("secret", "ffe997a2d8451f54a09b83f34660a86e");
//        map.put("secret", "a797d0620b548a47b9bfa8159f0ba38a");
//        map.put("grant_type", "client_credential");
////        String accessToken = (String) JSONObject.parseObject(Https.get(WechatConstants.GET_TOKEN_URL, map)
////                .getContent(), JSONObject.class).get("access_token");
//        String s = HttpUtil.get("https://api.weixin.qq.com/cgi-bin/token", map);
//        System.out.println("accessToken = " + s);

        // signature:[6bb3cdb6d4c60f17b7d539e1650239d3792ec2d1],
        // timestamp:[1751281357],
        // nonce:[545060754],
        // apiToken:[kU3sX6bF1cO0gW3tD6pI5pX3lL7cO6zU],
        // tmpStr:[6BB3CDB6D4C60F17B7D539E1650239D3792EC2D1]
//        String signature = "6bb3cdb6d4c60f17b7d539e1650239d3792ec2d1";
//        String tmpStr = "6BB3CDB6D4C60F17B7D539E1650239D3792EC2D1";
//        boolean b = signature.equalsIgnoreCase(tmpStr);
//        System.out.println("b = " + b);
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.toString();
        System.out.println("string = " + string.equals(""));

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        System.out.println("map = " + map);

        // 注释1
        // 注释2
        // 注释3
        // 注释4
        // 注释5
    }


}
