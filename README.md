Simple Java CSV Reader / Writer
===============================

This package provides some Java classes to help with the reading and writing of CSV files using Java annotations.

* For more information, visit the [home page](http://256stuff.com/sources/simplecsv/).	
* In the sourcecode there is a [simple working example program](http://256stuff.com/sources/simplecsv/docs/example-simple).
* Online documentation can be found off the home page including [full Javadocs](http://256stuff.com/sources/simplecsv/javadoc/simplecsv/).
* The source is available from the [git repository](https://github.com/j256/simplecsv).	 [![CircleCI](https://circleci.com/gh/j256/simplecsv.svg?style=svg)](https://circleci.com/gh/j256/simplecsv) [![CodeCov](https://img.shields.io/codecov/c/github/j256/simplecsv.svg)](https://codecov.io/github/j256/simplecsv/)
* Maven packages are published via [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.j256.simplecsv/simplecsv/badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/com.j256.simplecsv/simplecsv/)
* Javadocs: [![javadoc](https://javadoc.io/badge2/com.j256.simplecsv/simplecsv/javadoc.svg)](https://javadoc.io/doc/com.j256.simplecsv/simplecsv)

Enjoy.  Gray Watson

## Quick Example:

Define your entity with the fields marked with the @CsvColumn annotation, can also mark get/set methods:

	public class Account {
		@CsvColumn(columnName = "Name")
		private String name;
		@CsvColumn(columnName = "Account Number")
		private long number;
		...
	}

Create a CSV processor for the Account class.

	CsvProcessor<Account> csvProcessor = new CsvProcessor<Account>(Account.class);

Write out all of the accounts from a list of them to a CSV file with a header:

	File csvFile = new File(CSV_FILE_PATH);
	csvProcessor.writeAll(csvFile, accountList, true /* write header */);

This generates the following output:

	"Name","Account Number"
	"Bill Smith",1
	"Foo Bar",2
	"Jim Jimston",3

Now read those accounts back in with an optional error handler:

	List<Account> readAccounts = csvProcessor.readAll(csvFile, null /* error handler */);

# ChangeLog Release Notes

See the [ChangeLog.txt file](src/main/javadoc/doc-files/changelog.txt).
