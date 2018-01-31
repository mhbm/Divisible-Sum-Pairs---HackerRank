loop = int(input())

m = {}

def add_word(word):
    for i in range(1, len(word)+1):
        if word[:i] in m:
            m[word[:i]] += 1
        else:
            m[word[:i]] = 1
            
def find_partial(word):
    return m.get(word) or 0

for i in range(loop):
    restaurant = input().split(":")
    if restaurant[0] == "add":
        add_word(restaurant[1])
    else:
        print(find_partial(restaurant[1]))
