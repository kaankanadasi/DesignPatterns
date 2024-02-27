# Arda Edil çözümü:

def harvest_value(patch, start_row, start_col):
    pumpkin_values = {'S': 1, 'M': 5, 'L': 10}

    R = len(patch)
    C = len(patch[0])

   
    def is_valid_position(row, col):
        return 0 <= row < R and 0 <= col < C

    def harvest_dfs(row, col):
        if not is_valid_position(row, col) or patch[row][col] == '*':
            return 0

        value = pumpkin_values.get(patch[row][col], 0)
        patch[row][col] = '*'  #visited

        for dr, dc in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            new_row, new_col = row + dr, col + dc
            value += harvest_dfs(new_row, new_col)

        return value

   
    total_value = harvest_dfs(start_row, start_col)

    return total_value


R = int(input())
C = int(input())

patch = []
for i in range(R):
    row = list(input().strip())
    patch.append(row)

A = int(input())
B = int(input())


result = harvest_value(patch, A, B)
print(result)