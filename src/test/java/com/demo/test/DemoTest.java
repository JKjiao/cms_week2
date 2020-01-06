package com.demo.test;

import java.math.BigInteger;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import com.zhangjiaming.pojo.YearCheck;
import com.zhangjm.util.FileUtil;
import com.zhangjm.util.StringUtil;

import junit.framework.JUnit4TestAdapter;
import junit.framework.JUnit4TestAdapterCache;

public class DemoTest {

	@Test
	public void test1() {
		List<String> fileToList = FileUtil.readTextFileToList("d:/cms附件-机械设备公司年检信息.txt");
		YearCheck yc = new YearCheck();
		for (String string : fileToList) {
			System.out.println(string);
			yc.setId(string.indexOf(0));
			System.out.println(yc);
		}
		
	}
}
