import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test extends Frame {

	public static void main(String[] args) {

		Frame f = new Frame(); //初始化一个不可见的Frame新实例

		f.setTitle("第一个。。。。");//设置窗口标题
		f.setSize(500, 400);//设置窗口大小
		f.setLocation(300, 200);//设置窗口位置
		f.setVisible(true);//设置窗口可见
		f.setLayout(new FlowLayout());//设置窗体为流式布局

		Button b = new Button("按钮");
		f.add(b);

		//窗口关闭事件
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});

	}

}