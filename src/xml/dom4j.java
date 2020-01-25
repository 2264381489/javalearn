package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class dom4j {
//    创建，saxreader对象
    public  void dom4() throws Exception {
//        记得要加入异常抛出的方式，要不然必然报错，因为这个read
        SAXReader saxreader = new SAXReader();
//    开始读取文件，得出一个document文件。
        Document doc = saxreader.read(new File("src/xml/note.xml"));
//        System.out.println(doc.getName());doc文件没用名字
//        得到一个根节点
        Element root=doc.getRootElement();
        System.out.println(root.getName());
//        得到嵌套的子节点
        Element student=root.element("student");
        Element id=student.element("id");
        Element name=student.element("name");
        Element score=student.element("score");
        Element grade=student.element("grade");
        System.out.println(student.getName()+name.getName()+score.getName()+grade.getName());
//新增一个节点及其下属节点 web：https://blog.csdn.net/zys_1997/article/details/78566706
        Element menuelement =root.addElement("student");
        Element engelement =menuelement.addElement("id");
        Element engelement1 =menuelement.addElement("name");
        Element engelement2 =menuelement.addElement("score");
        Element engelement3 =menuelement.addElement("grade");
 

    }
}
