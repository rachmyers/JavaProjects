# Counter Sort Method

Using a defined range of numbers, sort of an array by counting the occurrences of each value. Then starting at the beginning range of numbers, print out each number based on how many times it occurred. Thoroughly test the counter sort algorithm by looping through the array 1,000 times. During each loop, create an array of 100,000 random integers that is passed to the counter sort method to sort. Test each generated array to make sure it is sorted. If not, break out of the loop and print an error message to the console. 

If there is known range of values in an array that can be translated to real numbers, the counter sort algorithm is an ideal way to sort an array. Its best and worst-case runtime scenarios are both linear, which is one of the lowest/best runtime scenarios. This sorting method does not work well with decimal or string values.


## Analysis Steps

Using Java, I first focused on creating the counter sort algorithm. The basic concept is that the unsorted array N is looped through. An inner for loop is created with another array M. The length or array M is equal to the data range of array N. For instance, if array N ranged from values 45--50, array M would have a length of five. In my code, I chose a data range of 1-50 for my unsorted arrays, so I created array M with a length of 51. I added an extra number since arrays are zero-based to make it easier to have the numbers 1--50 represented. I could have also added one to each value at the end, however.

I first created a counterSort method that sorts an array that was passed to it. The method returns an Arraylist and accepts an array of integers as its parameter.  The counterSort method first creates an array M of 51 integers. Then it instantiates an Array List named sortedArray. This Array List is used later on to hold the sorted values and is returned at the end of the method. Then a for loop loops through the array that was passed to it as an argument. A temporary variable is created that equals the value at position i in the array. Then M at index tempNum is incremented by one. This code is counting the occurences of each value in the original array that was passed to it and storing it in array M. For instance, if the value 45 appears three times in array N, then the value three is stored at index 45 in array M. In the if statement, value j is added to the sortedArray. Value j is also printed to the console, and the count variable is incremented. When the count is no longer less than the temporary value, the for loops moves on to the next index in array M.

I created a separate method to test if an array is sorted. It returns a boolean value and accepts an Array List of Integers as a parameter. It loops through the Array List that was passed to it (minus one, since it doesn't need to go to the last index). If the value at the current index is greater than the value at the next index, that means the array is not sorted. Then it returns a value of false. Else, it returns a value of true.

I did the testing in my main method. I created a for loop that loops 1000 times. I also created a nested for loop. For each iteration of the outer loop, an array one 100000 random integers is created in the inner loop. Then, in the outer loop, an if statement is executed that runs the isArraySorted test method, using the counterSort method on the test array that was created. If isArraySorted returns false, an error message is printed to the console, and it breaks out of the loop.

To verify that the isArraySorted works correctly and catches an unsorted array, I added test code (that is now commented out). I created an Array List of unsorted integers. Then I created an if statement. I passed my unsorted array to isArraySorted. If it returned false, it prints an error message to the console. 



### Testing

1. Run the code.
2. Make sure that the build successfully completes and that an error message does not print to the console. 
3. Verify that the arrays of 100,000 integers are printing to the console.
4. Create an array of unsorted integers.
5. Remove the counterSort method call from the if statement so that the counter sort isn't applied to the array.
6. Create a test Array List in the main method.
7. Pass the test Array List to the isArraySorted method call in the main method.
8. Run the code.
9. Verify that the loop does not complete and the created error message prints to the console. This verifies that the isArraySorted method catches unsorted arrays and prints an error message like it's supposed to.



## Do not change content below this line
## Adapted from a README Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
