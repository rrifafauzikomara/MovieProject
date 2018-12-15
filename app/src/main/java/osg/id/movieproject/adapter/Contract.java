package osg.id.movieproject.adapter;

import osg.id.movieproject.BuildConfig;

public class Contract {

    public static final String BASE_URL = "https://api.themoviedb.org/";
    public static final String LINK_IMAGE = "http://image.tmdb.org/t/p/w185/";
    public static final String LANG = "en-US";
    public static final String SORT_BY = "popularity.desc";
    public static final String API_KEY = BuildConfig.MOVIE_DB_API_KEY;
    public static final String INCLUDE_ADULT = "false";
    public static final String INCLUDE_VIDEO = "false";
    public static final String PAGE = "1";

}
