package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Watch;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Mi;

public class MiWatch extends Watch implements Mi{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}
