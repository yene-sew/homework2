import java.awt.*;
import javax.swing.JFrame;

public class Javahomework1 extends java.applet.Applet
{
    TextArea txta = null;
    public void init()
    {

        setLayout(new BorderLayout());
        Panel pn = new Panel();
        txta = new TextArea();
        pn.add(txta);
        add("Center", pn);
        pn = new Panel();
        pn.add(new Button("Programming"));
        pn.add(new Button("DataBase"));
        Choice c = new Choice();
        c.addItem("");
        c.addItem("OOJava");
        c.addItem("Ajava");
        c.addItem("C++");
        c.addItem("Python");
        c.addItem("HTML");
        pn.add(c);
        add("South", pn);
    }
    public boolean action(Event e, Object o)
    {
        String str = (String)o;
        txta.appendText(str + "\n");
        return false;
    }
    public static void main(String [] args)
    {

        JFrame frame ;
        frame = new JFrame("JavaHomeWork 1");
        Javahomework1 yene = new Javahomework1();
        yene.init();
        frame.add("Center", yene);
        frame.pack();
        frame.show();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}