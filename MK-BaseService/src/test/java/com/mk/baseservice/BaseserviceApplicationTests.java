package com.mk.baseservice;

import com.mk.baseservice.service.BaseInstanceManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseserviceApplicationTests {

	@Autowired
	private BaseInstanceManager baseInstanceManager;

	@Test
	public void contextLoads() {

		List instanceList = baseInstanceManager.getInstanceList("select * from mk_weather");

		for (Object obj : instanceList)
		{
			if (obj instanceof Map)
			{
				Map<String,Object> map = (Map<String, Object>) obj;
				for (String key : map.keySet())
				{
					System.out.println("data:----"+map.get(key));
				}
			}
		}


	}

}
