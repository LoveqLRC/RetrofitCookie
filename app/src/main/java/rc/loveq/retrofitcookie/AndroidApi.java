package rc.loveq.retrofitcookie;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Author：Rc
 * 0n 2018/3/20 07:44
 */

public interface AndroidApi {
    String END_POINT = "http://www.wanandroid.com/";

    @POST("/user/login")
    Call<Void> login(@Field("username") String username,
                     @Field("password") String password);
}
