package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Watch;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Apple;

public class AppleWatch extends Watch implements Apple{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
	}

	

}
