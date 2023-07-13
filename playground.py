
names_file = open('names_file.csv', 'r')
import csv
names = csv.reader(names_file)

#initiate list 
baby_list = [] 
for line in names_file:
    line = line.strip().split(",")
    name = line[0]
    count = int(line[1])
    gender = line[2]
    baby_list.append([name, count, gender])

# Find number of vowels at the beginning and end of each name
vowels='AEIOUaeiou'
total_names=0
for data in baby_list:
    if data[0][0] in vowels and data[0][-1] in vowels:
        total_names=total_names + data[1]


print('The total babies were given names that both start and end with vowels(A,E,I,O,or U):'\
      ,total_names)

#What letter is the least common first letter of a baby's name
name_list = {}
for i in range(len(baby_list)):
    fl = list(baby_list[i][0])[0]
    if fl not in name_list.keys():
        name_list[fl] = 1
    else:
        name_list[fl] = int(name_list[fl]) + 1
#What letter is the least common first letter of a baby's name
leastKey = 9999
mostKey = 0
least=''
most=''
print(name_list.keys())
for key in name_list.keys():
    if name_list[key] < leastKey:
        least = key
        leastKey = name_list[key]
    if name_list[key] > mostKey:
        most = key
        mostKey = name_list[key]
print('\nThe letter is the least common first letter of a baby\'s name is: ',least)
#How many babies were born with names starting with that least-common letter?
print('\nNumber of babie names starting with that least-common letter',name_list[least])
#What letter is the most common first letter of a baby's name
print("\nThe letter is the most common first letter of a baby's name is: ",most)
#How many babies were born with names starting with that most-common letter?
print('\nNumber of babie names starting with that most-common letter: ',name_list[most])

#How many people would have that name?
print('\nThe number of people have most common name regardless of gender: ',mostKey)

'''
What name that is used for both genders has the smallest difference in
which gender holds the name most frequently? In case of a tie,
enter any one of the correct answers.
'''
mini = name_list["Isabella"]
name_list = {}
for i in range(len(baby_list)):
    name = baby_list[i][0]
    ctr = baby_list[i][1]
    gndr = baby_list[i][2]
    if name in name_list.keys() and gndr != name_list[name][1]:
        name_list[name] = [int(name_list[name][0]) -1, gndr, 1]
    else:
        name_list[name] = [1, gndr, 0]

for x in name_list.keys():
    if name_list[x][2] == 1 and name_list[x][0] < mini:
        mini = name_list[x][0]
        nme = x
print('Name that is used for both genders has the smallest difference: ',x)
