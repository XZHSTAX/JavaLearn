package myReflect;

@MyAnnotationTest(value = "xzh",aaa=99.9,bbb = {"ljy","LJY"})
public class TestMyAnnoation {
	
	@MyAnnotationTest(value = "ljy",aaa = 99.9,bbb = {"xzh","XZH"})
	public void test() {
		
	}
}
