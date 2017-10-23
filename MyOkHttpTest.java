import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Request;

/*
 * Latest okhttp:
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.Request;
 */

import java.io.IOException;

public class MyOkHttpTest {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

            Response response = client.newCall(request).execute();
            return response.body().string();
    }

    public static void main(String[] args) throws InterruptedException {
        MyOkHttpTest test = new MyOkHttpTest();
        try {
            String response = test.run("https://danweeks.net");
            System.out.println(response);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
