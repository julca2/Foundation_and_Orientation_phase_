

#Pick 5 movies you really like and create a website where the user can read their short description (you can copy it from a website).
# The website must have the following pages:

#/index: where the movies are listed with their names. Each list items must be a link, which points to a movie specific page.
#/{movie_id}: a page about the given movie, it should have ha heading with the title and a long text with movie's description.
# Each movie specific page can be in a different html file.
#If you have finished the structure then you can play a bit with css to make the site more fancy.


from flask import Flask, render_template

app = Flask(__name__)


@app.route('/index')
def list_movies():
    return render_template('index.html', movieDatas='movie_id.txt')


@app.route('/title/<int:movie_id>')
def show_movie(movie_id):
    return render_template('movie.html', movieData='movie_id.txt'[movie_id], key=movie_id)


if __name__ == '__main__':
    app.run()
