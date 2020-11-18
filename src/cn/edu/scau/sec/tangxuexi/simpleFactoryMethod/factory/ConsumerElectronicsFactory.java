package cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory;

import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factory.bean.Pad;
import cn.edu.scau.sec.tangxuexi.factory.bean.Phone;
import cn.edu.scau.sec.tangxuexi.factory.bean.Watch;

//工厂只有一个创建对象的方法，比较简单，但是很原始，就好像一个工厂，有一条生产线，这个生产线能生产所有具体类型的产品。
public class ConsumerElectronicsFactory {
	public static ConsumerElectronics getConsumerElectronics(String consumerElectronicsType) {
		ConsumerElectronics consumerElectronics = null;
		switch(consumerElectronicsType) {
		case "pad": consumerElectronics = new Pad();break;
		case "phone": consumerElectronics = new Phone();break;
		case "watch": consumerElectronics = new Watch();break;
		}
		return consumerElectronics;
	}
}