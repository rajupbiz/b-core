package com.blob;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blob.dao.ContactDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BlobCoreApplication.class)
public class BlobCoreApplicationTests {

	@Resource
	ContactDao contactDao;
	
	@Test
	public void contextLoads() {
		
		System.out.println("   no of conatcts >>>  "+contactDao.count());
		
		System.out.println("   no of conatcts >>>  "+contactDao.count());
	}

}
