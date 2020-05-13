if __name__ == '__main__':
    list = []
    N = int(input())
    for i in range (N):
        s = input().split()
        command = s[0]
        if command == 'insert':
            list.insert(int(s[1]), int(s[2]))
        elif command == 'print':
            print(list)
        elif command == 'remove':
            list.remove(int(s[1]))
        elif command == 'append':
            list.append(int(s[1]))
        elif command == 'sort':
            list.sort()
        elif command == 'pop':
            list.pop()
        elif command == 'reverse':
            list.reverse()