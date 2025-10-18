contact = {}
for i in range(5):
    m = input("Enter your 10-digit mobile number: ")
    if len(m) != 10:
        print("Check your mobile number again")
        continue
    n = input("Enter your name: ")
    contact[m] = n
print(contact)

#Update the data
m = input("Enter your 10 digit mobile number: ")
n = input("Enter your name: ")
if m in contact:
    contact.update({m: n})
else:
    contact[m] = n
print(contact)

#delete the data
m = input("Enter your 10 digit mobile number to delete: ")
if m in contact:
    contact.pop(m)
    print("Contact with number has been deleted")
else:
    print("Number not found in contacts")
print(contact)
