package osg.id.movieproject.main;

import java.util.List;

import osg.id.movieproject.model.Movies;

public interface MainContract {

    interface View {
        void showProgress();
        void hideProgress();
        void showDataList(List<Movies> moviesList);
        void showFailureMessage(String msg);
    }

    interface Presenter {
        void getDataListMovies();
    }

}
