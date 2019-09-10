# Assignment1

This is a java Program that contains simple glossary of words.

On executing the program , a simple frame will be displayed containing three buttons .The three button are : All ,List and Category.
The three buttons will display the glossary in different formats .
All- This will display all the words added to the system .
Category - This will display all the words in alphabetical order.
List - This will display the words along with their meaning.This words are not in alphabetical order but on clicking once at the top of the         table will bring the table in a alphabetical order.on clicking it again will bring the list of words in descending order.

By clicking on the required word in 'All' and 'category'.The word and its definition will be displayed in a seperate frame with a back button.On pressing the back button the user will be redirected to the main frame.

There are 4 Classes in this program, they are as follows:

1) Glossary : It is the class containing 'main' function with the opening Screen
2) Screen : This is the class with different format of the glossary.
			It has 'ALL', 'CATEGORY' and 'LIST' TABS to toggle between different viewing options
			Methods included in this class are:
				regularScreen() : Screen when no tabs are selected
				defaultScreen() : Screen when ALL Tab is selected
				alphaScreen()   : Screen when CATEGORY Tab is selected
				listScreen()	: Screen when List Tab is selected
				getLabel()		: To send the list of labels used
				onMouseClicked(): To get the index of the label selected
3) Brief : 	This class displays the meaning of the words selected
			Methods included in this class are:
				onMouseClicked(): To get the index of the label selected
4) DefaultWords :  It is a repository of 20 words along with their meanings stored in a string array
			Methods included are:
				getWords()	: return the array of words
				getMean()	: return the array of meanings of the words
				getList()	: returns the matrix of words and their meanings
				getSize()	: returns the size of the array
				
How to Run the Code??

The program can be run on any system supporting JAVA by simple command on command prompt or running it on any IDE like Eclipse

Flow the program goes like:

Glossary--->Screen---->DefaultWords--->Brief 
