# Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
# Also, the URL is missing a crucial component, find out what it is and insert it too!

url = "https//www.reddit.com/r/nevertellmethebots"
colon = ':'
add = url[:5] + colon + url[5:]
new_url = add.replace('bots', 'odds')
url = new_url
print(url)
