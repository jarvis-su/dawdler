package sep.util.net.ipseeker;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;

public class IPSeekerTest {
    private final IPSeeker seeker;

    public IPSeekerTest() throws IOException {
        seeker = new IPSeeker(FileUtil.classpath("/QQWry.DAT"));
    }

    @Test
    public void testGetLocation() {
        IPLocation location = seeker.getLocation((byte) 192, (byte) 168, (byte) 1, (byte) 1);
        assertThat(location.getCountry(), equalTo("局域网"));
        assertThat(location.getArea(), equalTo("对方和您在同一内部网"));
    }
}
