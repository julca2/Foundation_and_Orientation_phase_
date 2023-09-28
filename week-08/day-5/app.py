from flask import Flask, jsonify, request
import pymssql
from functools import wraps

app = Flask(__name__)
API_KEY = 'key54'




try:

    conn = pymssql.connect(host='localhost:1433', user='sa', password='Password123', database='test_GFA')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM test_itemsDB")
    rows = cursor.fetchall()

    test_list = []
    #test list a do neho pridavat tieto dictionary

    for row in rows:
        product = {}
        product['id'] = row[7]
        product['name'] = row[0]
        product['price'] = row[2]
        product['type'] = row[3]
        product['featured'] = row[4]
        product['visibility'] = row[5]
        product['description'] = row[6]
        test_list.append(product)

    print(test_list)


    def require_apikey(view_function):
        @wraps(view_function)
        def decorated_function(*args, **kwargs):
            if 'Products-api-key' in request.headers and request.headers['Products-api-key'] == API_KEY:
                return view_function(*args, **kwargs)
            else:
                return jsonify({"message": "Invalid API_KEY"}), 403

        return decorated_function

    @app.route('/api/products', methods=['GET'])
    def show_all_items():
        return jsonify({'product': test_list})


#    @app.route('/api/products/products?type=', methods=['GET'])
#    def show_filtered_items():
#        product = [product for product in test_dictionary if product['type'] == product_id]
#        return jsonify({'products': 'name of dict'})


    @app.route('/api/products/<int:product_id>', methods=['GET'])
    def get_product(product_id):
        product = [product for product in test_list if product['id'] == product_id]
        print(len(product))
        if not product:
            "not found", 404
        return jsonify({'product': product[0]})


    @app.route('/api/products', methods=['POST'])
    @require_apikey
    def add_item():
        product = request.json
        if 'name' in product and 'price' in product and 'type' in product and 'featured' in product and 'visibility' in product and 'description' in product:
            product = {
                'name': request.json['name'],
                'price': request.json['price'],
                'type': request.json['type'],
                'featured': request.json['featured'],
                'visibility': request.json['visibility'],
                'description': request.json['description'],
                'id': len(test_list) + 1,
            }
            test_list.append(product)
            return jsonify({'product': product}), 200
        else:
            return 'Bad request', 400


    @app.route('/api/products/<int:product_id>', methods=['PUT'])
    @require_apikey
    def update_item(product_id):
        product = [product for product in test_list if product['id'] == product_id]
        if not product:
            f"No product found with {product_id} ID", 404
        if not request.json:
            'error: Invalid API_KEY', 403
        modifiedProduct: request.json
        product[0]['name'] = modifiedProduct.get('name', product[0]['name'])
        product[0]['price'] = modifiedProduct.get('price', product[0]['price'])
        product[0]['type'] = modifiedProduct.get('year', product[0]['type'])
        product[0]['featured'] = modifiedProduct.get('featured', product[0]['featured'])
        product[0]['visibility'] = modifiedProduct.get('visibility', product[0]['visibility'])
        product[0]['description'] = modifiedProduct.get('description', product[0]['description'])
        return jsonify({'product': product[0]}), 200


    @app.route('/api/products/<int:product_id>', methods=['DELETE'])
    @require_apikey
    def delete_item(product_id):
        product = [product for product in test_list if product['id'] == product_id]
        if not product:
            f"No product found with {product_id} ID", 404
        test_list.remove(product[0])
        return jsonify({}), 200


except pymssql.ProgrammingError as e:
    print(e)
    print('Something wrong with SQL statement')
except pymssql.InterfaceError as e:
    print('Something is wrong with the driver / wrong DB name')
except pymssql.OperationalError as e:
    print('SQL connection error')
finally:
    print('Connection closed')


if __name__ == '__main__':
    app.run(debug=True)

