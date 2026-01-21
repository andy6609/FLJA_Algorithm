s = input().strip()

result = int(s[0])

""" 처음에는 문자열을 바로 숫자로 바꾸려고 했음. 예를 들어서 "02984" 가 있으면 바로 int() 로 
숫자로 바꾸려고 했지만 그러면 한 덩어리의 숫자가 돼서 그냥 for _ in _ 으로 하나씩 뽑아서 
그걸 비교 하기로 했다"""
for ch in s[1:]:
    digit = int(ch)

    if result <= 1 or digit <= 1:
        result += digit
    else:
        result *= digit

print(result)


# 첫 번째 숫자는 연산 없이 그대로 시작값으로 사용
# 두 번째 문자부터 하나씩 처리

    # 둘 중 하나라도 0 또는 1이면 더하는 것이 유리