package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Phone;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Huawei;

public class HuaweiPhone extends Phone implements Huawei{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}
