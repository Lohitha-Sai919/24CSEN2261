def binary_search(arr, target):
    left, right = 0, len(arr) - 1  # Set the left and right bounds

    while left <= right:
        mid = (left + right) // 2  # Find the middle index

        if arr[mid] == target:  # If the middle element is the target
            return mid
        elif arr[mid] < target:  # If the target is larger, search the right half
            left = mid + 1
        else:  # If the target is smaller, search the left half
            right = mid - 1

    return -1  # If not found, return -1

# Example usage
sorted_list = [1, 3, 5, 7, 9, 11, 13]
target = 7

result = binary_search(sorted_list, target)
if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
OUTPUT:
Element found at index 3
CREDITS: CHATGPT


