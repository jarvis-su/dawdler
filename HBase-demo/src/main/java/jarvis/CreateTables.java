package jarvis;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

public class CreateTables {


	public static void main(String[] args) {
		Configuration configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum", "192.168.31.103");
        configuration.set("hbase.zookeeper.property.clientPort", "2181");

	}

}
