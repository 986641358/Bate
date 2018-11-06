
import java.util.Map;
import java.util.TreeMap;


import org.junit.Test;

import com.lcc.utils.HttpClientUtil;
import com.lcc.utils.JsonUtils;
import com.lcc.utils.Sign;

public class Test001 {
	//私钥
	private final String SECRET="895CF0F42ED14607";
	//private String secret ="89E43726C9FA94F7";
	//APPID
	private final String APPID = "100002";
	//芯易令牌
	@SuppressWarnings("unused")
	private String xinyitoken = "54a6f50cdf095af125f815e7022d77bc945080cf";
	//登录URl
	@SuppressWarnings("unused")
	private String loginUrl = "http://login.xinyitest.cn/Login?";
	//private String loginUrl = "http://192.168.100.119/Login?";
	//统一登录接口
	private String login = "http://login.xinyitest.cn/Login/unifylogin";
	//private String login = "http://192.168.100.119/Login/unifylogin";
	//统一API接口地址
	private String api = "http://api.xinyitest.cn/Xinyi/";
	//private String api = "http://192.168.100.119/Xinyi";
	
	public String getSign(Map<String,String> map ){
		String sign = Sign.getSign(map, true, true);
		return sign;
	}
	
	public Map<String,String> getParam(){		
		Map<String,String> map = new TreeMap<>();
		map.put("appid", "100002");
		map.put("timestamp",System.currentTimeMillis()/1000+"");
		map.put("type", "web");
		//map.put("url", "http://baidu.com");
		map.put("func", "XY.setUnitCode");
		map.put("secret", SECRET);
		map.put("sign", getSign(map));
		return map;
	}
	
	public Map<String,String> getUserMerchantList(){
		Map<String,String> map = new TreeMap<>();
		map.put("appid", "100002");
		map.put("method", "public.infoBase.getUserMerchantList");
		map.put("timestamp", System.currentTimeMillis()/1000+"");
		map.put("version", "1");
		map.put("secret", SECRET);
		map.put("sign", getSign(map));
		map.remove("secret");
		return map;
	}

	@Test
	public void testGetUserMerchantList(){
		Map<String,String> map = new TreeMap<>();
		map.put("loginName", "99");
		map.put("loginkey", "123456");
		String unidcode = HttpClientUtil.doPost(login, map).substring(45,77);
		map.clear();
		map.put("appid", APPID);
		map.put("method", "public.infoBase.getUserMerchantList");
		map.put("timestamp", System.currentTimeMillis()/1000+"");
		map.put("version", "1");
		map.put("unidcode", unidcode);
		map.put("secret", SECRET);
		map.put("userkey","");
		String sign = getSign(map);
		map.put("sign",sign );
		map.remove("secret");
		String str = HttpClientUtil.doPost(api,map);
		if(str.indexOf("data")==-1){
			//System.out.println("错误："+JsonUtils.jsonToPojo(str, ErrerResulet.class).getMsg());
		}else{
			//System.out.println("正确："+JsonUtils.jsonToPojo(str, Resulte.class).getCode());
			System.out.println("正确："+str);
		}
		//System.out.println("第二次："+JsonUtils.jsonToPojo(str, Resulet.class).getMsg());
	}
	
	@Test
	public void testGetAuthorize(){
		Map<String,String> map = new TreeMap<>();
		map.put("loginName", "99");
		map.put("loginkey", "123456");
		String unidcode = HttpClientUtil.doPost(login, map).substring(45,77);
		map.clear();
		map.put("appid", APPID);
		map.put("method", "public.infoBase.getAuthorize");
		map.put("timestamp", System.currentTimeMillis()/1000+"");
		map.put("version", "1");
		map.put("unidcode", unidcode);
		map.put("secret", SECRET);
		map.put("userkey","");
		map.put("sid", "10003");
		String sign = getSign(map);
		map.put("sign",sign );
		map.remove("secret");
		String str = HttpClientUtil.doPost(api,map);
		System.out.println(str);
	}
	
	@Test
	public void testGetStoreList(){
		Map<String,String> map = new TreeMap<>();
		map.put("appid", APPID);
		map.put("method", "public.infoBase.getStoreList");
		map.put("timestamp", System.currentTimeMillis()/1000+"");
		map.put("version", "1");
		map.put("secret", "aa9506cc91298fd1e9eb09b62a23dcab");
		map.put("uid", "34");
		map.put("xinyitoken", "070bd05de8c3bac9177f0d298dfa6a4f05a8e625");
		String sign = getSign(map);
		map.put("sign",sign );
		map.remove("secret");
		String str = HttpClientUtil.doPost(api,map);
		System.out.println(str);
		map.clear();
	}
}
