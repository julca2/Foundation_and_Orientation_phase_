//to display all the documents in the collection restaurants
db.getCollection("restaurants").find({})

//to display the fields restaurant_id, name, borough and cuisine for all the documents in the collection restaurant
//vyberam konkretne stlpce include =1
db.getCollection("restaurants").find({}, {name:1, borough:1, cuisine:1})

//to display the fields restaurant_id, name, borough and cuisine, but exclude the field _id for all the documents in the collection restaurant.
//davam prec stlpce ktore nechcem =0
db.getCollection("restaurants").find({},{_id:0})

//to display the fields restaurant_id, name, borough and zipcode, but exclude the field _id for all the documents in the collection restaurant.
//vyberam len cast fieldu : address.zipcode, address.building...musi do uvodzoviek

db.getCollection("restaurants").find({}, {name:1, borough:1, restaurant_id:1, "address.zipcode":1})

//to display all the restaurant which is in the borough Bronx.
// ak tam necham za find {} prazdne, vypise mi len to co mu davam, ked to dam prec, vrati vsetky fields
db.getCollection("restaurants").find({},{borough:"Bronx"})

//to display all the restaurant which is in the borough Bronx.
db.getCollection("restaurants").find({borough:"Bronx"})

//to display the first 5 restaurant which is in the borough Bronx
// .limit (nieco ako top v sql)
db.getCollection("restaurants").find({borough:"Bronx"}).limit(5)

//to display the next 5 restaurants after skipping first 5 which are in the borough Bronx
// . skip() - kolko prvych chcem preskocit
db.getCollection("restaurants").find({borough:"Bronx"}).skip(5).limit(5)

//to find the restaurants who achieved a score more than 90
//na filtrovanie pouzivam $gt = greater than, $lt = lower than
db.getCollection("restaurants").find({"grades.score": {$gt: 90}})

//to find the restaurants that achieved a score, more than 80 but less than 100.
db.getCollection("restaurants").find({"grades.score": {$gt: 80, $lt:100}})

//to find the restaurants which locates in latitude value less than -95.754168.
db.getCollection("restaurants").find({"address.coord": {$lt: -95.754168 }})

//to find the restaurants that does not prepare any cuisine of 'American' 
//and their grade score more than 70 and latitude less than -65.754168
db.getCollection("restaurants").find({$and: [{"grades.score": {$gt: 70}}, {"address.coord": {$lt: -65.754168 }}, {cuisine : {$nin: ["American "]}}]})

//to find the restaurants which does not prepare any cuisine of 'American'
// and achieved a score more than 70 and not located in the longitude less than -65.754168
//address coords zmenene z lt na gt
db.getCollection("restaurants").find({$and: [{"grades.score": {$gt: 70}}, {"address.coord": {$gt: -65.754168 }}, {cuisine : {$nin: ["American "]}}]})

//to find the restaurants which does not prepare any cuisine of 'American '
// and achieved a grade point 'A' not belongs to the borough Brooklyn. 
//The document must be displayed according to the cuisine in descending order.
//desc order -1
db.getCollection("restaurants").find({$and: [{"grades.grade": "A"}, {borough : {$nin: ["Brooklyn"]}}, {cuisine : {$nin: ["American "]}}]}).sort({cuisine: -1})


//to find the restaurant Id, name, borough and cuisine for those restaurants which contains 'Wil' as first three letters for its name
//$regex: ^xy ked chcem to co je na zaciatku
db.getCollection('restaurants').find({name: {$regex: "^Wil"}}, {name:1, borough:1, cuisine:1 })

//to find the restaurant Id, name, borough and cuisine for those restaurants which contains 'ces' as last three letters for its name.
//$regex: "xy$" pre to co je na konci
db.getCollection('restaurants').find({name: {$regex: "ces$"}}, {name:1, borough:1, cuisine:1 })

//to find the restaurant Id, name, borough and cuisine for those restaurants which contains 'Reg' as three letters somewhere in its name.
db.getCollection('restaurants').find({name: {$regex: "Reg"}}, {name:1, borough:1, cuisine:1 }) 
db.getCollection('restaurants').find({name: {$regex: ".*Reg.*"}}, {name:1, borough:1, cuisine:1 }) 

//to find the restaurants which belongs to the borough Bronx and prepared either American or Chinese dish
db.getCollection("restaurants").find({$and: [{borough : {$in: ["Bronx"]}}, {cuisine : {$in: ["American ","Chinese"]}}]})

//to find the restaurant Id, name, borough and cuisine for those restaurants which belongs to the borough
// Staten Island or Queens or Bronx or Brooklyn
db.getCollection("restaurants").find({borough : {$in: ["Bronx", "Staten Island", "Queens", "Brooklyn"]}}, {name:1, borough:1, cuisine:1 })


//to find the restaurant Id, name, borough and cuisine for those restaurants which are not belonging to the borough
// Staten Island or Queens or Bronx or Brooklyn.
db.getCollection("restaurants").find({borough : {$nin: ["Bronx", "Staten Island", "Queens", "Brooklyn"]}}, {name:1, borough:1, cuisine:1 })

//to find the restaurant Id, name, borough and cuisine for those restaurants which achieved a score which is not more than 10.
db.getCollection("restaurants").find({"grades.score": {$lt: 10}}, {name:1, borough:1, cuisine:1 })

//to find the restaurant Id, name, borough and cuisine for those restaurants which prepared dish except 
//'American' and 'Chinese' or restaurant's name begins with letter 'Wil'
db.getCollection("restaurants").find({$and: [{name: {$regex: "^Wil"}}, {cuisine : {$nin: ["American ","Chinese"]}}]}, {name:1, borough:1, cuisine:1 })

//to find the restaurant Id, name and grades for those restaurants which achieved a grade of "A"
//and scored 11 on an ISODate "2014-08-11T00:00:00Z" among many of survey dates.
db.restaurants.find( 
                {
                 "grades.date": ISODate("2014-08-11T00:00:00Z"), 
                 "grades.grade":"A" , 
                 "grades.score" : 11
                }, 
                {"restaurant_id" : 1,"name":1,"grades":1}
             )


//to find the restaurant Id, name and grades for those restaurants where 2nd element of grades array
// contains a grade of "A" and score 9 on an ISODate "2014-08-11T00:00:00Z".
db.restaurants.find( 
                {
                 "grades.1.date": ISODate("2014-08-11T00:00:00Z"), 
                 "grades.1.grade":"A" , 
                 "grades.1.score" : 9
                }, 
                {"restaurant_id" : 1,"name":1,"grades":1}
             )


//to find the restaurant Id, name, address and geographical location for those restaurants where 2nd element of coord array
//contains a value which is more than 42 and up to 52.
db.getCollection("restaurants").find({"address.coord.1": { $gt: 42, $lt: 52}})
//to arrange the name of the restaurants in ascending order along with all the columns
db.getCollection("restaurants").find({}).sort({name:1})

//to arrange the name of the restaurants in descending along with all the columns.
db.getCollection("restaurants").find({}).sort({name:-1})

//to arranged the name of the cuisine in ascending order and for those same cuisine borough should be in descending order
db.getCollection("restaurants").find({}).sort({cuisine:1},{borough:-1})

//to know whether all the addresses contains the street or not
db.getCollection("restaurants").find({"address.street":{$exists:true}})

//which will select all documents in the restaurants collection where the coord field value is Double
//
db.getCollection("restaurants").find({"address.coord":{$type:1}})

//which will select the restaurant Id, name and grades for those restaurants which returns 0 as a remainder after dividing the score by 7
db.restaurants.find(
                      {"grades.score" :
                         {$mod : [7,0]}
                      },
                         {"restaurant_id" : 1,"name":1,"grades":1}
                    )

//to find the restaurant name, borough, longitude and latitude and cuisine for those restaurants which contains 'mon' as three letters somewhere in its name
db.getCollection('restaurants').find({name: {$regex: ".*mon.*"}}, {name:1, borough:1, "address.coord":1, cuisine:1 }) 

//to find the restaurant name, borough, longitude and latitude and cuisine for those restaurants which contains 'Mad' as first three letters of its name
db.getCollection('restaurants').find({name: {$regex: "^Mad"}}, {name:1, borough:1, "address.coord":1, cuisine:1 }) 