# First-Java-Game Overview

In this program I aimed to learn about Java and create a basic Tetris-like game. I ended up doing too much research and not completely applying what I learned before looking into more things, so I didn't develop the game very well and ended up with a lot of notes and only split-focus. However, the goal was to have a simple array of blocks with negative and positive values fall down, and the goals was to have each row be a neutral value, to then disappear like Tetris.

I had some trouble with the wait command, with Thread.Sleep, but got a loop made to test that, which worked. I also successfully made a JPanel/JFrame for a custom game window, and a JLabel to represent a block. All looked good and was working, but I attempted to move the code into separate classes and files to improve readability and organization, but was unsuccessful. So, I reverted the Jframe code to the main method to restore functionality. As it stands, I have a better grasp on how certain Java objects work, and now know that I need to implement what I learn while what I am learning is still fresh in my mind and make sure it all works well before moving on. Make the code my own, so to speak. Examples from the internet only work as well as your use and implementation of them.

I also looked a lot into threads to use multiple timers (for game speed and user input speed), but upon reflection realized that that was unnecessary if I just used a quick gameTick limited by a system of timestamps to match the desired input speed and block-movement speeds.

[Demo Video](https://youtu.be/-BphBRK0DX8)

# Development Environment

I used Visual Studio Code to write the program in Java, importing several libraries from java.awt and javax.swing, including resources for JFrames, JPanels, JLabels, and ArrayLists.

# Useful Websites

- [help for time](https://www.javatpoint.com/java-get-current-date#:~:text=Get%20Current%20Date%20%26%20Time%3A%20java.time.Clock,current%20date%20and%20time%20both.)
- [short tutorial](https://www.youtube.com/watch?v=RRubcjpTkks)
- [long tutorial](https://www.youtube.com/watch?v=A74TOX803D0)
- [w3schools tutorial course](https://www.w3schools.com/java/default.asp)
- [w3schools try catch](https://www.w3schools.com/java/java_try_catch.asp)
- [double to long casting](https://www.baeldung.com/java-convert-double-long)
- [java threads](https://jenkov.com/tutorials/java-concurrency/creating-and-starting-threads.html#:~:text=Creating%20a%20thread%20in%20Java,thread.)
- [naming tips (TimeSpan datatype)](https://www.youtube.com/watch?v=-J3wNP6u5YU)
- [JFrame and keypressing](https://www.educative.io/answers/how-to-listen-to-and-take-action-on-keyboard-strokes-in-java)
- [more on JFrames](https://alvinalexander.com/java/java-set-jframe-size/)
- [JFrame tutorial](https://www.youtube.com/watch?v=Kmgo00avvEw)
- [Changing variables in a lambda function](https://unsekhable.com/2020/07/31/how-to-resolve-local-variable-defined-in-an-enclosing-scope-must-be-final-or-effectively-final-error/)

# Future Work

- Create either an array of labels to display, or add a label to the element datatype and use the element array (gameGrid) to display the whole board
- Implement gravity updates
- Connect key presses (successfully detected) to movement of a single falling element to allow gameplay
- Create a menu and/or system of progressing from level to level
- Stretch goal: Keep a list of what combos the user matches on a row to create an extra subgoal for the player (get new combos)
