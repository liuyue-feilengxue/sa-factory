package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Phone;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Apple;

public class ApplePhone extends Phone implements Apple{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}
