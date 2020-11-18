package cn.edu.scau.sec.tangxuexi.abstractFactory.bean;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.Pad;
import cn.edu.scau.sec.tangxuexi.abstractFactory.interfaceClass.Mi;

public class MiPad extends Pad implements Mi{

	@Override
	public void recreation() {
		System.out.println(brandName + productName);
		
	}


}