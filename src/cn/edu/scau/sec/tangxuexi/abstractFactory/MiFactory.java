package cn.edu.scau.sec.tangxuexi.abstractFactory;

import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.MiPad;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.MiPhone;
import cn.edu.scau.sec.tangxuexi.abstractFactory.bean.MiWatch;

public class MiFactory extends AbstractFactory{
	public ConsumerElectronics getPad() {
		return new MiPad();
	}
	public ConsumerElectronics getPhone() {
		return new MiPhone();
	}
	public ConsumerElectronics getWatch() {
		return new MiWatch();
	}
}