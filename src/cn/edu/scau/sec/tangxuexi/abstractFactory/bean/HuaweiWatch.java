package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Watch;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Huawei;

public class HuaweiWatch extends Watch implements Huawei{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}
