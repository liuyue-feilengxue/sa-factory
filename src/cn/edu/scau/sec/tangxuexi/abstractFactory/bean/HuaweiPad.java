package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Pad;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Huawei;

public class HuaweiPad extends Pad implements Huawei{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}