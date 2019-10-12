# Counter Sort Method

Using a defined range of numbers, sort of an array by counting the occurrences of each value. Then starting at the beginning range of numbers, print out each number based on how many times it occurred. Thoroughly test the counter sort algorithm by looping through the array 1,000 times. During each loop, create an array of 100,000 random integers that is passed to the counter sort method to sort. Test each generated to make sure it is sorted. If not, break out of the loop and print an error message to the console. 


## Analysis Steps

Using Java, I first focused on creating the specified counter sort algorithm. The counterSort method first creates an array M of 51 integers. The possible range of values in an unsorted array in this scenario is 1-50. Since arrays are zero-based, I added an additional number to my array. The method returns an Arraylist and accepts an array of integers as its parameter. An Array List is instantiated. Then a for loop loops through the array that was passed to it as an argument. 



### Testing

1. Run the code.
2. Make sure the build successfully completes and that an error message does not print to the console.
3. Create an array of unsorted integers.
4. Remove the counterSort method call from the if statement so that the counter sort isn't applied to the array.
5. Create a test Array List in the main method.
6. Pass the test Array List to the isArraySorted method call in the main method.
7. Run the code.
8. Verify that the loop does not complete and the created error message prints to the console. This verifies that the isArraySorted method catches unsorted arrays and prints an error message like it's supposed to.



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
