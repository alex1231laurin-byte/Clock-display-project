Project: clock-display
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

To use this project, create an instance of class ClockDisplay. Then inspect this 
instance and leave the object inspector window open. With the inspector window open, 
call the object's methods, such as timeTick and setTime. Watch the 
"displayString" in the inspector.

The displayString field simulates the actual clock display device. Were this 
program running in a real clock, it would change the real, physical display 
hardware instead of this string. The timeTick method would be triggered once 
every minute by some timer hardware.

Everything else could be pretty much the same.


Note: This project does not implement adequate handling of errors.

21: It starts at 00:00 because it is its default time.
23: We would need to use the timeTick methode 60 times. The other method to make it display
that time would be to use the setTime method.
24: The definition of the variable digit is to store an integer.
26: The second constructor in ClockDisplay creates a clock display object and runs the
SetTime method to get the values hours and minutes from the user. Essencially, it creates
a new clock set on the hours and minutes specified by the user without the need to create
a new clock that's set to 00:00 every time.
27: Because it is already being used in the SetTime method at the end.
28: public void print: System.out.println(filename);
public int getStatus: return delay;
29: It creates new objects and assings each of them to a variable. Then, it runs the methods
that changes the variables to create a picture.
30: roof.changeSize(60, 180);, roof.moveHorizontal(20);, roof.moveVertical(-60); and
roof.makeVisible();.
31: Yes.
32: 2.
33: It gives the remain of the first number.
34: 1, 2, 3 and 4.
35: {-n%m, 0, n%m}.
37: Letting it store hour values from 1 to 12 is better because it is much simpler than
reducing the display string of the clock by 12 when it is above 12 and add am or pm.
