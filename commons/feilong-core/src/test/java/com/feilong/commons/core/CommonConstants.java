package com.feilong.commons.core;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 常量
 * 
 * @author <a href="mailto:venusdrogon@163.com">金鑫</a>
 * @version 1.0 Mar 21, 2011 12:14:12 PM
 */
public class CommonConstants{

	private static final Logger	log	= LoggerFactory.getLogger(TestConstants.class);

	@Test
	public void MAX_VALUE(){
		//2147483647
		log.info(Integer.MAX_VALUE + "");
		//9223372036854775807
		log.info(Long.MAX_VALUE + "");
		//1.7976931348623157E308
		log.info(Double.MAX_VALUE + "");
	}

	@Test
	public void IntegerAssertEquals(){
		int i = 760802109 + 1538284578;

		log.warn("the param i:{}", i);
		String signature1 = Math.abs(i) + "";
		log.debug("signature1 value:{}", signature1);

		BigDecimal add = new BigDecimal(760802109).add(new BigDecimal(1538284578));
		log.warn("the param add:{}", add);
		BigDecimal hash = add.abs();
		String signature2 = hash + "";
		log.debug("signature2 value:{}", signature2);
	}

	@Test
	public void length(){
		log.info("http://203.128.73.211/p/klikpayback/010000140002?s=30cbbe7a9bfcfc1131b018426e8560854bf507b3".length() + "");
		log.info("http://s.mp2.com/??static/public/js/jquery.jqzoom-core.js,static/public/js/jquery.json-2.4.js,static/marketplace/js/item/memberFavorite.js,static/marketplace/js/buyNow/addShoppingCart.js,static/marketplace/messages/messageDetail_en_US.js,static/marketplace/js/item/itemPDPDetail.js,static/marketplace/js/item/itemPDPDetail_subData.js,static/marketplace/js/item/itemPDPDetail_paging.js,static/public/js/cascading/jquery.cascading.data.js,static/public/js/cascading/jquery.cascading.js,static/marketplace/js/item/youMayLikeItemForPDP.js,static/livechat/js/livechat.js,static/trade/js/tradeFeedbacks/rating.js?16b3adc77c0d3e9df617d3178fe43445"
				.length() + "");
		log.info("Rm.109-118, Building H, No.1188 Wanrong Road, Shanghai 200436".length() + "");
	}

	@Test
	public void re(){
		log.info("alicea".replace("a", "<b>a</b>"));
	}

	@Test
	public void name12(){
		DecimalFormat df = new DecimalFormat("0000000000");
		int temp = 2015000;
		long currentTimeMillis = System.currentTimeMillis();
		log.info("currentTimeMillis:{}", currentTimeMillis);

		long t = currentTimeMillis % 100;
		log.info("t:{}", t);

		long l = temp + t;

		long longValue = Long.valueOf(l + "0" + t).longValue();

		if (t < 10){

		}else{
			longValue = Long.valueOf(l + "" + t).longValue();
		}

		log.info(df.format(longValue));

	}

}
