import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
//xml还要深挖的东西，就是对于dom4j包中的内容进行了解，以及对于迭代器进行了解
public class dom4j {
    public static void main(String arg[]) throws Exception{
      SAXReader reader =new SAXReader();
//      创建saxreader对象，并用于读取xml文件
      Document doc =reader.read(new File("src/note.xml"));
//      读取完了xml文件，得到了document对象
//      如果不加入异常抛出的话，这个read会报错
//      System.out.println(doc);
        Element root=doc.getRootElement();
//        获取根元素
        System.out.println(root.getName());
        Iterator<Element> it =root.elementIterator();
//        用迭代器？来进行取出下面所有子元素的操作
        while(it.hasNext()){
            Element a =(Element) it.next();
            System.out.println(a.getName());
//            获取每一个id属性
           Attribute id = a.attribute("id");
           System.out.println(id.getName() + "=" + id.getValue());
           //
            Element name = a.element("name");
            Element course =a.element("to");
            System.out.println(name.getName() + "=" + name.getStringValue());
//            System.out.println(course.getName() + "=" + course.getStringValue());
        }
    }
}
