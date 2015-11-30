package gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StatusPointInitialGUI extends JFrame {

	public final static int startStatusPoint = 500;

	int sizew = 400, sizeh = 500;
	int x1 = sizew / 2 - 100;
	int x2 = sizeh / 2 + 0;
	int width = 90, height = 30;

	private JLabel jlh = new JLabel("生命值");
	private JSpinner jsh = new JSpinner();
	private JLabel jlat = new JLabel("攻击值");
	private JSpinner jsat = new JSpinner();
	private JLabel jlau = new JLabel("护甲值");
	private JSpinner jsau = new JSpinner();
	private JLabel jlr = new JLabel("魔抗值");
	private JSpinner jsr = new JSpinner();
	private JLabel jlab = new JLabel("魔法攻击值");
	private JSpinner jsab = new JSpinner();
	private JButton jbt = new JButton("确定");
	private JTextArea jtf = new JTextArea();

	public StatusPointInitialGUI() {
		setSize(sizew, sizeh);
		setTitle("初始化"); // Need adjustment

		// Center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize(); // resolution of the monitor
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);

		jlh.setBounds(x1, 40, width, height);
		jsh.setBounds(x2, 40, width, height);

		jlat.setBounds(x1, 80, width, height);
		jsat.setBounds(x2, 80, width, height);

		jlau.setBounds(x1, 120, width, height);
		jsau.setBounds(x2, 120, width, height);

		jlr.setBounds(x1, 160, width, height);
		jsr.setBounds(x2, 160, width, height);

		jlab.setBounds(x1, 200, width, height);
		jsab.setBounds(x2, 200, width, height);

		jbt.setBounds(x1, 250, width, height);

		jtf.setBounds(x1, 300, 200, 100);
		jtf.setText("你现在需要设定角色的初始数值\n总值" + startStatusPoint + "，请认真选择");

		panel.add(jlh);
		panel.add(jsh);
		panel.add(jlat);
		panel.add(jsat);
		panel.add(jlau);
		panel.add(jsau);
		panel.add(jlr);
		panel.add(jsr);
		panel.add(jlab);
		panel.add(jsab);
		panel.add(jbt);
		panel.add(jtf);

		setVisible(true);

		jsh.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				jtf.setText(state(1));
			}
		});
		jsat.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				jtf.setText(state(2));
			}
		});
		jsau.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				jtf.setText(state(3));
			}
		});
		jsr.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				jtf.setText(state(4));
			}
		});
		jsab.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				jtf.setText(state(5));
			}
		});

	}

	private String state(int type) {
		int h = (int) jsh.getValue();
		jsh.setValue(value(h));
		int at = (int) jsat.getValue();
		jsat.setValue(value(at));
		int au = (int) jsau.getValue();
		jsau.setValue(value(au));
		int r = (int) jsr.getValue();
		jsr.setValue(value(r));
		int ab = (int) jsab.getValue();
		jsab.setValue(value(ab));
		if (startStatusPoint - ((int) jsh.getValue() + (int) jsat.getValue() + (int) jsau.getValue()
				+ (int) jsr.getValue() + (int) jsab.getValue()) < 0) {
			switch (type) {
			case (1): {
				jsh.setValue(startStatusPoint - ((int) jsat.getValue() + (int) jsau.getValue() + (int) jsr.getValue()
						+ (int) jsab.getValue()));
				break;
			}
			case (2): {
				jsat.setValue(startStatusPoint - ((int) jsh.getValue() + (int) jsau.getValue() + (int) jsr.getValue()
						+ (int) jsab.getValue()));
				break;
			}
			case (3): {
				jsau.setValue(startStatusPoint - ((int) jsh.getValue() + (int) jsat.getValue() + (int) jsr.getValue()
						+ (int) jsab.getValue()));
				break;
			}
			case (4): {
				jsr.setValue(startStatusPoint - ((int) jsh.getValue() + (int) jsat.getValue() + (int) jsau.getValue()
						+ (int) jsab.getValue()));
				break;
			}
			case (5): {
				jsab.setValue(startStatusPoint - ((int) jsh.getValue() + (int) jsat.getValue() + (int) jsau.getValue()
						+ (int) jsr.getValue()));
				break;
			}
			}
		}
		return "生命值：" + jsh.getValue() + "\n攻击力：" + jsat.getValue() + "\n护甲值：" + jsau.getValue() + "\n魔抗值："
				+ jsr.getValue() + "\n魔法攻击：" + jsab.getValue() + "\n金钱(剩余能力值)："
				+ (startStatusPoint - ((int) jsh.getValue() + (int) jsat.getValue() + (int) jsau.getValue()
						+ (int) jsr.getValue() + (int) jsab.getValue()));
	}

	private int value(int n) {
		if (n < 0)
			return 0;
		else
			return n;
	}
}
