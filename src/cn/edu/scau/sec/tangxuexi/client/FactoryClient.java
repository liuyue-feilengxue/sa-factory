package cn.edu.scau.sec.tangxuexi.client;

import cn.edu.scau.sec.tangxuexi.abstractFactory.AbstractFactory;
import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factoryPattern.factory.ConsumerElectronicsFactory;
import cn.edu.scau.sec.tangxuexi.factoryPattern.factory.PadFactory;
import cn.edu.scau.sec.tangxuexi.factoryPattern.factory.PhoneFactory;
import cn.edu.scau.sec.tangxuexi.factoryPattern.factory.WatchFactory;

public class FactoryClient {

	public static void main(String[] args) {
//		System.out.println("--简单工厂方法抽象");
//		testSimpleFactory();
//		System.out.println("--工厂模式");
//		testFactoryMethod();
		System.out.println("--抽象工厂模式");
		testAbstractFactory();

	}

	private static void testAbstractFactory() {
//		抽象工厂
		AbstractFactory huaweiFactory = AbstractFactory.getConsumerElectronicsFactory("huawei");
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics huaweiPad = huaweiFactory.getPad();
		huaweiPad.recreation();
		
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics huaweiPhone = huaweiFactory.getPhone();
		huaweiPhone.recreation();
		
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics huaweiWatch = huaweiFactory.getWatch();
		huaweiWatch.recreation();
		
		AbstractFactory appleFactory = AbstractFactory.getConsumerElectronicsFactory("apple");
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics applePad = appleFactory.getPad();
		applePad.recreation();
		
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics applePhone = appleFactory.getPhone();
		applePhone.recreation();
		
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics appleWatch = appleFactory.getWatch();
		appleWatch.recreation();
		
		AbstractFactory miFactory = AbstractFactory.getConsumerElectronicsFactory("mi");
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics miPad = miFactory.getPad();
		miPad.recreation();
		
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics miPhone = miFactory.getPhone();
		miPhone.recreation();
		
		cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics miWatch = miFactory.getWatch();
		miWatch.recreation();
	}

	private static void testSimpleFactory() {
//		简单工厂模式
		ConsumerElectronics pad = cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory.ConsumerElectronicsFactory.getConsumerElectronics("pad");
		pad.recreation();
		
		ConsumerElectronics phone = cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory.ConsumerElectronicsFactory.getConsumerElectronics("phone");
		phone.recreation();
		
		ConsumerElectronics watch = cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory.ConsumerElectronicsFactory.getConsumerElectronics("watch");
		watch.recreation();
		
	}
	
	private static void testFactoryMethod() {
//		工厂模式
		
		ConsumerElectronicsFactory padFactory = new PadFactory();
		ConsumerElectronics pad = padFactory.getConsumerElectronics();
		pad.recreation();
		
		ConsumerElectronicsFactory phoneFactory = new PhoneFactory();
		ConsumerElectronics phone = phoneFactory.getConsumerElectronics();
		phone.recreation();
		
		ConsumerElectronicsFactory watchFactory = new WatchFactory();
		ConsumerElectronics watch = watchFactory.getConsumerElectronics();
		watch.recreation();
		
	}

}
