/**
 * 
 */
package Common;

/**  
 * <p>Title: HttpURLConnect</p>  
 * <p>Description: </p>  
 * @author 吴冬梅  
 * @date 2018年1月22日  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.alibaba.druid.support.logging.Log;

public class HttpURLConnect {
	@Autowired
	// 修改
	@RequestMapping(value = "put/{method}", method = RequestMethod.PUT)
	public @ResponseBody String put(@PathVariable String mothed) {
		return "put:" + mothed;
	}

	// 新增
	@RequestMapping(value = "post/{method}", method = RequestMethod.POST)
	public @ResponseBody String post(@PathVariable String mothed, String id, String name) {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		return "post:" + mothed;
	}

	// 删除
	@RequestMapping(value = "delete/{method}", method = RequestMethod.DELETE)
	public @ResponseBody String delete(@PathVariable String mothed) {
		return "delete:" + mothed;
	}

	// 查找
	@RequestMapping(value = "get/{method}", method = RequestMethod.GET)
	public @ResponseBody String get(@PathVariable String mothed) {
		return "get:" + mothed;
	}
	
	// HttpURLConnection 调用Restful接口
	@RequestMapping(value = "dealCon/{method}")
	public @ResponseBody String dealCon(@PathVariable String url, String param, String session) throws IOException {
		StringBuilder sb = new StringBuilder();   
		URL restServiceURL = new URL(url);
		HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
		httpConnection.setRequestProperty("Cookie", session);
		// method 输入小写，转换成 GET POST DELETE PUT
//		 httpConnection.setRequestProperty("Accept", "application/json");
		if (param == null) {
			httpConnection.connect();
		}
		else {
			// 打开输出开关
			httpConnection.setRequestMethod("POST");
			httpConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
//			httpConnection.setRequestProperty("X-Requested-With", "XMLHttpRequest");
			httpConnection.setRequestProperty("Accept", "application/json, text/plain, */*");
			httpConnection.setDoOutput(true);
			httpConnection.connect();
			
			// 传递参数，获取HttpURLConnection对象的输出流
			OutputStream outputStream = httpConnection.getOutputStream();
			//请求参数发送
			outputStream.write(param.getBytes());
		    // flush输出流的缓冲
			outputStream.flush();
		}
		if (httpConnection.getResponseCode() != 200) {
			throw new RuntimeException("HTTP GET Request Failed with Error code : " + httpConnection.getResponseCode());
		}
		//定义BufferedReader输入流来读取URL的响应
		BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
		System.out.println("Output from Server:  \n");
		String output;
		while ((output = responseBuffer.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
			System.out.println("=============");
		}
		httpConnection.disconnect();
		return sb.toString();
	}

	/**
	 * post方式登录
	 * 
	 * @param username
	 * @param password
	 * @param loginAction
	 * @return
	 * @throws Exception
	 */
	public String getCookie(String urlLogin, String accountInfo) throws Exception {
		// 登录
		URL url = new URL(urlLogin);
		// String param = "username="+username+"&password="+password;
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");

		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		OutputStream out = conn.getOutputStream();
		out.write(accountInfo.getBytes());
		out.flush();
		out.close();
		String sessionId = "";
		String cookieVal = "";
		String key = null;
		// 取cookie
		for (int i = 1; (key = conn.getHeaderFieldKey(i)) != null; i++) {
			if (key.equalsIgnoreCase("Set-Cookie")) {
				cookieVal = conn.getHeaderField(i);
				cookieVal = cookieVal.substring(0, cookieVal.indexOf(";"));
				sessionId = sessionId + cookieVal + ";";
				System.out.println("sessionId======" + sessionId);
			}
		}
		return sessionId;
	}
}
