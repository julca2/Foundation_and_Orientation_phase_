from flask import Flask, jsonify, abort, request, render_template
from functools import wraps
import pyodbc

app = Flask(__name__)
try:
    connect = pyodbc.connect(
        "DRIVER={ODBC Driver 17 for SQL Server};"
        "SERVER=localhost;"
        "DATABASE=GFA_DE;"
        "Trusted_Connection=yes;"
    )

    print('Successfully connected to DB!')

    API_KEY = 'FAKE_SECRET_API_KEY_42069'

    def require_apikey(view_function):
        @wraps(view_function)
        def decorated_function(*args, **kwargs):
            if 'DOG-Service-Api-Key' in request.headers and request.headers['DOG-Service-Api-Key'] == API_KEY:
                return view_function(*args, **kwargs)
            else:
                return jsonify({"message": "Invalid API_KEY"}), 403

        return decorated_function


    movie_database = [
        {'id': 1, 'title': 'Zootopia', 'year': 2016, 'genre': 'Animated','description': 'In a city..'},
        {'id': 2, 'title': 'Snow White and the Seven Dwarfs', 'year': 1937, 'genre': 'Animated', 'description': 'Exiled into the dangerous..'},
        {'id': 3, 'title': 'Shrek', 'year':  2001,'genre':  'Animated', 'description': 'A mean lord exiles ...'}
    ]


    @app.route('/api/movies', methods=['GET'])
    def get_movies():
        return jsonify({'movie': movie_database})


    @app.route('/api/movies/<int:movie_id>', methods=['GET'])
    def get_movie(movie_id):
        movie = [movie for movie in movie_database if movie['id'] == movie_id]
        if not id:
            abort(404)
        return jsonify({'movie': movie[0]})


    @app.route('/api/movies', methods=['POST'])
    @require_apikey
    def create_movie():
        movie = request.json
        if 'title' in movie and 'year' in movie and 'genre' in movie and 'description' in movie:
            movie = {
                'id': movie_database[-1]['id'] + 1,
                'title': request.json['title'],
                'year': request.json['year'],
                'genre': request.json['genre'],
                'description': request.json['description']
            }
            movie_database.append(movie)
            return jsonify({'movie': movie}), 201
        else:
            return "Bad request", 400


    @app.route('/api/movies/<int:movie_id>', methods=['PUT'])
    @require_apikey
    def update_movie(movie_id):
        movie = [movie for movie in movie_database if movie['id'] == movie_id]
        if not movie:
            f"No movie found with {movie_id} ID", 404
        if not request.json:
            "bad request", 400
        modifiedMovie = request.json
        movie[0]['title'] = modifiedMovie.get('title', movie[0]['title'])
        movie[0]['year'] = modifiedMovie.get('year', movie[0]['year'])
        movie[0]['genre'] = modifiedMovie.get('genre', movie[0]['genre'])
        movie[0]['description'] = modifiedMovie.get('description', movie[0]['description'])
        return jsonify({'movie': movie[0]})

    @app.route('/api/movies/<int:movie_id>', methods=['DELETE'])
    def delete_movie(movie_id):
        movie = [movie for movie in movie_database if movie['id'] == movie_id]
        if not movie:
            "not found", 404
        movie_database.remove(movie[0])
        return jsonify({}), 204


    @app.route('/movies')
    def show_movies():
        return render_template('index.html', movieDatas=movie_database)


    @app.route('/edit-movie/<int:movie_id>', methods=['UPDATE'])
    def update_movies():
        return render_template('index.html', movieDatas=movie_database)


    @app.route('/add-movie', methods=['POST'])
    def add_movie():
        return render_template('index.html', movieDatas=movie_database)

    if __name__ == '__main__':
        app.run()

except pyodbc.ProgrammingError as e:
    print(e)
    print('Something wrong with SQL statement')
except pyodbc.InterfaceError as e:
    print('Something is wrong with the driver / wrong DB name')
except pyodbc.OperationalError as e:
    print('SQL connection error')
