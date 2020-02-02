/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-02
 * Time: 19:05
 **/
//hello and cb

// 两个str指向的不同，
// 在change中str指向了常量池中的"test ok"
// 而在te.str+"and" 中 str代表的还是"hello"
public class TestDemo2 {
    String str = new String("hello");
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        TestDemo2 te = new TestDemo2();
        te.change(te.str,te.ch);
        System.out.println(te.str+"and");
        System.out.println(te.ch);
    }
    public void change (String str,char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }
}
