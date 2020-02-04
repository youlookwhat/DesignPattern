package com.example.jingbin.designpattern.app;

/**
 * Created by jingbin on 2016/10/30.
 */

public class AppConstant {

    public final static String STRATEGY_DEFINE = "<em>策略模式（Strategy Pattern）</em>：定义了算法族，分别封装起来，让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。";
    public final static String SINGLETON_DEFINE = "<em>单例模式（Singleton Pattern）</em>：主要是为了避免因为创建了多个实例造成资源的浪费，且多个实例由于多次调用容易导致结果出现错误，而使用单例模式能够保证整个应用中有且只有一个实例。";
    public final static String OBSERVER_DEFINE = "<em>观察者模式（Observer Pattern）</em>：定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。";
    public final static String ADAPTER_DEFINE = "<em>适配器模式（Adapter Pattern）</em>定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。这个定义还好，说适配器的功能就是把一个接口转成另一个接口。";
    public final static String COMMAND_DEFINE = "<em>命令模式（Command Pattern）</em>定义：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。(简化: <b>将请求封装成对象，将动作请求者和动作执行者解耦。</b>)";
    public final static String DECORATOR_DEFINE = "<em>装饰者模式（Decorator Pattern）</em>定义：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。(先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。这里还体现了一个原则：<b>类应该对扩展开放，对修改关闭。</b>))";
    public final static String FACADE_DEFINE = "<em>外观模式（Facade Pattern）</em>定义：提供一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层的接口，让子系统更容易使用。其实就是<b>为了方便客户的使用，把一群操作，封装成一个方法。</b>)";
    public final static String TEMPLATE_METHOD_DEFINE = "<em>模板方法模式（Template Method Pattern）</em>定义：定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。(模版方法定义了一个算法的步骤，并且允许子类为一个或多个步骤提供实现。)";
    public final static String BUILDER_DEFINE = "<em>建造者模式（Builder Pattern）</em>建造模式是对象的创建模式。建造模式可以将一个产品的内部表象（internal representation）与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。";
    public final static String PROTOTYPE_DEFINE = "<em>原型模式（Prototype Pattern）</em>定义：是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。";
    public final static String FLYWEIGHT_DEFINE = "<em>享元模式（Flyweight Pattern）</em>主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。";
    public final static String PROXY_DEFINE = "<em>代理模式（Proxy Pattern）</em>一个类代表另一个类的功能。在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。";
    public final static String JDGC_FACTORY_DEFINE = "<em>简单工厂模式</em>定义：通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。";
    public final static String GCFF_FACTORY_DEFINE = "<em>工厂方法模式</em>定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。";
    public final static String CXGC_FACTORY_DEFINE = "<em>抽象工厂模式</em>定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。";
    public final static String STATE_DEFINE = "<em>状态模式</em>定义：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。定义又开始模糊了，理一下，<b>当对象的内部状态改变时，它的行为跟随状态的改变而改变了，看起来好像重新初始化了一个类似的。</b>";
    public final static String BRIDGE_DEFINE = "<em>桥接模式（Bridge Pattern）</em>是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。<b>这种模式涉及到一个作为桥接的接口[DrawAPI]，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。</b>";
    public final static String COMPOSITE_DEFINE = "<em>组合模式（Composite Pattern）</em>又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。";
    public final static String ITERATOR_DEFINE = "<em>迭代器模式（Iterator Pattern）</em>是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。迭代器模式属于行为型模式。<b>主要解决：不同的方式来遍历整个整合对象。</b>";
    public final static String MEDIATOR_DEFINE = "<em>中介者模式（Mediator Pattern）</em>是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。";
    public final static String MEMENTO_DEFINE = "<em>备忘录模式（Memento Pattern）</em>保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。<b>主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。</b>";
    public final static String INTERPRETER_DEFINE = "<em>解释器模式（Interpreter Pattern）</em>提供了评估语言的语法或表达式的方式，它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。";
    public final static String CHAIN_OF_RESPONSIBILITY_DEFINE = "<em>责任链模式（Chain of Responsibility Pattern）</em>为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。\n\n 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。";
    public final static String VISITOR_DEFINE = "<em>访问者模式（Visitor Pattern）：</em>在访问者模式中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。";
}
