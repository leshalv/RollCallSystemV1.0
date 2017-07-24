
package com.leshalv;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;

/**
 * 
 * @author SanLi
 */
public class AddClass extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8022240965611561241L;

	/**
	 * Creates new form AddClass
	 */
	public AddClass() {
		load();
		initComponents();

		// 更改窗体的图标
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("images\\png-0098.png");
		setIconImage(i);

	}

	@SuppressWarnings("rawtypes")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		lisClass = new javax.swing.JList();
		jScrollPane3 = new javax.swing.JScrollPane();
		txtClassName = new javax.swing.JTextArea();
		btnAdd = new javax.swing.JButton();
		btnCancel = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator2 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}

			/**
			 * 关闭事件
			 * 
			 * @param evt
			 */
			private void formWindowClosed(WindowEvent evt) {
				// TODO Auto-generated method stub
				if (Main.main != null) {
					Main.main.jMenu21.removeAll();
					Main.main.load();
				}

			}
		});
		setTitle("添加班级");
		setMaximumSize(new java.awt.Dimension(382, 576));
		setName("AddClass"); // NOI18N
		setResizable(false);

		lisClass.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		flush();
		lisClass.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				lisClassValueChanged(evt);
			}

		});
		jScrollPane1.setViewportView(lisClass);

		txtClassName.setColumns(20);
		txtClassName.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		txtClassName.setRows(5);
		jScrollPane3.setViewportView(txtClassName);

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
	 * 窗口加载时将Load文件夹下的所有文件夹名称添加进去
	 */
	@SuppressWarnings("finally")
	public String[] load() {
		@SuppressWarnings("unused")
		String name = "";
		String fileName[] = null;
		File file = null;
		File loadFile = null;
		try {
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
	 * 列表选中事件
	 * 
	 * @param evt
	 */
	private void lisClassValueChanged(ListSelectionEvent evt) {
		// TODO Auto-generated method stub
		if (btnAdd.getText().trim().equals("修改")) {
			String className = (String) lisClass.getSelectedValue();
			txtClassName.setText(className);
		}

	}

	/**
	 * 添加班级
	 * 
	 * @param evt
	 */
	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		String className = txtClassName.getText().trim();
		if (btnAdd.getText().trim().equals("添加")) {
			if (!className.equals("")) {
				// TODO add your handling code here:

				BufferedWriter bw = null;
				BufferedReader br = null;
				File fileOriginal = null;
				File fileDelete = null;
				File fileLoad = null;
				try {
					bw = new BufferedWriter(new FileWriter("RollCallSystem\\ClassName.txt"));
					br = new BufferedReader(new FileReader("RollCallSystem\\ClassName.txt"));
					bw.write(className);
					bw.newLine();
					bw.flush();

					String name = null;
					while ((name = br.readLine()) != null) {
						fileOriginal = new File("RollCallSystem\\Original\\" + name);
						fileLoad = new File("RollCallSystem\\Load\\" + name);
						fileOriginal.mkdir();
						fileLoad.mkdir();
					}
					dialog("添加成功");
					txtClassName.setText("");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					flush();

					try {
						br.close();
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						fileDelete = new File("RollCallSystem\\ClassName.txt");
						fileDelete.delete();
					}

				}
			} else {
				dialog("请输入班级名称");
			}
		} else if (btnAdd.getText().trim().equals("修改")) {

			try {
				String lisName = (String) lisClass.getSelectedValue();
				if (lisName == null) {
					dialog("请选择班级");
				} else if (!txtClassName.getText().trim().equals("")) {

					String className1 = txtClassName.getText().trim();
					File file = new File("RollCallSystem\\Original\\" + lisName.trim());
					File file1 = new File("RollCallSystem\\Load\\" + lisName.trim());
					File newName = new File("RollCallSystem\\Original\\" + className1);
					File newName1 = new File("RollCallSystem\\Load\\" + className1);

					file.renameTo(newName);
					file1.renameTo(newName1);
					dialog("修改成功");
					flush();

				} else {
					dialog("请输入班级名");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}// GEN-LAST:event_btnAddActionPerformed

	/**
	 * 刷新列表
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void flush() {
		load();
		lisClass.setModel(new javax.swing.AbstractListModel() {
			private static final long serialVersionUID = 4991328138687045452L;
			String[] strings = load();

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(lisClass);
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

	/**
	 * 取消
	 * 
	 * @param evt
	 */
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelActionPerformed
		// TODO add your handling code here:
		this.dispose();
		if (Main.main != null) {
			Main.main.jMenu21.removeAll();
			Main.main.load();
		}
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
			java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddClass().setVisible(true);
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
	@SuppressWarnings("rawtypes")
	private javax.swing.JList lisClass;
	private javax.swing.JTextArea txtClassName;
	// End of variables declaration//GEN-END:variables
}
