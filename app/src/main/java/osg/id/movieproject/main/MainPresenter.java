package osg.id.movieproject.main;

import java.util.List;

import osg.id.movieproject.data.MovieDataSource;
import osg.id.movieproject.data.MovieRepository;
import osg.id.movieproject.model.Movies;

public class MainPresenter implements MainContract.Presenter {

    private MovieRepository repository;
    private MainContract.View view;

    public MainPresenter (MovieRepository repository, MainContract.View view) {
        this.repository = repository;
        this.view = view;
    }

    @Override
    public void getDataListMovies() {
        view.showProgress();
        repository.getListMovies(new MovieDataSource.GetListMoviesCallback() {
            @Override
            public void onSuccess(List<Movies> data) {
                view.hideProgress();
                view.showDataList(data);
            }

            @Override
            public void onFailed(String errorMessage) {
                view.hideProgress();
                view.showFailureMessage(errorMessage);
            }
        });
    }
}
