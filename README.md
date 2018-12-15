# Movie Project
Aplikasi ini membahas tentang mengambil data movies dari <a href="www.themoviedb.org">The Movie Db</a> untuk di tampilkan di aplikasi android.

### Feature
- Retrofit2
- OkHttp
- Android Architecture
- MVP
- Repository Pattern

### TODO
- Database SQLite + Room
- RxJava
- Dagger

### Petunjuk menjalankan source code aplikasi

Untuk menjalankan source code aplikasi ini, anda perlu registrasi API KEY dari www.themoviedb.org
kemudian memasukkan API KEY yang telah didapat ke dalam file ***gradle.properties***

```
MovieDbApiKey="Masukan API KEY anda disini"
```

Kemudian tambah baris berikut pada file ***build.gradle*** dibawah ***buildTypes***

```
buildTypes.each {
        it.buildConfigField 'String', 'MOVIE_DB_API_KEY', MovieDbApiKey
    }
```

## Author

* **R Rifa Fauzi Komara**

Jangan lupa untuk follow dan ★
