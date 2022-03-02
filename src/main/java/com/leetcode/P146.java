package com.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://github.com/antop-dev/algorithm/issues/381
public class P146 {

    static class Item {
        private final int key;
        private int value;
        private Item prev;
        private Item next;

        public Item(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Item head;
    private Item tail;
    private final int capacity;
    private final Map<Integer, Item> map;

    public P146(int capacity) {
        head = null;
        tail = null;
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            // 가져온 아이템을 가장 앞으로 보낸다.
            Item cur = map.get(key);
            if (cur != head) {
                if (cur == tail) {
                    tail = tail.prev;
                }
                // move cur to head
                if (cur.prev != null) cur.prev.next = cur.next;
                if (cur.next != null) cur.next.prev = cur.prev;
                cur.next = head;
                head.prev = cur;
                cur.prev = null;
                head = cur;
            }
            return cur.value;
        }
    }

    public void put(int key, int value) {
        if (get(key) == -1) { // insert
            Item cur = new Item(key, value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                cur.next = head;
                head.prev = cur;
                head = cur;
            }

            map.put(key, cur);

            if (map.size() > capacity) { // 꼬리 삭제
                map.remove(tail.key);
                tail.prev.next = null;
                tail = tail.prev;
            }

        } else { // update
            map.get(key).value = value;
        }
    }

}
