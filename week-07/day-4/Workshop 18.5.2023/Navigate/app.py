

#Pick 5 movies you really like and create a website where the user can read their short description (you can copy it from a website).
# The website must have the following pages:

#/index: where the movies are listed with their names. Each list items must be a link, which points to a movie specific page.
#/{movie_id}: a page about the given movie, it should have ha heading with the title and a long text with movie's description.
# Each movie specific page can be in a different html file.
#If you have finished the structure then you can play a bit with css to make the site more fancy.


from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)


list_of_movies = {
    1: {'title': 'Snow White and the Seven Dwarfs (1937)', 'link': 'Exiled into the dangerous forest by her wicked stepmother, a princess is rescued by seven dwarf miners who make her part of their household.'},
    2: {'title': 'Finding Nemo (2003)', 'link': 'After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.'},
    3: {'title': 'Shrek (2001)', 'link': 'A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.'},
    4: {'title': 'The Incredibles (2004)', 'link': 'While trying to lead a quiet suburban life, a family of undercover superheroes are forced into action to save the world.'},
    5: {'title': 'Zootopia (2016)', 'link': 'In a city of anthropomorphic animals, a rookie bunny cop and a cynical con artist fox must work together to uncover a conspiracy.'}
}


@app.route('/index')
def list_movies():
    return render_template('index.html', movieDatas=list_of_movies)


@app.route('/title/<int:movie_id>')
def show_movie(movie_id):
    return render_template('movie.html', movieData=list_of_movies[movie_id], key=movie_id)


if __name__ == '__main__':
    app.run()

