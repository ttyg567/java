package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {

	public static void main(String[] args) {
		String ipAddr = GetIpAddress.getIpAddress(); 
		System.out.printf("$로 접속.." , ipAddr);
	}

}
