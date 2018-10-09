def merge(A, B):
    A = [int(a) for a in A]
    B = [int(b) for b in B]
    index_a = 0
    active_a = True
    index_b = 0
    active_b = False
    c = []
    for i in range(0, len(A) + len(B)):
        if active_a * (A[index_a] < B[index_b]) + active_b:
            c.append(A[index_a])
            if index_a < len(A) - 1:
                index_a+=1
            else:
                active_a = False
        else:
            c.append(B[index_b])
            if index_b < len(B) - 1:
                index_b+=1
            else:
                active_b = True
    return c

list0 = input().split()
list1 = input().split()
result = merge(list0, list1)
print(' '.join([str(elmnt) for elmnt in result]))
