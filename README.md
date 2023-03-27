# FoodTruckProject

# Overview
Create an app that allows users to input a list of food trucks that included their cuisine, ratings, and an automatically generated ID number. The app would then present a menu allowing the user to view a list of all food trucks, average rating, and view highest-rated truck.

# Technologies Used
- Java~OOP
- Eclipse
- Git

# Lesson Learned
- Given the detail needed to complete this project I mapped out my plan with pen and paper first and reordered things based on the progression I wanted the app to flow.   
- I then split items that appeared to be segregated into their own methods. This is when I decided to use a switch nested in a do-while loop for my menu because it looked very similar to the LoopMenu lab our class completed during the WhileLoops section.
- The FoodTruckApp file starts by defining a FoodTruck array named 'fleet' and initializing it as an array of five. I also declared two private variables: 'numTrucks' and 'setTruckId' that I would use throughout FoodTruckApp. I initialized 'setTruckId' to 1 so it would be more user friendly by excluding "0" on the print out.
- The next portion of code is the main method which has a new instance of class FoodTruckApp and imports a Scanner. 
- In the main I built a for loop that prints and loops through a set of input prompts five times so long as the user does not input "quit" as the name of the food truck. 
- Following user input on the final question of each loop the program uses a new FoodTruck class declared as createTruck to store the gathered information about each food truck into the array. Additionally, both 'setTruckId' and 'numTrucks' increment with the '++' shorthand. 
- After the initial for loop the menu is printed to show the user available options: List of Food Trucks, Average Rating, Highest Rated, Quit. The options are built into a switch using int 1-4 as well as a default error message which is output should anything else be input. This switch is enclosed in a do-while loop so it cycles until a 4 is input.
- Each selection points to a unique method that is outside of the main class. 


- The printMenu() method prints the available options (1-4) for the user.
- The printList() method displays a list of all food trucks, including their full data, created by the user and added to the array. The last line calls printMenu().
- The printAvg() method calculates and displays the average rating of all food trucks created by the user. A for loop is used to ensure the calculation contains the correct number of food trucks input by the user. For the output I utilized printf() and the specifier '%.1f' so my result would only print to one decimal place (vs. "2.3333333333333335"). The last line calls printMenu().
- The printTop() method displays the highest rated food truck created by the user. A new variable is declared as topRated and initialized it as the first food truck in the array 'fleet'. The for loop cycles through all food trucks in the array based on the value of numTrucks. The first food truck in the array is by default the highest rated truck until the loop cycles through the array finding a higher rating 'fleet[i]' at which point the 'topRated' variable is updated to point to this food truck in the array. The array for the top rated food truck is then called (topRated.toString()) and all data on the top rated food truck object is printed to the screen. The last line calls printMenu().
- The printQuit() method prints a closing message to the user and exits the program.
- the printInvalid() method prints an error message. The last line calls printMenu().


- The FoodTruck class includes default variables: name, ID, cuisine, and rating. The class includes a constructor that takes in the four parameters and provides getter and setter methods for each variable. Note: the truck ID does not have a setter method as the user is not responsible for inputting this.
- The toString() method is overridden to return a string representation of each food truck and its data based on user input and the ID # assigned (1-5).