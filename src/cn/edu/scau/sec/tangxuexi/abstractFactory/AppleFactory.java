package cn.edu.scau.sec.tangxuexi.abstractFactory;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.ApplePad;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.ApplePhone;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.AppleWatch;

public class AppleFactory extends AbstractFactory{
	public ConsumerElectronics getPad(){
		return new ApplePad();
	}
	
	public ConsumerElectronics getPhone(){
		return new ApplePhone();
	}
	
	public ConsumerElectronics getWatch(){
		return new AppleWatch();
	}
}