import java.text.SimpleDateFormat;
import java.util.Date;

public class JarvisTest {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS z Z");
		System.out.println(simpleDateFormat.format(new Date()));
	}

}
