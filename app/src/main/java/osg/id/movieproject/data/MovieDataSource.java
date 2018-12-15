package osg.id.movieproject.data;

import java.util.List;

import osg.id.movieproject.model.Movies;

public interface MovieDataSource {

    void getListMovies(GetListMoviesCallback callBack);

//    void getMoviesDetail(int userId, GetMoviesDetailCallback callback);

    interface GetListMoviesCallback {
        void onSuccess(List<Movies> data);

        void onFailed(String errorMessage);
    }

//    interface GetMoviesDetailCallback {
//        void onSuccess(Movies data);
//
//        void onFailed(String errorMessage);
//    }

}