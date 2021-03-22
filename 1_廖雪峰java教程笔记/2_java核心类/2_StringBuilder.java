// String: 是不可变的数据类型
// * 每次修改字符串都会创建新的字符串对象, 扔掉旧的字符串对象
// * 绝大部分对象都是临时对象，不但浪费内存，还会影响GC效率

// 为了能高效拼接字符串，Java标准库提供了StringBuilder，它是一个可变对象
// * 可以预分配缓冲区，往StringBuilder中新增字符时，不会创建新的临时对象

/*
public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(1024); //预分配1024个缓冲区
        for (int i=0; i < 100; i++){
            sb.append(','); //java字符用单引号，字符串使用双引号
            sb.append(i);
        }
        String s = sb.toString();
        // System.out.println(sb);
        // System.out.println(s);

        // 链式操作（因为appedn()方法会返回this，就可以不断调用其自身的其他方法）
        var sb2 = new StringBuilder(1024);
        sb2.append("Mr ")
          .append("Bob")
          .append("!")
          .insert(0, "Hello, ");
        // System.out.println(sb2.toString());


        // 测试Adder类
        Adder adder = new Adder();
        adder.add(3)
             .add(5)
             .inc()
             .add(10);
        System.out.println(adder.value());
    }
}
*/

/*
//设计支持链式操作的Adder类
class Adder{
    private int sum = 0;

    // 返回类型为Adder,返回类本身
    public Adder add(int n){
        sum += n;
        return this;
    }

    public Adder inc(){
        sum++;
        return this;
    }

    public int value(){
        return this.sum;
    }
}
*/


// 使用StringBuilder构造一个INSERT语句
public class Main{
    public static void main(String[] args){
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "successed" : "failed");
    }

    static String buildInsertSql(String table, String[] fields){
        //TODO:
        // 非常机械的解法，只能适用上面的特定输入
        /*
        StringBuilder s = new StringBuilder(1024);
        s.append("INSERT INTO ")
         .append(table)
         .append(" (")
         .append(fields[0])
         .append(", ")
         .append(fields[1])
         .append(", ")
         .append(fields[2])
         .append(") ")
         .append("VALUES (?, ?, ?)");
        return s.toString();
        */

        // 更加灵活但复杂一些的解法
        StringBuilder attributes = new StringBuilder(1024);
        StringBuilder values = new StringBuilder(1024);
        for (String s : fields){
            attributes.append(s+", ");
            values.append("?, ");
        }
        String attrs = attributes.toString();
        String vals = values.toString();
        attrs = attrs.substring(0, attrs.length()-2);// [0, len-2), 最后两个字符不取
        // vals = vals.tosubstring(0, vals.length-2); //error1: substring, error2: sb.length()
        vals = vals.substring(0, vals.length()-2);
        String insertSql = "INSERT INTO %s (%s) VALUES (%s)".formatted(table, attrs, vals);
        return insertSql;
    }
}
