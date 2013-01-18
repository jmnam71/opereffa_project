/*******************************************************************************
 * Copyright 2012 Sevket Seref Arikan, David Ingram
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.ac.ucl.chime.gui;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import org.openehr.am.archetype.Archetype;

import se.acode.openehr.parser.ADLParser;
import uk.ac.ucl.chime.utilities.ArchetypeWrapperFactory;
import uk.ac.ucl.chime.utilities.ClipboardManager;
import uk.ac.ucl.chime.wrappers.ClusterWrapper;
import uk.ac.ucl.chime.wrappers.ElementWrapper;
import uk.ac.ucl.chime.wrappers.EvaluationWrapper;
import uk.ac.ucl.chime.wrappers.InstructionWrapper;
import uk.ac.ucl.chime.wrappers.RIMWrapper;
import uk.ac.ucl.chime.wrappers.archetypewrappers.ArchetypeWrapper;
import uk.ac.ucl.chime.wrappers.archetypewrappers.EvaluationArchetypeWrapper;
import uk.ac.ucl.chime.wrappers.archetypewrappers.InstructionArchetypeWrapper;
import uk.ac.ucl.chime.wrappers.archetypewrappers.ObservationArchetypeWrapper;

/**
 *
 * @author  __USER__
 */
public class ParserTestForm extends javax.swing.JFrame {

	protected String beginXHTML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
			+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n"
			+ "\r\n"
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\"\r\n"
			+ "	xmlns:ui=\"http://java.sun.com/jsf/facelets\"\r\n"
			+ "	xmlns:h=\"http://java.sun.com/jsf/html\"\r\n"
			+ "	xmlns:f=\"http://java.sun.com/jsf/core\" xml:lang=\"en\" lang=\"en\">\r\n"
			+ "	<ui:composition template=\"archetypeFormTemplate.xhtml\">\r\n"
			+ "		<ui:define name=\"archetypeFormContent\">\n";
	protected String endXHTML = "</ui:define>		\r\n" + "	</ui:composition>\r\n"
			+ "</html>";

	/** Creates new form ParserTestForm */
	public ParserTestForm() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtLog = new javax.swing.JTextArea();
		txtXHTMLFileName = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtXHTMLLinkSource = new javax.swing.JTextField();
		cmdCopyXHTMLFileName = new javax.swing.JButton();
		cmdCopyXHTMLLink = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(3);

		jButton1.setText("Select Archetype");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		txtLog.setColumns(20);
		txtLog.setRows(5);
		jScrollPane1.setViewportView(txtLog);

		jLabel1.setText("XHTML File Name");

		jLabel2.setText("Html Link source");

		cmdCopyXHTMLFileName.setText("Copy");
		cmdCopyXHTMLFileName
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						cmdCopyXHTMLFileNameActionPerformed(evt);
					}
				});

		cmdCopyXHTMLLink.setText("Copy");
		cmdCopyXHTMLLink.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmdCopyXHTMLLinkActionPerformed(evt);
			}
		});

		jLabel3.setText("Facelet File Content");

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																jScrollPane1,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																754,
																Short.MAX_VALUE)
														.add(jButton1)
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								jLabel1)
																						.add(
																								jLabel2))
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.TRAILING,
																								false)
																						.add(
																								org.jdesktop.layout.GroupLayout.LEADING,
																								txtXHTMLLinkSource)
																						.add(
																								org.jdesktop.layout.GroupLayout.LEADING,
																								txtXHTMLFileName,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								357,
																								Short.MAX_VALUE))
																		.add(
																				18,
																				18,
																				18)
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								cmdCopyXHTMLLink)
																						.add(
																								cmdCopyXHTMLFileName)))
														.add(jLabel3))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.add(jButton1)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.UNRELATED)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel1)
														.add(
																txtXHTMLFileName,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(
																cmdCopyXHTMLFileName))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(cmdCopyXHTMLLink)
														.add(jLabel2)
														.add(
																txtXHTMLLinkSource,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED,
												20, Short.MAX_VALUE)
										.add(jLabel3)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.UNRELATED)
										.add(
												jScrollPane1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												359,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void cmdCopyXHTMLLinkActionPerformed(java.awt.event.ActionEvent evt) {
		ClipboardManager tt = new ClipboardManager();
		tt.setClipboardContents(txtXHTMLLinkSource.getText());
	}

	private void cmdCopyXHTMLFileNameActionPerformed(
			java.awt.event.ActionEvent evt) {
		ClipboardManager tt = new ClipboardManager();
		tt.setClipboardContents(txtXHTMLFileName.getText());
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			JFileChooser chooser = new JFileChooser();
			javax.swing.filechooser.FileFilter filter = new javax.swing.filechooser.FileFilter() {

				@Override
				public boolean accept(File f) {
					return f.getName().endsWith("adl");
				}

				@Override
				public String getDescription() {
					return "openEHR Archetype Definition Language (.adl) file";
				}
			};
			//chooser.setFileFilter(filter);
			int returnVal = chooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String filePath = chooser.getSelectedFile().getAbsolutePath();
				ArchetypeWrapperFactory factory = new ArchetypeWrapperFactory();
				ArchetypeWrapper wrapper = factory.loadFromFile(filePath);
				String formText = beginXHTML + wrapper.getJSFForm() + endXHTML;
				formText = formText.replaceAll("&", "&amp;");
				txtLog.setText(formText);
				String jsfFileName = chooser.getSelectedFile().getName()
						.replaceAll(".adl", ".jsf");
				String xhtmlFileName = chooser.getSelectedFile().getName()
						.replaceAll(".adl", ".xhtml");
				String linkText = "<li><a href=\"#\" class=\"archetypeLink\"  onmouseover=\"archLinkMouseOver(this);\" onmouseout=\"archLinkMouseOut(this)\" onclick=\"getArchetypeForm('"
						+ jsfFileName
						+ "');return false;\">Observation - Investigations</a></li>";
				txtXHTMLFileName.setText(xhtmlFileName);
				txtXHTMLLinkSource.setText(linkText);
			}
			//loadArchetype(new File("Q:\\archetypes\\tony\\openEHR-EHR-EVALUATION.SOAP_Assessment_aspect.v1draft.adl"));
			//		loadArchetype(new File("Q:\\archetypes\\tony\\openEHR-EHR-INSTRUCTION.SOAP_Plan_aspect.v1draft.adl"));
			//			loadArchetype(new File("q:\\archetypes\\tony\\openEHR-EHR-OBSERVATION.SOAP_Examinationsa.v1draft.adl"));
			//			loadArchetype(new File("q:\\archetypes\\tony\\openEHR-EHR-OBSERVATION.SOAP_History.v2draft.adl"));
			//			loadArchetype(new File("q:\\archetypes\\tony\\openEHR-EHR-OBSERVATION.SOAP_Investigations_SA.v3draft.adl"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void loadArchetype(File pAdlFile) throws Exception {
		try {
			ADLParser parser = new ADLParser(pAdlFile);
			Archetype arc = parser.parse();
			//txtLog.setText(arc.getDefinition().getRmTypeName() + "\n");
			ArchetypeWrapperFactory factory = new ArchetypeWrapperFactory();
			ObservationArchetypeWrapper oaw = new ObservationArchetypeWrapper(
					arc, factory);

			//			ArrayList<String> testPaths = getTestPaths();
			//			for(String s : testPaths){
			//				Object o = oaw.getElementValue(s);
			//				System.out.println(o.toString());
			//			}
			//			txtLog.setText(oaw.getJSFForm());
			//			Object o = oaw.getRootWrapper().getTestInstance();
			//printobservationArchetype(oaw.getRootWrapper());

			//EvaluationArchetypeWrapper eaw = new EvaluationArchetypeWrapper(arc);
			//printEvaluationArchetype(eaw.getRootEvaluation());

			//			InstructionArchetypeWrapper iaw = new InstructionArchetypeWrapper(arc);
			//			txtLog.setText(iaw.getJSFForm());
			//			Object o = iaw.getRootWrapper().getTestInstance();
			//			printInstructionArchetype((InstructionWrapper) iaw.getRootWrapper());

//			System.out.println("tsat");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	private void printobservationArchetype(RIMWrapper rootWrapper)
			throws Exception {
		txtLog.setText(rootWrapper.getGUITestString());

	}

	private void printInstructionArchetype(InstructionWrapper wrapper)
			throws Exception {
		txtLog.setText(wrapper.getGUITestString());
	}

	//	private void printEvaluationArchetype(EvaluationWrapper ew) throws Exception{
	//		System.out.println(ew.getGUITestString());
	//		for(int i = 0; i < ew.getItemWrappers().size(); i++){
	//			if (ew.getItemWrappers().get(i) instanceof ClusterWrapper)
	//				txtLog.setText( txtLog.getText() + "\n" +((ClusterWrapper) ew.getItemWrappers().get(i)).getGUITestString());
	//			else if (ew.getItemWrappers().get(i) instanceof ElementWrapper)
	//				txtLog.setText( txtLog.getText() + "\n" + ew.getItemWrappers().get(i).getGUITestString());
	//		}
	//	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
		
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ParserTestForm().setVisible(true);
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> getTestPaths() {
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("/data[at0001]/events[at0002]/data[at0003]/items[at0004]");
		temp.add("/data[at0001]/events[at0002]/data[at0003]/items[at0036]");
		temp.add("/data[at0001]/events[at0002]/data[at0003]/items[at0006]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0014]/items[at0020]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0014]/items[at0005]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0021]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0022]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0023]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0024]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0025]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0027]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0028]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0015]/items[at0007]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0016]/items[at0029]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0016]/items[at0031]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0016]/items[at0032]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0016]/items[at0033]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0016]/items[at0034]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0017]/items[at0009]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0017]/items[at0035]");
		temp
				.add("/data[at0001]/events[at0002]/data[at0003]/items[at0017]/items[at0018]");
		return temp;
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton cmdCopyXHTMLFileName;
	private javax.swing.JButton cmdCopyXHTMLLink;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea txtLog;
	private javax.swing.JTextField txtXHTMLFileName;
	private javax.swing.JTextField txtXHTMLLinkSource;
	// End of variables declaration//GEN-END:variables

}
