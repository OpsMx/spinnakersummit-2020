package hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.lang.management.*;

// import javax.management.*;
// import java.math.BigDecimal;
// import java.net.HttpURLConnection;
// import java.net.InetAddress;
// import java.net.MalformedURLException;
// import java.net.Socket;
// import java.net.URL;
// import java.net.UnknownHostException;
// import java.net.URL;
// import java.net.MalformedURLException;
// import java.net.HttpURLConnection;
// import java.util.*;

@CrossOrigin
@RestController
public class GreetingController {

	private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

	private static final String template = "Hello, %s!";

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "Mr. No Name") String name) {
		LOG.debug("BEGIN: hello");
		String response = String.format(template, name);
		LOG.debug("END: hello" + "\n" + response);
		return response;
	}

	@RequestMapping("/dogcount")
	public String dogCount() {
		LOG.debug("BEGIN: dogCount");
		String response = "{ \"dogCount\": 2.0 }";
		LOG.debug("END: dogCount" + "\n" + response);
		return response;
	}

	@RequestMapping("/catcount")
	public String catCount() {
		LOG.info("BEGIN: catCount");
		String result="{ \"catCount\": 1.0 }";
		LOG.debug("END: catCount" + "\n" + result);
		return result;
	}

}
