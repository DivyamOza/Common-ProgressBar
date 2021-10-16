# Common-ProgressBar

Common ProgressBar for remove redundancy in Project.

## Installation Process

Please understand the below Classes.


```bash
1) CommonProgressBar.java
-> This is the main Common Class for this functionality.
-> Create a new java file named as "CommonProgressBar.java" in any package or "Utils/Common" package.

2) Create One XML File for the common design of our Common Progress Bar.
-> Here I created "progress_dialog.xml" for reference.
-> Also I created a drawable for rounded white background named "bg_round.xml".
-> If you wants to use my sample progress bar design so paste as per below:
 - res/drawable/bg_round.xml
 - res/layout/bg_round.xml

3) How to use this layout and our common Progress Bar show and dismiss
-> Please refer "UsageOfCommonProgressBar.java"
```

## Usage

```bash
In Any class, 
You want to use this Common Progress bar then follow the below steps as I already mentioned in "UsageOfCommonProgressBar.java"


// Initialize this object before onCreate() 
private final CommonProgressBar progressBar = new CommonProgressBar();

// Whenever you wants to show ProgressBar write down below line with your Activity or Context
progressBar.showProgressBar(YourActivity.this);

// Whenever you wants to dismiss/hide ProgressBar write down below line
progressBar.dismissProgressBar();
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
