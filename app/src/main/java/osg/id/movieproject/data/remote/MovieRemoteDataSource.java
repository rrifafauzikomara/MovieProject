package osg.id.movieproject.data.remote;

import android.support.annotation.NonNull;

import osg.id.movieproject.adapter.Contract;
import osg.id.movieproject.data.MovieDataSource;
import osg.id.movieproject.model.ResponsMovies;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRemoteDataSource implements MovieDataSource {

    private ApiInterface apiInterface =  ApiClient.getClient().create(ApiInterface.class);

    @Override
    public void getListMovies(final GetListMoviesCallback callBack) {
        Call<ResponsMovies> call = apiInterface.getAllMovies(Contract.API_KEY, Contract.LANG, Contract.SORT_BY, Contract.INCLUDE_ADULT, Contract.INCLUDE_VIDEO, Contract.PAGE);
        call.enqueue(new Callback<ResponsMovies>() {
            @Override
            public void onResponse(@NonNull Call<ResponsMovies> call, @NonNull Response<ResponsMovies> response) {
                assert response.body() != null;
                callBack.onSuccess(response.body().getMovies());
            }

            @Override
            public void onFailure(@NonNull Call<ResponsMovies> call, @NonNull Throwable t) {
                callBack.onFailed(t.toString());
            }
        });
    }

//    @Override
//    public void getMoviesDetail(int userId, GetMoviesDetailCallback callback) {
//
//    }
}