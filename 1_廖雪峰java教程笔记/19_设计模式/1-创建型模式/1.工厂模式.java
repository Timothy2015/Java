// 工厂方法：使得创建对象和使用对象是分离的

// case: 实现一个解析字符串到Number的Factory

/*
// 工厂接口（接口可以简单理解为“一层封装”，更加方便的使用类和对象）
public interface NumberFactory{
    // 创建方法
    Number parse(String s);

    // 获取工厂实例
    static MumberFactroy getFactory(){
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();
}
// 工厂的实现类 - implements关键字
public class NumberFactoryImpl implements MumberFactory {
    // 产品接口是Number, 返回的实际产品是BigDecimal
    public Number parse(String s){
        return new BigDecimal(s); //BigDecimal的实现细节省略了
    }
}

// 在客户端中，只需要和工厂接口NumberFactory以及抽象产品Number打交道
NumberFactory factory = NumberFactory.getFactory();
Number result = factory.parse("12.3456");

*/

// ------------------------------------------------------------- // 
/*
问：一个简单的parse()需要写这么复杂的工厂吗？实际上大多数情况下我们并不需要抽象工厂，
而是通过静态方法直接返回产品。
   静态工厂方法广泛地应用在Java标准库中。
*/
// 静态工厂方法 (Static Factory Method)


/*
public class NumberFactory{
    public static Number parse(String s){
        return new BigDecimal(s);
    }
}

// 标准库中静态工厂方法
Integer n = Integer.valueOf(100);

public final class Integer{
    public static Integer valueOf(int i){
        if (i >= IntegerCache.low && i <= IntegerCache.high){
            return IntegerCache.cache[i + (-IntegerCache.low)]
        }
        return new Integer(i);
    }
    //……
}
*/

// ------------------------------------------------------------- // 

// 练习：
// 使用静态工厂方法实现一个类似20200202的整数转换为LocalDate
/*
public class LocalDateFactory{
    public static LocalDate fromInt(int yyyyMMdd){

    }
}
*/

// 廖雪峰老师的示例代码：
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.security.NoSuchAlgorithmException;

public class Main{

    public static void main(String[] args) throws NoSuchAlgorithmException{
        LocalDate ld = LocalDateFactory.fromInt(20200202);
        System.out.println(ld);
        LocalDate ld2 = LocalDateFactory.fromInt(20200202);
        System.out.println(ld == ld2);
    }
}

public class LocalDateFactory{

    private static Map<Integer, LocalDate> cache = new HashMap<>();

    public static LocalDate fromInt(int yyyyMMdd){
        if (yyyyMMdd >= 20200101 && yyyyMMdd <= 20301231){
            LocalDate result = cache.get(yyyyMMdd);
            if (result == null){
                result = create(yyyyMMdd);
                cache.put(yyyyMMdd, result);
            }
            return result;
        }
        return create(yyyyMMdd);
    }

    private static LocalDate create(int yyyyMMdd){
        // 获取前4位数, 中间两位数，最后两位数
        return LocalDate.of(yyyyMMdd / 10000, yyyyMMdd / 100 % 100, yyyyMMdd % 100 );
    }
}
