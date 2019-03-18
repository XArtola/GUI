package com.zubiri.matchesGui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.AbstractAction;
import javax.swing.Action;
import com.zubiri.matches.*;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.CardLayout;
import javax.swing.JMenu;

public class MatchGui {

	private JFrame frame;
	private JTextField txtFindForA;
	private final Action action = new SwingAction();
	private JComboBox comboBox;
	private JTextPane textPaneName;
	private JLabel lblName;
	private JPanel teamPanel;
	private JTextPane textPaneStadium;
	private JLabel lblStadium;
	private JTextPane textPaneWonLeagues;
	private JLabel lblWonLeagues;
	private JTextPane textPaneShirtColor;
	private JLabel lblShirtColor;
	private JLabel label_4;
	private JTextPane textPane_4;
	private JLabel label_5;
	private JTextPane textPane_5;
	private JLabel label_6;
	private JTextPane textPane_6;
	private JLabel label_7;
	private JTextPane textPane_7;
	private JPanel matchPanel;
	private JLabel label;
	private JTextPane textPanePlayerName;
	private JTextPane textPanePlayerTeam;
	private JLabel lblTeam;
	private JTextPane textPanePlayerAge;
	private JLabel lblAge;
	private JTextPane textPanePlayerHeight;
	private JPanel playerPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchGui window = new MatchGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MatchGui() {
		initialize();
	}

	public JFrame getFrame() {
		return this.frame;
	}
	
	public JComboBox getCombobox() {
		return this.comboBox;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 311, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		teamPanel = new JPanel();
		teamPanel.setBounds(0, 159, 295, 177);
		teamPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(teamPanel);
		teamPanel.setVisible(false);
		teamPanel.setLayout(null);
		
		lblName = new JLabel("Name");
		lblName.setBounds(0, 0, 295, 177);
		lblName.setBackground(new Color(204, 204, 204));
		teamPanel.add(lblName);
		
		textPaneName = new JTextPane();
		textPaneName.setBounds(-10008, -10190, 295, 177);
		textPaneName.setBackground(new Color(204, 204, 204));
		textPaneName.setEditable(false);
		teamPanel.add(textPaneName);
		
		textPaneStadium = new JTextPane();
		textPaneStadium.setBounds(-10008, -10190, 295, 177);
		textPaneStadium.setBackground(new Color(204, 204, 204));
		textPaneStadium.setEditable(false);
		teamPanel.add(textPaneStadium);
		
		lblStadium = new JLabel("Stadium");
		lblStadium.setBounds(-10008, -10190, 295, 177);
		lblStadium.setBackground(new Color(204, 204, 204));
		teamPanel.add(lblStadium);
		
		textPaneWonLeagues = new JTextPane();
		textPaneWonLeagues.setBounds(-10008, -10190, 295, 177);
		textPaneWonLeagues.setBackground(new Color(204, 204, 204));
		textPaneWonLeagues.setEditable(false);
		teamPanel.add(textPaneWonLeagues);
		
		lblWonLeagues = new JLabel("Won leagues");
		lblWonLeagues.setBounds(-10008, -10190, 295, 177);
		lblWonLeagues.setBackground(new Color(204, 204, 204));
		teamPanel.add(lblWonLeagues);
		
		lblShirtColor = new JLabel("Shirt color");
		lblShirtColor.setBounds(-10008, -10190, 295, 177);
		lblShirtColor.setBackground(new Color(204, 204, 204));
		teamPanel.add(lblShirtColor);
		
		textPaneShirtColor = new JTextPane();
		textPaneShirtColor.setBounds(-10008, -10190, 295, 177);
		teamPanel.add(textPaneShirtColor);
		textPaneShirtColor.setBackground(new Color(204, 204, 204));
		textPaneShirtColor.setEditable(false);
		
		matchPanel = new JPanel();
		matchPanel.setBounds(-10008, -10190, 295, 177);
		teamPanel.add(matchPanel);
		matchPanel.setVisible(false);
		matchPanel.setLayout(null);
		
		label_4 = new JLabel("Name");
		label_4.setBounds(28, 5, 27, 14);
		label_4.setBackground(new Color(204, 204, 204));
		matchPanel.add(label_4);
		
		textPane_4 = new JTextPane();
		textPane_4.setBounds(60, 9, 7, 6);
		textPane_4.setEditable(false);
		textPane_4.setBackground(new Color(204, 204, 204));
		matchPanel.add(textPane_4);
		
		label_5 = new JLabel("Stadium");
		label_5.setBounds(72, 5, 38, 14);
		label_5.setBackground(new Color(204, 204, 204));
		matchPanel.add(label_5);
		
		textPane_5 = new JTextPane();
		textPane_5.setBounds(115, 9, 7, 6);
		textPane_5.setEditable(false);
		textPane_5.setBackground(new Color(204, 204, 204));
		matchPanel.add(textPane_5);
		
		label_6 = new JLabel("Won leagues");
		label_6.setBounds(127, 5, 62, 14);
		label_6.setBackground(new Color(204, 204, 204));
		matchPanel.add(label_6);
		
		textPane_6 = new JTextPane();
		textPane_6.setBounds(194, 9, 7, 6);
		textPane_6.setEditable(false);
		textPane_6.setBackground(new Color(204, 204, 204));
		matchPanel.add(textPane_6);
		
		label_7 = new JLabel("Shirt color");
		label_7.setBounds(206, 5, 48, 14);
		label_7.setBackground(new Color(204, 204, 204));
		matchPanel.add(label_7);
		
		textPane_7 = new JTextPane();
		textPane_7.setBounds(259, 9, 7, 6);
		textPane_7.setEditable(false);
		textPane_7.setBackground(new Color(204, 204, 204));
		matchPanel.add(textPane_7);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(0, 0, 295, 175);
		matchPanel.add(playerPanel);
		playerPanel.setBackground(Color.WHITE);
		playerPanel.setLayout(null);
		
		textPanePlayerAge = new JTextPane();
		textPanePlayerAge.setBounds(64, 9, 7, 6);
		playerPanel.add(textPanePlayerAge);
		textPanePlayerAge.setEditable(false);
		textPanePlayerAge.setBackground(new Color(204, 204, 204));
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(76, 5, 31, 14);
		playerPanel.add(lblHeight);
		lblHeight.setBackground(new Color(204, 204, 204));
		
		lblTeam = new JLabel("Team");
		lblTeam.setBounds(112, 5, 26, 14);
		playerPanel.add(lblTeam);
		lblTeam.setBackground(new Color(204, 204, 204));
		
		textPanePlayerHeight = new JTextPane();
		textPanePlayerHeight.setBounds(143, 9, 7, 6);
		playerPanel.add(textPanePlayerHeight);
		textPanePlayerHeight.setEditable(false);
		textPanePlayerHeight.setBackground(new Color(204, 204, 204));
		
		textPanePlayerTeam = new JTextPane();
		textPanePlayerTeam.setBounds(155, 9, 7, 6);
		playerPanel.add(textPanePlayerTeam);
		textPanePlayerTeam.setEditable(false);
		textPanePlayerTeam.setBackground(new Color(204, 204, 204));
		
		textPanePlayerName = new JTextPane();
		textPanePlayerName.setBounds(167, 9, 7, 6);
		playerPanel.add(textPanePlayerName);
		textPanePlayerName.setEditable(false);
		textPanePlayerName.setBackground(new Color(204, 204, 204));
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(179, 5, 19, 14);
		playerPanel.add(lblAge);
		lblAge.setBackground(new Color(204, 204, 204));
		
		label = new JLabel("Name");
		label.setBounds(203, 5, 27, 14);
		playerPanel.add(label);
		label.setBackground(new Color(204, 204, 204));
		
		txtFindForA = new JTextField();
		txtFindForA.setBounds(102, 33, 183, 35);
		txtFindForA.setToolTipText("");
		frame.getContentPane().add(txtFindForA);
		txtFindForA.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.setBounds(10, 79, 275, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teamPanel.setVisible(false);
				playerPanel.setVisible(false);
				matchPanel.setVisible(false);
				if(comboBox.getSelectedItem().equals("Team")) {
					teamPanel.setVisible(true);
					File toRead2 = new File("src/TeamInfo.txt");
					Teams teams = new Teams();
					try {
						Scanner sc = new Scanner(toRead2);
						while (sc.hasNextLine()) {
							FootballTeam team1 = new FootballTeam();
							String lineValues[] = sc.nextLine().split("::");
							team1.setName(lineValues[0]);
							team1.setStadium(lineValues[1]);
							team1.setWonLeagues(Integer.parseInt(lineValues[2]));
							team1.setShirtColor(lineValues[3]);
							teams.add(team1);
						}
						
						int position = teams.findTeam(txtFindForA.getText().toLowerCase());
						if(position >= 0) {
							textPaneName.setText(teams.getTeam(position).getName());
							textPaneStadium.setText(teams.getTeam(position).getStadium());
							textPaneWonLeagues.setText(Integer.toString(teams.getTeam(position).getWonLeagues()));
							textPaneShirtColor.setText(teams.getTeam(position).getShirtColor());
						}else {
							textPaneName.setText("Not found");
							textPaneStadium.setText("Not found");
							textPaneWonLeagues.setText("Not found");
							textPaneShirtColor.setText("Not found");
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (Exception e) {
						System.out.println("Unable to check the sport");
					}
				}else if(comboBox.getSelectedItem().equals("Player")) {
					playerPanel.setVisible(true);
					File toRead2 = new File("src/Players.txt");
					Players players = new Players();
					try {
						Scanner sc = new Scanner(toRead2);
						while (sc.hasNextLine()) {
							Player player1 = new Player();
							String lineValues[] = sc.nextLine().split("::");
							player1.setName(lineValues[0]);
							player1.setTeam(lineValues[1]);
							player1.setAge(Integer.parseInt(lineValues[2]));
							player1.setHeight(Integer.parseInt(lineValues[3]));
							player1.setSport("football");
							players.add(player1);
						}
						
						int position = players.findPlayer(txtFindForA.getText().toLowerCase());
						if(position >= 0) {
							JPanel a = new JPanel();
							textPanePlayerName.setText(players.getPlayer(position).getName());
							textPanePlayerTeam.setText(players.getPlayer(position).getTeam());
							textPanePlayerAge.setText(Integer.toString(players.getPlayer(position).getAge()));
							textPanePlayerHeight.setText(Integer.toString(players.getPlayer(position).getHeight()));
						}else {
							textPanePlayerName.setText("Not found");
							textPanePlayerTeam.setText("Not found");
							textPanePlayerAge.setText("Not found");
							textPanePlayerHeight.setText("Not found");
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (Exception e) {
						System.out.println("Unable to check the sport");
					}
				}else {
					matchPanel.setVisible(true);
					
				}
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBackground(Color.WHITE);
		frame.getContentPane().add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(10, 33, 82, 35);
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setBackground(Color.WHITE);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Team");
		comboBox.addItem("Player");
		comboBox.addItem("Match");
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Find");
			putValue(SHORT_DESCRIPTION, "find information about the selected category");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
