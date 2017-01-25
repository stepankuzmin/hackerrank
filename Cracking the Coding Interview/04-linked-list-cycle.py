# https://www.hackerrank.com/challenges/ctci-linked-list-cycle

def has_cycle(head):
    if head == None:
        return False

    visited = []
    current = head
    while current.next != None:
        if current in visited:
            return True

        visited.append(current)
        current = current.next

    return False
