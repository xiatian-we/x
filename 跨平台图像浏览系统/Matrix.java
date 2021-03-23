package ��ƽ̨ͼ�����ϵͳ;

//���ؾ����ࣺ�����࣬���ָ�ʽ���ļ����ն���ת��Ϊ���ؾ��󣬲�ͬ�Ĳ���ϵͳ�ṩ��ͬ�ķ�ʽ��ʾ���ؾ���
class Matrix {
  //�˴�����ʡ��
}

//����ͼ���ࣺ������
abstract class Image {
  protected ImageImp imp;

  public void setImageImp(ImageImp imp) {
      this.imp = imp;
  } 

  public abstract void parseFile(String fileName);
}

//�������ϵͳʵ���ࣺʵ����ӿ�
interface ImageImp {
  public void doPaint(Matrix m);  //��ʾ���ؾ���m
} 

//Windows����ϵͳʵ���ࣺ����ʵ����
class WindowsImp implements ImageImp {
  public void doPaint(Matrix m) {
      //����Windowsϵͳ�Ļ��ƺ����������ؾ���
      System.out.print("��Windows����ϵͳ����ʾͼ��");
  }
}

//Linux����ϵͳʵ���ࣺ����ʵ����
class LinuxImp implements ImageImp {
  public void doPaint(Matrix m) {
      //����Linuxϵͳ�Ļ��ƺ����������ؾ���
      System.out.print("��Linux����ϵͳ����ʾͼ��");
  }
}

//Unix����ϵͳʵ���ࣺ����ʵ����
class UnixImp implements ImageImp {
  public void doPaint(Matrix m) {
      //����Unixϵͳ�Ļ��ƺ����������ؾ���
      System.out.print("��Unix����ϵͳ����ʾͼ��");
  }
}

//JPG��ʽͼ�����������
class JPGImage extends Image {
  public void parseFile(String fileName) {
      //ģ�����JPG�ļ������һ�����ؾ������m;
      Matrix m = new Matrix(); 
      imp.doPaint(m);
      System.out.println(fileName + "����ʽΪJPG��");
  }
}

//PNG��ʽͼ�����������
class PNGImage extends Image {
  public void parseFile(String fileName) {
      //ģ�����PNG�ļ������һ�����ؾ������m;
      Matrix m = new Matrix(); 
      imp.doPaint(m);
      System.out.println(fileName + "����ʽΪPNG��");
  }
}

//BMP��ʽͼ�����������
class BMPImage extends Image {
  public void parseFile(String fileName) {
      //ģ�����BMP�ļ������һ�����ؾ������m;
      Matrix m = new Matrix(); 
      imp.doPaint(m);
      System.out.println(fileName + "����ʽΪBMP��");
  }
}

//GIF��ʽͼ�����������
class GIFImage extends Image {
  public void parseFile(String fileName) {
      //ģ�����GIF�ļ������һ�����ؾ������m;
      Matrix m = new Matrix(); 
      imp.doPaint(m);
      System.out.println(fileName + "����ʽΪGIF��");
  }
}
