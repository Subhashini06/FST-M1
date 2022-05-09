odd_list = [1,3,5,7]
even_list = [2,4,6,8]
final_list = []

for num in odd_list:
    if(odd_list % 2 != 0):
        final_list = odd_list.append(num)
    
for num in even_list:
    if(even_list % 2 == 0):
        final_list = even_list.append(num)

print(final_list)