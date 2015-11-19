package hipster.view;

import hipster.controller.HipsterController;
import hipster.model.Book;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;

	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The Author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("the Subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new JButton("Change books");
		baseLayout.putConstraint(SpringLayout.NORTH, changeBookButton, -5, SpringLayout.NORTH, bookAuthorLabel);
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterPhrases().length;
		startClick = 0;

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupComboBox()
	{
		String[] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(bookAuthorLabel);
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(bookSubjectLabel);
		this.add(changeBookButton);
	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.NORTH, bookPriceLabel, 6, SpringLayout.SOUTH, bookSubjectLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookSubjectLabel, 6, SpringLayout.SOUTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookSubjectLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookAuthorLabel, 0, SpringLayout.WEST, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookAuthorLabel, -6, SpringLayout.NORTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookPageCountLabel, 160, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, bookPageCountLabel, -72, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookTitleLabel, -6, SpringLayout.NORTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeBookButton, 0, SpringLayout.WEST, phraseComboBox);
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 10, SpringLayout.NORTH, this);
	}

	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}

		});

		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book[] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if (startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getPageCount());
					bookPriceLabel.setText("Book price" + tempBooks[startClick].getPrice());
					startClick++;

				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages:");
					bookPriceLabel.setText("Book price: ");

				}

			}

		});
	}
}