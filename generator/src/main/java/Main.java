import org.dragon.builder.ResourcePoolConfig;

/**
 * 建造者模式（生成器模式）
 * 创建一个复杂类型的对象时，可以借助建造者模式进行创建
 * 通过Builder类来创建 ResourcePoolConfig
 * @author <a href="#"></a>
 * @see
 * @since
 */
public class Main {
    public static void main(String[] args) {
        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}
