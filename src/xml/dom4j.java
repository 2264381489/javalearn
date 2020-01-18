package xml;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.io.File;

public class dom4j {
//    创建，saxreader对象
    SAXReader saxreader=new SAXReader();
//    开始读取文件，得出一个document文件。
    Document doc=saxreader.read(new File("note.xml"));

}
