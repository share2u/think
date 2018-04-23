package site.share2u.chiyouduixiang11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auther: CWM
 * @date: 2018/4/23.
 */
public class Base {
    public static void main(String[] args) {
    
    }
    
    public void addGroup() {
        //创建一个初始化好的对象
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        
        //不如第一种方法灵活,addAll可以直接将一个数组加入到list中
        Integer[] a = {1, 2, 3};
        list.addAll(Arrays.asList(a));
        
        //Arrays.aslist返回的是一个对象数组不能改变大小,用list构造方法
        // 2，识别的的元素类型添加的元素类型的公有的父类
        List<A> la = new ArrayList<>(Arrays.asList(new A1(),new A2()));
        //List<B> lb = new ArrayList<>(Arrays.asList(new B(),new A1()));
        
        //将元素放到第一个集合中
        Collections.addAll(list, 1, 3, 4);
    }
}

class A {
}

class B {
}
class A1 extends A{}
class A2 extends A{}
class B1 extends B{}