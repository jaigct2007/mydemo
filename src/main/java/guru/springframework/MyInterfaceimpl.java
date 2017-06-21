package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyInterfaceimpl {
	
	private MyInterface clx;


	@Autowired
	public MyInterfaceimpl(MyInterface clx) {
		this.clx = clx;
	}
	

	public void sayHello() {
		// TODO Auto-generated method stub
		clx.sayHello();
	}

}
