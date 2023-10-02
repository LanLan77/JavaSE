package com.alan.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

// 目标：Collection的遍历方式3：JDK8开始新增的Lambda表达式。
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("王小美");
        collection.add("Java1");
        collection.add("甘雨");
        collection.add("刻晴");
        System.out.println(collection);
        System.out.println("-------------------------------------");

        // default void forEach(Consumer<? super T> action): 结合Lambda表达式遍历集合：
/*        collection.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        System.out.println("-------------------------------------");
*/

        collection.forEach(System.out::println);

    }
}
