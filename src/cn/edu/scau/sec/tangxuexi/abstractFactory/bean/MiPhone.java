package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Phone;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Mi;

public class MiPhone extends Phone implements Mi{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}
