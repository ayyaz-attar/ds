package ui;

import org.testng.annotations.Test;

/**
 * Created by ayyaz.a on 10/16/2019.
 */
public class Test1 {
    @Test(groups="a")
    public void test1a(){
        System.out.println("This is Class Test1 and Test test1a");
    }
    @Test(groups="b")
    public void test1b(){
        System.out.println("This is Class Test1 and Test test1b");
    }
    @Test(groups="c")
    public void test1c(){
        System.out.println("This is Class Test1 and Test test1c");
    }
}
