N = map(int,input().split())
X = list(map(int, input().strip().split(' ')))
W = list(map(int, input().strip().split(' ')))

print(sum(X[g]*W[g] for g in range(len(X))) / sum(W))