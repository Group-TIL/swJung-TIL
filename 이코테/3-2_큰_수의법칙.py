n, m, k = map(int, input().split())
lst = list(map(int, input().split()))
ans = 0
max_num = max(lst)
max_idx = lst.index(max_num)
while m > 0:
    for _ in range(k):
        if m <= 0:
            break
        ans += max_num
        m -= 1
    if m <= 0:
        break
    try:
        max_num = max(lst[max_idx+1:])
        max_idx = lst.index(max_num)
    except:
        max_num = max(lst)
        max_idx = lst.index(max_num)
print(ans)

# time complexity O(mn^2)
