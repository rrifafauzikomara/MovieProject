package osg.id.movieproject;

import osg.id.movieproject.data.MovieRepository;
import osg.id.movieproject.data.remote.MovieRemoteDataSource;

public class Injection {

    public static MovieRepository provideRepository() {
        return new MovieRepository(new MovieRemoteDataSource());
    }

}
