package d11_interface_attention;
/*
* 接口其他注意事项（了解）
    1、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承。
    2、一个类实现多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现。
    3、一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先用父类的。
    4、一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
*
* */
public class Test2    {
    public static void main(String[] args) {
        // 目标：理解接口多继承
    }

    interface A{
        void test1();
    }
    interface B{
        void test2();
    }
    interface C{}

    // 接口是可以继承的
    interface D extends A,B,C{

    }

    class E implements C,B,A{

        @Override
        public void test1() {

        }

        @Override
        public void test2() {

        }
    }
}
