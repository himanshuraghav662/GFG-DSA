class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if (head == null) return head;

        // Create a min-heap (Priority Queue) to store the k+1 elements
        PriorityQueue<DLLNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

        DLLNode newHead = null, last = null;
        DLLNode current = head;

        // Add first k+1 elements to the heap
        for (int i = 0; current != null && i <= k; i++) {
            minHeap.add(current);
            current = current.next;
        }

        // Process the list
        while (!minHeap.isEmpty()) {
            // Extract the minimum element from the heap
            DLLNode minNode = minHeap.poll();

            // If this is the first node, set it as new head
            if (newHead == null) {
                newHead = minNode;
                last = newHead;
            } else {
                // Attach the extracted node to the sorted part of the list
                last.next = minNode;
                minNode.prev = last;
                last = minNode;
            }

            // Add the next element from the unsorted list to the heap
            if (current != null) {
                minHeap.add(current);
                current = current.next;
            }
        }

        // Set the next of last node to null (end of the list)
        last.next = null;

        return newHead;
    }
}
