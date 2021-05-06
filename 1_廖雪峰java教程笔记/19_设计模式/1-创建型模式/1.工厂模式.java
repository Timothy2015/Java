// 工厂方法：使得创建对象和使用对象是分离的

// case: 实现一个解析字符串到Number的Factory


// 工厂接口
public interface NumberFactory{
    Number parse(String s);
}
// 工厂的实现类 - implements关键字
public class NumberFactoryImpl implements MumberFactroy {
    // 产品接口是Number, 返回的实际产品是BigDecimal
    public Number parse(String s){
        return new BigDecimal(s);
    }
}

// 客户端：创建MumberFactoryImpl，
//        在接口Factory中定义一个静态方法getFactory()来返回真正的子类：
public interface NumberFactory {
    // 创建方法
    Number parse(String s);

    // 获取工厂实例
    static MumberFactroy getFactory(){
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();
}

// 在客户端中，只需要和工厂接口NumberFactory以及抽象产品Number打交道
NumberFactory factory = NumberFactory.getFactory();
Number result = factory.parse("12.3456");

// ------------------------------------------------------------- // 

// 静态工厂方法
