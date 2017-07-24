
package com.leshalv;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * 
 * @author SanLi
 */
public class AddStudent extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4231152173302789434L;

	/**
	 * Creates new form Add
	 */
	public AddStudent() {
		load();
		initComponents();
		// 更改窗体的图标
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("images\\png-0010.png");
		setIconImage(i);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

		jSeparator2 = new javax.swing.JSeparator();
		jScrollPane1 = new javax.swing.JScrollPane();
		lisClass = new javax.swing.JList();
		btnAdd = new javax.swing.JButton();
		btnCancel = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		txtStudentName = new javax.swing.JTextArea();
		jSeparator1 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("添加学生");
		setMaximumSize(new java.awt.Dimension(382, 576));
		setName("Add"); // NOI18N
		setResizable(false);

		lisClass.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		lisClass.setModel(new javax.swing.AbstractListModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1550829557335976383L;
			String[] strings = load();

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		lisClass.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				lisClassValueChanged(evt);
			}
		});
		jScrollPane1.setViewportView(lisClass);

		btnAdd.setText("添加");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnCancel.setText("取消");
		btnCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCancelActionPerformed(evt);
			}
		});

		txtStudentName.setColumns(20);
		txtStudentName.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		txtStudentName.setRows(5);
		jScrollPane3.setViewportView(txtStudentName);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE, 137,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup().addComponent(btnAdd)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		92, Short.MAX_VALUE)
																.addComponent(btnCancel))
												.addComponent(jSeparator1))
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206,
												javax.swing.GroupLayout.PREFERRED_SIZE))))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 501,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btnAdd).addComponent(btnCancel))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * 列表选中事件
	 * 
	 * @param evt
	 */
	private void lisClassValueChanged(javax.swing.event.ListSelectionEvent evt) {
		// TODO add your handling code here:
		txtStudentName.setText("");
		String className = (String) lisClass.getSelectedValue();
		loadName(className);
	}

	/**
	 * 窗口加载时将Load文件夹下的所有文件夹名称添加进去
	 */
	@SuppressWarnings("finally")
	public String[] load() {

		String fileName[] = null;
		File file = null;
		File loadFile = null;
		try {
			@SuppressWarnings("unused")
			String name = null;
			file = new File("RollCallSystem\\Original");
			loadFile = new File("RollCallSystem\\Load");
			if (file.exists() && loadFile.exists()) {
				fileName = file.list();
				for (int i = 0; i < fileName.length; i++) {
					name += fileName[i] + '\n';
				}
			} else {
				file.mkdirs();
				loadFile.mkdirs();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return fileName;
		}

	}

	/**
	 * 窗口加载时将文件中的数据加载到文本框上
	 */
	public void loadName(String className) {
		BufferedReader br = null;
		try {

			String str;
			String str1 = "";
			String regex = "[^(\\u4e00-\\u9fa5)]";
			String str2[] = null;
			File file = new File("RollCallSystem\\Original\\" + className + "\\Name.txt");
			if (file.exists()) {
				br = new BufferedReader(new FileReader(file));
				while ((str = br.readLine()) != null) {
					str1 += str + '\n';
					str2 = str1.split(regex);

				}
			}
			str1 = "";

			if (str2 != null) {
				for (String string : str2) {

					str1 += string + '\n';
					str1 = str1.replaceAll("(?m)^\\s*$(\\n|\\r\\n)", "");
					// System.out.println(str1);
					txtStudentName.setText(str1);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 添加
	 * 
	 * @param evt
	 */
	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
		// GEN-FIRST:event_btnAddActionPerformed
		BufferedWriter bw = null;
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;
		BufferedReader fr = null;
		LineNumberReader lnr = null;
		String className = (String) lisClass.getSelectedValue();
		try {
			if (className == null) {
				dialog("请选择班级");
			} else {
				bw = new BufferedWriter(new FileWriter("RollCallSystem\\Original\\" + className + "\\Name.txt"));
				bw1 = new BufferedWriter(new FileWriter("RollCallSystem\\Original\\" + className + "\\Name.txt"));
				String str = txtStudentName.getText().replaceAll("((\r\n)|\n)[\\s\t ]*(\\1)+", "$1");
				bw.write(str);
				bw.flush();
				lnr = new LineNumberReader(
						new BufferedReader(new FileReader("RollCallSystem\\Original\\" + className + "\\Name.txt")), 1);
				String str1 = null;
				while ((str1 = lnr.readLine()) != null) {
					bw1.write(lnr.getLineNumber() + "=" + str1);
					bw1.newLine();
				}

				bw1.close();
				lnr.close();
				File file_1 = new File("RollCallSystem\\Load\\" + className + "\\Name.txt");

				if (!file_1.exists()) {
					fr = new BufferedReader(new FileReader("RollCallSystem\\Original\\" + className + "\\Name.txt"));
					bw2 = new BufferedWriter(new FileWriter("RollCallSystem\\Load\\" + className + "\\Name.txt"));
					String str2 = null;
					while ((str2 = fr.readLine()) != null) {
						bw2.write(str2);
						bw2.newLine();
					}
					bw2.close();
					fr.close();

				}
				dialog(btnAdd.getText() + "成功");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 弹框显示方法
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

	// GEN-LAST:event_btnAddActionPerformed

	/**
	 * 取消
	 * 
	 * @param evt
	 */
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelActionPerformed
		// TODO add your handling code here:
		this.setVisible(false);
	}// GEN-LAST:event_btnCancelActionPerformed

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
			java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddStudent().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	public javax.swing.JButton btnAdd;
	private javax.swing.JButton btnCancel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JList<?> lisClass;
	private javax.swing.JTextArea txtStudentName;
	// End of variables declaration//GEN-END:variables
}
