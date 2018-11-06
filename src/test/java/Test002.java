import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.impl.cookie.BasicClientCookie;

import com.lcc.utils.HttpClientUtil;

public class Test002 {
	
	
	public static void main(String[] args) {
		//创建cookie
		List<BasicClientCookie> cookie = new ArrayList<>();
		BasicClientCookie cookie1 = new BasicClientCookie("token", "abcdefg");
		cookie1.setVersion(0);
		cookie1.setDomain("127.0.0.1");
		cookie1.setPath("/");
		BasicClientCookie cookie2 = new BasicClientCookie("userid", "10086");
		cookie2.setVersion(0);
		cookie2.setDomain("127.0.0.1");
		cookie2.setPath("/");
		BasicClientCookie cookie3 = new BasicClientCookie("openid", "8345fa6df4165asdf46");
		cookie3.setVersion(0);
		cookie3.setDomain("127.0.0.1");
		cookie3.setPath("/");
		cookie.add(cookie1);
		cookie.add(cookie2);
		cookie.add(cookie3);
		Map<String,String> map = new HashMap<>();
		map.put("page", "1");
		map.put("limit", "10");
		
		HttpClientUtil.doPostCookie("http://127.0.0.1:8080/publicparameters/list.html", map, cookie);
	}
}
