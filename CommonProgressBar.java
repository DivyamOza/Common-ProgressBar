import android.app.ProgressDialog;
import android.content.Context;

/**
 * Common Progress Bar
 * Created By: Divyam Oza
 */
public class CommonProgressBar {
    ProgressDialog progressDialog;

    /**
     * Method used to show Progress Bar
     *
     * @param ctx
     */
    public void showProgressBar(Context ctx) {
        progressDialog = new ProgressDialog(ctx);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    /**
     * Method used to dismiss Progress Bar
     */
    public void dismissProgressBar() {
        progressDialog.dismiss();
    }
}
