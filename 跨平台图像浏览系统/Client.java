package 跨平台图像浏览系统;

public class Client {
	 public static void main(String args[]) {
	        Image image;
	        ImageImp imp;
	        image = (Image)XMLUtil.getBean("image");
	        imp = (ImageImp)XMLUtil.getBean("os");
	        image.setImageImp(imp);
	        image.parseFile("立于浮华之世，奏响天籁之音！");
	    }
}
