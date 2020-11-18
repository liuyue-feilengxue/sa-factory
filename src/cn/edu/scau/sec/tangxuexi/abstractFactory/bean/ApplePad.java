package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Pad;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Apple;

public class ApplePad extends Pad implements Apple{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
	}


}