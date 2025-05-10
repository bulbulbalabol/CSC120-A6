Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
What worked, what didn't, what advice would you give someone taking this course in the future?

Unit testing helped me find mistakes earlier and understand how each class works. Writing tests for small parts of the program showed me how useful unit testing can be for debugging and improving code.

At first, I was unsure how to test methods like printManifest(), but I learned I could just check that it runs without crashing. I also realized I needed to use getPassengers().size() to count passengers, since my class did not have a getPassengerCount() method.

Here is what my tests do:

Engine Tests

testEngineConstructor(): checks if the Engine stores the correct fuel type and level.
testEngineGo(): checks that calling go() lowers the fuel level.
Car Tests
3. testCarAddPassenger(): checks that adding a passenger increases the size of the passenger list.
4. testCarRemovePassenger(): checks that removing a passenger decreases the size of the passenger list.

Passenger Tests
5. testPassengerBoardCarWithSpace(): checks that a Passenger can board a Car with space.
6. testPassengerBoardCarFull(): checks that a Passenger cannot board a Car if it is full.

Train Tests
7. testTrainConstructor(): checks that the Train creates the correct number of Cars.
8. testTrainPassengerCount(): checks that the Train counts all passengers correctly.
9. testTrainGetCar(): checks that getCar() returns a valid Car object.
10. testTrainPrintManifest(): checks that calling printManifest() does not cause an error.

My advice for future students is to test early and test often. Unit testing makes it easier to spot mistakes and feel more confident in your code.
