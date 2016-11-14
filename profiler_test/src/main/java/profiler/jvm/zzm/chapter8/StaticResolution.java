package profiler.jvm.zzm.chapter8;
/**
 * 方法静态解析演示 8-05
 * 
 * @author zzm
 */
public class StaticResolution {

	public static void sayHello() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		StaticResolution.sayHello();
	}

}

