
#-----------------------------------------------------------
#The United States Social Security Administration publishes
#a list of all documented baby names each year, along with
#how often each name was used for boys and for girls. The
#list is used to see what names are most common in a given
#year.
#
#We've grabbed that data for any name used more than 25
#times, and provided it to you in a file called
#babynames.csv. The line below will open the file:

# ! names_file = open('../resource/lib/public/babynames.csv', 'r')
names_file = open('sample.csv', 'r')
#We've also provided a sample subset of the data in
#sample.csv.
#
#Each line of the file has three values, separated by
#commas. The first value is the name; the second value is
#the number of times the name was given in the 2010s (so
#far); and the third value is whether that count
#corresponds to girls or boys. Note that if a name is
#given to both girls and boys, it is listed twice: for
#example, so far in the 2010s, the name Jamie has been
#given to 611 boys and 1545 girls.
#
# ! Dataset intialization 
import csv
names = csv.reader(names_file)

# * function to return count of babies names starting with least common letter 
def leastCommon(x): 
    c = 0 
    for i in range(len(names)):
        if names[i][0]==x: 
            c += count[i]
            return c

# * Amount of names that start with the most common letter
def common(x):
    c = 0 
    for i in range(len(names)):
        if names[i][0] == x:
            c += count[i];
    return c

# * function to count babies having the same name
def sameName(x):
    c = 0 
    for i in range(len(names)):
        if names[i] == x:
            c += count[i];
    return c

# * Defining smallest difference between genders in the most popular name; requesting gender androgenous names
def smallestDiff():
    dict1 = {}
    m = 999999
    name = ""
    gen = []
    
    for i in range(0,len(names)):
        if names[i] in dict1 and dict1[names[i]][1] != gen[i]:
            if abs(count[i] - dict1[names[i]][1]) < m:
                m = abs(count[i]-dict1[names[i]][1])
                name = names[i]
            else:
                dict1[names[i]] = [gen[i],count[i]]
    return name

#! open file in read mode
file = open("sample.csv", r)
names =[] # list of names
count = [] # list of count
gen = [] # list of gender

for line in file:
    line = line.strip().split(",")
    names.append(line[0])
    count.append(int(line[1]))
    gen.append(line[2])

print(smallestDiff())





