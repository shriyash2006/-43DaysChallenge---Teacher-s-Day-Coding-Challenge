n = int(input().strip())
heights = list(map(int, input().split()))

max_val = max(heights)
min_val = min(heights)
max_index = 0
for i in range(n):
    if heights[i] == max_val:
        max_index = i
        break
min_index = n - 1
for i in range(n-1, -1, -1):
    if heights[i] == min_val:
        min_index = i
        break

swaps = max_index + (n - 1 - min_index)
if max_index > min_index:
    swaps -= 1

print(swaps)