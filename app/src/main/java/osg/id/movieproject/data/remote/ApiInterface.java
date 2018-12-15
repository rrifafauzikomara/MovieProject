package osg.id.movieproject.data.remote;

import osg.id.movieproject.model.ResponsMovies;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("3/discover/movie")
    Call<ResponsMovies> getAllMovies(@Query("api_key") String api_key,
                                      @Query("language") String language,
                                      @Query("sort_by") String sort_by,
                                      @Query("include_adult") String include_adult,
                                      @Query("include_video") String include_video,
                                      @Query("page") String page );

}
