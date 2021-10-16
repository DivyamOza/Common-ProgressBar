// Initialize this object before onCreate() 
private final CommonProgressBar progressBar = new CommonProgressBar();

// Whenever you wants to show ProgressBar write down below line with your Activity or Context
progressBar.showProgressBar(YourActivity.this);

// Whenever you wants to dismiss/hide ProgressBar write down below line
progressBar.dismissProgressBar();
