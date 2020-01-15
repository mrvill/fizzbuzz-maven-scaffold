/**
 * @author created by wangwei
 * @date 2020年1月15日---下午7:39:28
 * @action
 */
public class FizzBuzz {

    public String fiz(int i) {
        String str = "";
        if (0 == i % 3) {
            str += "Fizz";
        }
        if (0 == i % 5) {
            str += "Buzz";
        }
        if (str.equals("")) {
            str += i;
        }
        return str;

    }

}
