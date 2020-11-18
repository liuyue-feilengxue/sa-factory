package cn.edu.scau.sec.tangxuexi.factoryPattern.factory;

import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factory.bean.Pad;
import cn.edu.scau.sec.tangxuexi.factory.bean.Phone;
import cn.edu.scau.sec.tangxuexi.factory.bean.Watch;

public abstract class ConsumerElectronicsFactory {

	
	public abstract ConsumerElectronics getConsumerElectronics();
}