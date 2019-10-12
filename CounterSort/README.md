# Counter Sort Method

Using a defined range of numbers, sort of an array by counting the occurrences of each value. Then starting at the beginning range of numbers, print out each number based on how many times it occurred. Thoroughly test the counter sort algorithm by looping through the array 1,000 times. During each loop, create an array of 100,000 random integers that is passed to the counter sort method to sort. Test each generated to make sure it is sorted. If not, break out of the loop and print an error message to the console. 

## Example Output

![Sample Output](README.png)

## Analysis Steps

Using Java, I first focused on creating the specified counter sort algorithm. The counterSort method first creates an array M of 51 integers. The possible range of values in an unsorted array in this scenario is 1-50. Since arrays are zero-based, I added an additional number to my array. The method returns an Arraylist and accepts an array of integers as its parameter. An Array List is instantiated. Then a for loop loops through the array that was passed to it as an argument. 

### Design

I created a TextField for the US Dollars field and the Canadian Dollars field. I also created a Convert button. Then I created a GridPane and added the TextFields, Labels for the fields, and the Convert button. I made the Canadian Dollars field read-only. In my action handler for the Convert button, I pulled in the US Dollars value, calculated the conversion, and set the result as the value for the Canadian Dollars field. To make it keyboard-friendly, I also added an action handler that allows users to just press Enter after entering the US Dollar amount. That way they have the option of clicking Convert or pressing Enter.

### Testing

1. Enter a numeric value in the U.S. Dollars field.
2. Verify that the Canadian Dollars doesn't let you enter a value.
3. Click Convert, and verify that the correct amount appears in the Canadian Dollars field (1.5 * the amount entered in the US Dollars field).
4. Enter a different numeric value in the U.S. Dollars field, and then press Enter.
5. Verify that the correct amount appears in the Canadian Dollars field.



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
