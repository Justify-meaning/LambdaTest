package lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * @Author Hcs
 * @Date 2021-7-30 15:37
 * @Version 1.0
 */
public class LambdaTest1 {
    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习太累了，赶紧进厂吧，工资为：" + aDouble);
            }
        });
    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
}