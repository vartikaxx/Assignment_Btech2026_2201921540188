Problem Statement 1: Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods to display pet details and calculate the pet's age in human years.
Platform used: w3resource

Approach: Firstly, we'll create a parent class named "Pet", we'll create the following: 
constructor: to take in the values of pets 
display method: to display the details of members 
human_age method: to convert pet's age to human age

Secondly, we'll create a subclass named "Dog" that extends pet, we'll create the following: 
constructor: to take in the values od dogs along with their fav toy
display method: tto display the parent class display using super and dog's fav toy

One more subclass will be created named "Bird" that extends pet, it will have the following:
constructor: to take in the values of a bird
display method: to display details along with wing span

In the main function, we'll create objects for both the subclasses and call them.
