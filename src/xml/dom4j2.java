package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import javax.sql.RowSetInternal;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.spi.XmlWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.jaxen.*;

public class dom4j2 {

    Document document = null;
    public void zairu() {
        try {
//1.读取xml文档步骤
            SAXReader reader = new SAXReader();
            document=reader.read(new File("src/xml/note.xml"));
// 2.获取根节点(要想获得名字记得要加上getname)
            Element root= document.getRootElement();
//            System.out.println(root.getName());
// 2.新增加一个数据（这么写就可以，已经成功了）
            Element newStudent=root.addElement("student");
            Element id=newStudent.addElement("id");
            id.setText("54");
//            Element name=newStudent.addElement("name");
//            Element score=newStudent.addElement("score");
            Element grade=newStudent.addElement("grade");
// 3.   遍历节点  注意这个方法是对document对象调用getrootelement方法。这是一个迭代器，理论上？能返回目标节点下面所有的子节点.注意这个里面的东西全是迭代器中的内容
            for(Iterator i=root.elementIterator();i.hasNext();){ //这个i取出来的是什么类型？（可能和跌带器有关）
                Element el=(Element) i.next();//强制转化为element类型
                System.out.println(el.getName());

            }
// 写入xml文件

//            这个for就是一个正常的for，并不是foreach



        } catch(Exception e){



        }
//        新增加一个数据

    }
//    创建一个xml文件
    void createXml(){
        String fileName="C:\\Users\\22643\\Desktop\\java学习\\src\\xml\\new.xml";
        Document document= DocumentHelper.createDocument();//建立document对象用来操作xml
        Element books=document.addElement("books");
        books.addComment("这个是一一个dom4j的根节点");
        Element book=books.addElement("book");
        book.addAttribute("show","yes");//添加一个属性
//        这里要注意一下，只能加入一个根节点，不能有两个根节点
        Element addTitle=book.addElement("title");
        addTitle.setText("武汉");
        Element bookRoot=document.getRootElement();
        System.out.println(bookRoot.getName());
// 这一部分是将修改的内容写入xml的过程
        try{
            XMLWriter writer=new XMLWriter(new FileWriter(new File(fileName)));
            writer.write(document);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
//    修改节点属性
    public void moidfyXMLFile(){
        String fileName="C:\\Users\\22643\\Desktop\\java学习\\src\\xml\\new.xml";
        Document document=null;
        try{
            SAXReader reader=new SAXReader();//首先读取写满了文档
//            如果不进行错误捕获，这里就必然报错
            document=reader.read(new File(fileName));
//            Element root=document.getRootElement();
//            System.out.println(root.getName());
            List list=document.selectNodes("books/book/@show");
            Iterator iter=list.iterator();
            while(iter.hasNext()){
                Attribute attribute=(Attribute) iter.next();
                if(attribute.getValue().equals("yes")){
                    attribute.setValue("no");
                    System.out.println(attribute.getValue());
                }
            }
//    这里是添加标签，以及标签中的内容
            List list2=document.selectNodes("books");
            Iterator iter2=list2.iterator();
            if(iter2.hasNext()){
                Element book=(Element) iter2.next();
                System.out.println(book.getName());
                Element addBook=book.addElement("main");
                addBook.setText("谎言的代价是什么？");
//                这里是删除的办法
                book.remove(book);

            }

        }
        catch (Exception e){
e.printStackTrace();
        }
        try{

            XMLWriter writer=new XMLWriter(new FileWriter(new File(fileName)));
            writer.write(document);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
