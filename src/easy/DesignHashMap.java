package easy;

public class DesignHashMap {
    static class MyHashMap {
        private ListNode listNodes[];
        private int size = 100000;

        public MyHashMap() {
            listNodes = new ListNode[size];
        }

        public void put(int key, int value) {
            int bucketId = key % size;
            if (listNodes[bucketId] == null)
                listNodes[bucketId] = new ListNode(-1, -1);

            ListNode listNode = listNodes[bucketId];

            while (listNode.next != null) {
                if (key == listNode.next.key) {
                    listNode.next.value = value;
                    return;
                }
                listNode = listNode.next;
            }
            listNode.next = new ListNode(key, value);
        }

        public int get(int key) {
            int bucketId = key % size;
            ListNode listNode = listNodes[bucketId];
            while (listNode != null) {
                if (listNode.key == key) {
                    return listNode.value;
                }
                listNode = listNode.next;
            }
            return -1;
        }

        public void remove(int key) {
            int bucketId = key % size;
            ListNode listNode = listNodes[bucketId];
            if (listNode == null)
                return;
            while (listNode.next != null) {
                if (listNode.next.key == key) {
                    listNode.next = listNode.next.next;
                    break;
                }
            }
        }

        class ListNode {
            int key;
            int value;
            ListNode next;

            public ListNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
