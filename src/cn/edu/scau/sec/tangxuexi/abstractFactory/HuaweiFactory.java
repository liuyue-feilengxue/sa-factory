package cn.edu.scau.sec.tangxuexi.abstractFactory;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.HuaweiPad;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.HuaweiPhone;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.HuaweiWatch;

public class HuaweiFactory extends AbstractFactory{
	public ConsumerElectronics getPad() {
		return new HuaweiPad();
	}
	public ConsumerElectronics getPhone() {
		return new HuaweiPhone();
	}
	public ConsumerElectronics getWatch() {
		return new HuaweiWatch();
	}
}