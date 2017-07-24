
package com.leshalv;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;

/**
 * 
 * @author SanLi
 */
public class Main extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7984604276790553846L;
	private Properties p = null;
	Set<Object> set = null;
	private String name;
	private String key;
	private Thread t = null;
	private String btnName;

	/**
	 * Creates new form Main
	 */
	public Main() {
		initComponents();
		// 更改窗体的图标
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("images\\user.jpg");
		setIconImage(i);

		btnStart.setEnabled(false);
		btnStart.setText("开 始");
		btnReset.setEnabled(false);
		btnReset.setText("重 置");

		String fileName[] = null;
		File file = null;
		File loadFile = null;
		@SuppressWarnings("unused")
		String name = null;
		file = new File("RollCallSystem\\Original");
		loadFile = new File("RollCallSystem\\Load");
		if (file.exists() && loadFile.exists()) {
			fileName = file.list();
			for (int j = 0; j < fileName.length; j++) {
				name += fileName[j] + '\n';
			}
		} else {
			file.mkdirs();
			loadFile.mkdirs();
		}

	}

	private void initComponents() {

		jMenu2 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu4 = new javax.swing.JMenu();
		jMenu5 = new javax.swing.JMenu();
		jMenuBar3 = new javax.swing.JMenuBar();
		jMenu6 = new javax.swing.JMenu();
		jMenu7 = new javax.swing.JMenu();
		jMenuBar4 = new javax.swing.JMenuBar();
		jMenu9 = new javax.swing.JMenu();
		jMenu10 = new javax.swing.JMenu();
		checkbox1 = new java.awt.Checkbox();
		jMenu8 = new javax.swing.JMenu();
		jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
		jMenu11 = new javax.swing.JMenu();
		jMenu12 = new javax.swing.JMenu();
		jMenuBar5 = new javax.swing.JMenuBar();
		jMenu13 = new javax.swing.JMenu();
		jMenu14 = new javax.swing.JMenu();
		jMenuBar6 = new javax.swing.JMenuBar();
		jMenu15 = new javax.swing.JMenu();
		jMenu16 = new javax.swing.JMenu();
		jMenuBar7 = new javax.swing.JMenuBar();
		jMenu17 = new javax.swing.JMenu();
		jMenu18 = new javax.swing.JMenu();
		jMenu20 = new javax.swing.JMenu();
		jMenuItem6 = new javax.swing.JMenuItem();
		lblName = new javax.swing.JLabel();
		btnStart = new javax.swing.JButton();
		btnReset = new javax.swing.JButton();
		lblClass = new javax.swing.JLabel();
		jSeparator5 = new javax.swing.JSeparator();
		jSeparator10 = new javax.swing.JSeparator();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jSeparator2 = new javax.swing.JPopupMenu.Separator();
		jMenu21 = new javax.swing.JMenu();
		new javax.swing.JMenuItem();
		jSeparator9 = new javax.swing.JPopupMenu.Separator();
		jMenu19 = new javax.swing.JMenu();
		jMenu22 = new javax.swing.JMenu();
		jMenuItem7 = new javax.swing.JMenuItem();
		jSeparator4 = new javax.swing.JPopupMenu.Separator();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenuItem11 = new javax.swing.JMenuItem();
		jSeparator8 = new javax.swing.JPopupMenu.Separator();
		jSeparator11 = new javax.swing.JPopupMenu.Separator();
		jMenuItem4 = new javax.swing.JMenuItem();
		new javax.swing.JPopupMenu.Separator();
		jSeparator14 = new javax.swing.JPopupMenu.Separator();
		new javax.swing.JPopupMenu.Separator();
		jMenu2.setText("jMenu2");

		jMenu3.setText("jMenu3");

		jMenuItem5.setText("jMenuItem5");

		jMenu4.setText("File");
		jMenuBar2.add(jMenu4);

		jMenu5.setText("Edit");
		jMenuBar2.add(jMenu5);

		jMenu6.setText("File");
		jMenuBar3.add(jMenu6);

		jMenu7.setText("Edit");
		jMenuBar3.add(jMenu7);

		jMenu9.setText("File");
		jMenuBar4.add(jMenu9);

		jMenu10.setText("Edit");
		jMenuBar4.add(jMenu10);

		checkbox1.setLabel("checkbox1");

		jMenu8.setText("jMenu8");

		jRadioButtonMenuItem1.setSelected(true);
		jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

		jMenu11.setText("jMenu11");

		jMenu12.setText("jMenu12");

		jMenu13.setText("File");
		jMenuBar5.add(jMenu13);

		jMenu14.setText("Edit");
		jMenuBar5.add(jMenu14);

		jMenu15.setText("File");
		jMenuBar6.add(jMenu15);

		jMenu16.setText("Edit");
		jMenuBar6.add(jMenu16);

		jMenu17.setText("File");
		jMenuBar7.add(jMenu17);

		jMenu18.setText("Edit");
		jMenuBar7.add(jMenu18);

		jMenu20.setText("jMenu20");

		jMenuItem6.setText("jMenuItem6");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("点名系统");
		setMaximumSize(new java.awt.Dimension(500, 600));
		setName("Main"); // NOI18N
		setResizable(false);

		lblName.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
		lblName.setForeground(new java.awt.Color(255, 102, 102));
		lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblName.setText("请选择班级");
		lblName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		btnStart.setBackground(new java.awt.Color(204, 204, 204));
		btnStart.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
		btnStart.setForeground(new java.awt.Color(51, 0, 51));
		btnStart.setText("开 始");
		btnStart.setFocusPainted(false);
		btnStart.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnStartActionPerformed(evt);
			}
		});

		btnReset.setBackground(new java.awt.Color(204, 204, 204));
		btnReset.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
		btnReset.setForeground(new java.awt.Color(51, 0, 51));
		btnReset.setText("重 置");
		btnReset.setFocusPainted(false);
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});

		lblClass.setText("请选择班级");

		jMenu1.setText("操作");
		jMenu1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

		jMenu21.setText("选择班级");
		jMenu1.add(jMenu21);
		jMenu1.add(jSeparator2);

		jMenuItem11.setText("删除班级");
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}

			/**
			 * 删除班级
			 * @param evt
			 */
			private void jMenuItem5ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				new DelClass().setVisible(true);

			}
		});
		jMenu1.add(jMenuItem11);
		jMenu1.add(jSeparator14);
		jMenu22.setText("修 改");

		jMenuItem9.setText("班 级");

		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem17ActionPerformed(evt);
			}

		});
		jMenu22.add(jMenuItem9);
		jMenu22.add(jSeparator11);

		jMenuItem10.setText("学 生");
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu22.add(jMenuItem10);
		jMenu1.add(jMenu22);

		jMenu1.add(jSeparator9);

		jMenu19.setText("添 加");

		jMenuItem7.setText("班 级");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu19.add(jMenuItem7);
		jMenu19.add(jSeparator4);

		jMenuItem8.setText("学 生");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu19.add(jMenuItem8);

		jMenu1.add(jMenu19);
		jMenu1.add(jSeparator8);

		jMenuItem4.setText("退 出");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem4);

		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
												.addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addContainerGap())
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addGap(0, 156, Short.MAX_VALUE).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 174,
														Short.MAX_VALUE)
												.addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 163,
														Short.MAX_VALUE)
												.addComponent(jSeparator10)).addGap(160, 160, 160))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jSeparator5).addContainerGap())))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblClass).addContainerGap()));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { btnReset, btnStart });

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(73, 73, 73).addComponent(lblName)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
						.addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(85, 85, 85)
						.addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(98, 98, 98)
						.addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lblClass)
						.addGap(18, 18, 18)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { btnReset, btnStart });

		pack();
		setLocationRelativeTo(null);

		load();

	}// </editor-fold>//GEN-END:initComponents

	/**
	 * 窗体加载时 利用反射将班级添加到菜单
	 */
	public void load() {

		String name = "";
		String fileName[] = null;
		File file = null;
		try {
			file = new File("RollCallSystem\\Original");
			fileName = file.list();
			if (fileName!=null) {
				for (int i = 0; i < fileName.length; i++) {
					name = fileName[i] + '\n';
					Constructor<Separator> cons = Separator.class.getConstructor();
					Constructor<JMenuItem> con = JMenuItem.class.getConstructor();
					final JMenuItem obj = con.newInstance();
					Separator s = cons.newInstance();

					obj.setText(name);

					obj.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent evt) {
							jMenuItem1ActionPerformed1(evt, obj);
						}
					});

					jMenu21.add(obj);
					jMenu21.add(s);
				} 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 程序一运行就从文件中读取姓名到集合
	 * 
	 * 
	 */

	public void loadName(String className) {
		// TODO Auto-generated method stub
		p = new Properties();
		try {

			p.load(new FileReader("RollCallSystem\\Load\\" + className + "\\Name.txt"));
			set = p.keySet();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			btnStart.setEnabled(false);
			btnReset.setEnabled(false);
			lblName.setText("请添加学生");
			dialog("请添加学生");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 弹框显示方法
	 * 
	 * @param tishi
	 */
	private void dialog(String tishi) {
		// TODO Auto-generated method stub
		final JDialog jd = new JDialog();
		JLabel jl = new JLabel(tishi, JLabel.CENTER);
		jl.setFont(new java.awt.Font("宋体", 0, 18));
		Container contentPane = jd.getContentPane();
		JButton jb = new JButton("OK");
		jd.setTitle("提示");
		jd.setSize(300, 200);
		jd.setVisible(true);
		jd.setLocationRelativeTo(null);
		contentPane.add(jl, BorderLayout.CENTER);

		jd.getContentPane().add(jb, BorderLayout.PAGE_END);
		jb.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnjb(evt);
			}

			/**
			 * 弹出框按钮单击事件
			 * 
			 * @param evt
			 */
			private void btnjb(ActionEvent evt) {
				// TODO Auto-generated method stub
				jd.dispose();
			}
		});
	}

	/**
	 * 选择班级事件
	 * 
	 * @param evt
	 */
	private void jMenuItem1ActionPerformed1(java.awt.event.ActionEvent evt, JMenuItem obj) {
		String className = obj.getText().trim();
		loadName(className);
		if (p.size() != 0) {
			btnStart.setText("开 始");
			btnStart.setEnabled(true);
			btnReset.setText("重 置");
			btnReset.setEnabled(true);
			this.lblName.setText("请开始点名");
		}
		this.lblClass.setText(className);

	}

	/**
	 * 修改班级
	 * 
	 * @param evt
	 */
	private void jMenuItem17ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		AddClass ac = new AddClass();
		ac.setVisible(true);
		ac.setTitle("修改班级");
		ac.btnAdd.setText("修改");

	}

	/**
	 * 退出
	 * 
	 * @param evt
	 */
	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
		// TODO add your handling code here:
		System.exit(0);
	}// GEN-LAST:event_jMenuItem4ActionPerformed

	/**
	 * 开始按钮
	 * 
	 * @param evt
	 */
	@SuppressWarnings("deprecation")
	private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStartActionPerformed
		// TODO add your handling code here:

		if (!lblName.getText().trim().equals("请选择班级")) {
			btnName = this.btnStart.getText();
			btnReset.setEnabled(false);
			if (p.size() == 0) {

				btnStart.setText("请重置");
				btnStart.setEnabled(false);
				btnReset.setEnabled(true);
				jMenu1.setEnabled(true);

			} else {
				if (btnName.equals("开 始")) {
					jMenu1.setEnabled(false);
					/*
					 * 不调用这个方法是为了防止外界修改loanName文件对程序产生直接的影响
					 * 如果希望修改loadName文件对程序进行更改则调用 loadName();
					 */

					btnStart.setText("结 束");
					t = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub

							while (!t.isInterrupted()) {
								for (Object object : set) {
									key = (String) object;
									name = p.getProperty(key);
									lblName.setText(name);
								}
							}

						}

					});

					t.start();
				}

				else {

					// t.interrupt();
					t.stop();
					try {
						try {
							String className = lblClass.getText();
							Thread.sleep(50);
							if (p.size() == 1) {
								btnStart.setText("请重置");
								btnStart.setEnabled(false);
							} else {
								btnStart.setText("开 始");
							}

							btnReset.setEnabled(true);
							jMenu1.setEnabled(true);
							p.remove(key);
							p.store(new BufferedWriter(
									new FileWriter("RollCallSystem\\Load\\" + className + "\\Name.txt")), null);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		} else {

		}

	}// GEN-LAST:event_btnStartActionPerformed

	/**
	 * 重置按钮
	 * 
	 * @param evt
	 */
	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
		if (!lblName.getText().trim().equals("请选择班级")) {
			// TODO add your handling code here:
			lblName.setText("请开始点名");
			String className = lblClass.getText().trim();
			BufferedReader br = null;
			BufferedWriter bw = null;
			String name = null;
			try {
				br = new BufferedReader(new FileReader("RollCallSystem\\Original\\" + className + "\\Name.txt"));
				bw = new BufferedWriter(new FileWriter("RollCallSystem\\Load\\" + className + "\\Name.txt"));
				while ((name = br.readLine()) != null) {
					bw.write(name);
					bw.newLine();
					bw.flush();
				}

				btnStart.setEnabled(true);
				btnStart.setText("开 始");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (br != null && bw != null) {
						br.close();
						bw.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			loadName(className);
		}

	}// GEN-LAST:event_btnResetActionPerformed

	/**
	 * 添加班级
	 * 
	 * @param evt
	 */
	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem7ActionPerformed
		// TODO add your handling code here:
		new AddClass().setVisible(true);
	}// GEN-LAST:event_jMenuItem7ActionPerformed

	/**
	 * 添加学生
	 * 
	 * @param evt
	 */
	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem8ActionPerformed
		// TODO add your handling code here:
		new AddStudent().setVisible(true);
	}// GEN-LAST:event_jMenuItem8ActionPerformed

	/**
	 * 修改
	 * 
	 * @param evt
	 */
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		// TODO add your handling code here:
		AddStudent addStudent = new AddStudent();
		addStudent.setVisible(true);
		addStudent.setTitle("修改学生");
		addStudent.btnAdd.setText("修改");

	}// GEN-LAST:event_jMenuItem2ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				main = new Main();
				main.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	public static Main main = null;
	private javax.swing.JButton btnReset;
	private javax.swing.JButton btnStart;
	private java.awt.Checkbox checkbox1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu10;
	private javax.swing.JMenu jMenu11;
	private javax.swing.JMenu jMenu12;
	private javax.swing.JMenu jMenu13;
	private javax.swing.JMenu jMenu14;
	private javax.swing.JMenu jMenu15;
	private javax.swing.JMenu jMenu16;
	private javax.swing.JMenu jMenu17;
	private javax.swing.JMenu jMenu18;
	private javax.swing.JMenu jMenu19;
	private javax.swing.JMenu jMenu22;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu20;
	public javax.swing.JMenu jMenu21;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenu jMenu9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JMenuBar jMenuBar3;
	private javax.swing.JMenuBar jMenuBar4;
	private javax.swing.JMenuBar jMenuBar5;
	private javax.swing.JMenuBar jMenuBar6;
	private javax.swing.JMenuBar jMenuBar7;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
	private javax.swing.JSeparator jSeparator10;
	private javax.swing.JPopupMenu.Separator jSeparator2;
	private javax.swing.JPopupMenu.Separator jSeparator4;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JPopupMenu.Separator jSeparator8;
	private javax.swing.JPopupMenu.Separator jSeparator9;
	private javax.swing.JPopupMenu.Separator jSeparator11;
	private javax.swing.JPopupMenu.Separator jSeparator14;
	private javax.swing.JLabel lblClass;
	private javax.swing.JLabel lblName;
	// End of variables declaration//GEN-END:variables
}
